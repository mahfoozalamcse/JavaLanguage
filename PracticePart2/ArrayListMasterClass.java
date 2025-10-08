package PracticePart2;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class ArrayListMasterClass {
   
/**
 * ArrayListMasterclass - demonstrates ArrayList internals, usage patterns,
 * pitfalls (ConcurrentModificationException), thread-safety options, and common interview problems.
 */

    // Simple DynamicArray<T>
    
    // A trimmed-down dynamic array implementation for demonstration.

    public static class DynamicArray<T> implements Iterable<T> {
        private Object[] elements;
        private int size;
        private int modCount; // for fail-fast iterator

        private static final int DEFAULT_CAPACITY = 10;

        public DynamicArray() {
            this.elements = new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }

        public DynamicArray(int initialCapacity) {
            if (initialCapacity < 0) throw new IllegalArgumentException("Negative capacity");
            this.elements = new Object[Math.max(initialCapacity, DEFAULT_CAPACITY)];
            this.size = 0;
        }

        public int size() { return size; }
        public boolean isEmpty() { return size == 0; }

        @SuppressWarnings("unchecked")
        public T get(int index) {
            rangeCheck(index);
            return (T) elements[index];
        }

        @SuppressWarnings("unchecked")
        public T set(int index, T element) {
            rangeCheck(index);
            T old = (T) elements[index];
            elements[index] = element;
            return old;
        }

        public void add(T element) {
            ensureCapacityInternal(size + 1);
            elements[size++] = element;
            modCount++;
        }

        public void add(int index, T element) {
            if (index < 0 || index > size) throw new IndexOutOfBoundsException(index + " out of " + size);
            ensureCapacityInternal(size + 1);
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
            modCount++;
        }

        @SuppressWarnings("unchecked")
        public T removeAt(int index) {
            rangeCheck(index);
            T old = (T) elements[index];
            int numMoved = size - index - 1;
            if (numMoved > 0) System.arraycopy(elements, index + 1, elements, index, numMoved);
            elements[--size] = null; // help GC
            modCount++;
            return old;
        }

        public boolean remove(T element) {
            for (int i = 0; i < size; i++) {
                if (Objects.equals(elements[i], element)) {
                    removeAt(i);
                    return true;
                }
            }
            return false;
        }

        public void clear() {
            Arrays.fill(elements, 0, size, null);
            size = 0;
            modCount++;
        }

        public void ensureCapacity(int minCapacity) {
            ensureCapacityInternal(minCapacity);
        }

        public void trimToSize() {
            if (size < elements.length) {
                elements = Arrays.copyOf(elements, size);
                modCount++;
            }
        }

        private void ensureCapacityInternal(int minCapacity) {
            if (minCapacity - elements.length > 0) grow(minCapacity);
        }

        private void grow(int minCapacity) {
            int oldCapacity = elements.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1); // 1.5x
            if (newCapacity - minCapacity < 0) newCapacity = minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
            // modCount not changed here; structure change via add/remove updates modCount
        }

        private void rangeCheck(int index) {
            if (index < 0 || index >= size) throw new IndexOutOfBoundsException(index + " out of " + size);
        }

        @Override
        public Iterator<T> iterator() {
            return new Itr();
        }

        private class Itr implements Iterator<T> {
            private int cursor = 0;
            private int expectedModCount = modCount;
            private boolean canRemove = false;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @SuppressWarnings("unchecked")
            @Override
            public T next() {
                checkForComodification();
                if (cursor >= size) throw new NoSuchElementException();
                canRemove = true;
                return (T) elements[cursor++];
            }

            @Override
            public void remove() {
                if (!canRemove) throw new IllegalStateException();
                checkForComodification();
                // remove element at cursor-1
                DynamicArray.this.removeAt(--cursor);
                expectedModCount = modCount; // update after structural change
                canRemove = false;
            }

            final void checkForComodification() {
                if (modCount != expectedModCount)
                    throw new ConcurrentModificationException();
            }
        }

        // Convert to standard ArrayList for convenience
        public ArrayList<T> toArrayList() {
            ArrayList<T> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                @SuppressWarnings("unchecked")
                T e = (T) elements[i];
                list.add(e);
            }
            return list;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < size; i++) {
                sb.append(elements[i]);
                if (i != size - 1) sb.append(", ");
            }
            sb.append(']');
            return sb.toString();
        }
    }

    
    // Examples & Interview patterns
   

    // Example: basic usage of java.util.ArrayList features and common loops
    static void exampleBasicArrayListUsage() {
        System.out.println("  Basic ArrayList usage ");
        ArrayList<String> a = new ArrayList<>();            // default capacity 10
        a.add("Alice");
        a.add("Bob"); 
        a.add("Charlie");
        System.out.println("List: " + a);
        System.out.println("get(1): " + a.get(1));

        a.add(1, "Zoe"); // insert

        System.out.println("After insert at 1: " + a);
        a.remove("Bob");
        System.out.println("After remove Bob: " + a);
        a.set(0, "Alicia");
        System.out.println("After set(0): " + a);
        System.out.println("Iterate (index):");

        for (int i = 0; i < a.size(); i++) {
            System.out.println("  " + i + " -> " + a.get(i));
        }
        
        System.out.println("Iterate (iterator):");
        for (String s : a) System.out.println("  " + s);
        System.out.println();
    }

    // Demonstrate ConcurrentModificationException and how to avoid it
    static void exampleConcurrentModification() {
        System.out.println(" ConcurrentModificationException ");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        try {
            for (Integer n : nums) {
                if (n == 3) nums.remove(n); // <-- will throw ConcurrentModificationException
            }
        } catch (ConcurrentModificationException cme) {
            System.out.println("Caught CME while modifying during enhanced-for-loop (expected).");
        }
        // Correct ways:
        // 1) Use iterator.remove()
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Iterator<Integer> it = nums2.iterator();
        while (it.hasNext()) {
            if (it.next() == 3) it.remove(); // safe
        }
        System.out.println("Removed with iterator: " + nums2);

        // 2) Use removeIf (since Java 8)
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        nums3.removeIf(x -> x == 3);
        System.out.println("Removed with removeIf: " + nums3);

        // 3) Use index-based loop backward
        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (int i = nums4.size() - 1; i >= 0; i--) {
            if (nums4.get(i) == 3) nums4.remove(i);
        }
        System.out.println("Removed with reverse index loop: " + nums4);
        System.out.println();
    }

    // Thread-safety options demonstration
    static void exampleThreadSafety() {
        System.out.println("=== Thread-safety options ===");
        List<Integer> plain = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        CopyOnWriteArrayList<Integer> cow = new CopyOnWriteArrayList<>();

        // CopyOnWriteArrayList characteristics:
        // - Iterators iterate over snapshot, safe from concurrent modification
        // - Writes are expensive (copy whole array)
        cow.add(1); cow.add(2);
        for (Integer x : cow) {
            cow.add(3); // allowed, won't cause CME
            break;
        }
        System.out.println("COW size after concurrent-like modification: " + cow.size());

        // Collections.synchronizedList: need to synchronize manually when iterating
        syncList.add(10); syncList.add(20);
        synchronized (syncList) {
            Iterator<Integer> it = syncList.iterator();
            while (it.hasNext()) System.out.println("  syncList iter: " + it.next());
        }
        System.out.println();
    }

    // Example: convert ArrayList to array and note boxing cost
    static void exampleToArrayAndBoxing() {
        System.out.println("  toArray and boxing ");
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            a.add(i);
        }

        Object[] objArr = a.toArray();
        System.out.println("Object[] length: " + objArr.length);
        Integer[] intArr = a.toArray(new Integer[0]); // preferred
        System.out.println("Integer[]: " + Arrays.toString(intArr));
        System.out.println("Note: using ArrayList<Integer> vs int[] has boxing/unboxing overhead.");
        System.out.println();
    }

    
   
    
    // Problem 1: Two-sum returning indices (classic)
    // Uses HashMap for O(n) solution; uses ArrayList to build input/return demonstration.
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    static void exampleTwoSum() {
        System.out.println("=== Two-Sum example ===");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,7,11,15));
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        int[] res = twoSum(arr, 9);
        System.out.println("Indices: " + Arrays.toString(res) + " values: [" + arr[res[0]] + ", " + arr[res[1]] + "]");
        System.out.println();
    }

    // Problem 2: Merge intervals (classic use of ArrayList for output)
    static class Interval { 
        int s,e; Interval(int s,int e){
        this.s=s;this.e=e;} 
        public String toString(){
            return "["+s+","+e+"]";
        }
    }
    static List<Interval> mergeIntervals(List<Interval> intervals) {

        if (intervals == null || intervals.isEmpty()) return Collections.emptyList();
        intervals.sort(Comparator.comparingInt(a -> a.s));
        ArrayList<Interval> res = new ArrayList<>();
        Interval prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval cur = intervals.get(i);
            if (cur.s <= prev.e) {
                prev.e = Math.max(prev.e, cur.e);
            } else {
                res.add(prev);
                prev = cur;
            }
        }
        res.add(prev);
        return res;
    }

    static void exampleMergeIntervals() {

        System.out.println("  Merge Intervals example ");
        List<Interval> in = Arrays.asList(new Interval(1,3),
                                        new Interval(2,6),
                                        new Interval(8,10),
                                        new Interval(15,18));

        List<Interval> out = mergeIntervals(new ArrayList<>(in));
        System.out.println("Merged: " + out);
        System.out.println();
    }

    // Problem 3: Generate permutations (backtracking using ArrayList)
    static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrackPermute(nums, used, cur, res);
        return res;
    }

    static void backtrackPermute(int[] nums, boolean[] used, ArrayList<Integer> cur, List<List<Integer>> res) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            cur.add(nums[i]);
            backtrackPermute(nums, used, cur, res);
            cur.remove(cur.size()-1);
            used[i] = false;
        }
    }

    static void examplePermutations() {
        System.out.println(" Permutations example ");
        int[] nums = {1,2,3};
        List<List<Integer>> perms = permute(nums);
        System.out.println("Permutations: " + perms);
        System.out.println();
    }

    // Problem 4: Longest subarray with sum <= k (for non-negative integers) - sliding window using list-like operations
    static int maxSubarrayLenAtMostK(int[] arr, int k) {
        int left = 0, sum = 0, best = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (left <= right && sum > k) sum -= arr[left++];
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    static void exampleSlidingWindow() {
        System.out.println("=== Sliding window example ===");
        int[] arr = {1,2,1,0,1,1,0};
        int k = 3;
        System.out.println("Max subarray len with sum <= " + k + ": " + maxSubarrayLenAtMostK(arr, k));
        System.out.println();
    }

    // Problem 5: Using ArrayList as stack/queue - discuss pros/cons
    static void exampleStackQueue() {

        System.out.println("=== ArrayList as Stack/Queue ===");
        ArrayList<Integer> list = new ArrayList<>();
        // Stack: push/pop at end -> efficient
        list.add(1); list.add(2); list.add(3);
        int top = list.remove(list.size() - 1); // pop
        System.out.println("Popped from end (stack): " + top + ", remaining: " + list);
        // Queue: remove(0) is O(n) -> prefer ArrayDeque for queue semantics
        list.add(4); list.add(5);
        int front = list.remove(0);
        System.out.println("Removed from front (queue) with ArrayList - O(n): " + front + ", remaining: " + list);
        System.out.println("Better: use ArrayDeque for queue (amortized O(1) ops).");
        System.out.println();
    }

    // Demonstration: using our DynamicArray
    static void exampleDynamicArray() {
        System.out.println(" DynamicArray (custom) demonstration ");
        DynamicArray<String> da = new DynamicArray<>(2);

        da.add("one"); 
        da.add("two"); 
        da.add("three");

        System.out.println("Custom dynamic array: " + da + " size=" + da.size());

        for (String s : da) {
            System.out.println("  iter -> " + s);
        }

        // remove during iterator
        Iterator<String> it = da.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if ("two".equals(s)) it.remove(); // safe removal
        }
        System.out.println("After remove via iterator: " + da);
        System.out.println();
    }

    //
    // Performance / memory notes (printed)
    //
    static void printPerformanceNotes() {

        System.out.println("  Performance & memory notes ");
        System.out.println("- get/set: O(1) random access");
        System.out.println("- add (end): amortized O(1) because of geometric resizing");
        System.out.println("- add(index) / remove(index): O(n) due to shifting");
        System.out.println("- iterating with index is slightly faster than iterator for primitive-heavy loops (less object churn)");
        System.out.println("- Use ensureCapacity(n) if you know expected size to avoid repeated resizing");
        System.out.println("- Avoid ArrayList<Integer> for huge numeric arrays due to boxing; use int[] or specialized libs");
        System.out.println("- For multi-threaded readers and infrequent writers: CopyOnWriteArrayList is good");
        System.out.println("- For synchronized access: Collections.synchronizedList(list) but synchronize while iterating");
        System.out.println();
    }

    // 
    // main: run all examples
    // 
    public static void main(String[] args) {
        System.out.println("ArrayList Masterclass - examples & interview patterns\n");

        exampleBasicArrayListUsage();
        exampleConcurrentModification();
        exampleThreadSafety();
        exampleToArrayAndBoxing();
        exampleTwoSum();
        exampleMergeIntervals();
        examplePermutations();
        exampleSlidingWindow();
        exampleStackQueue();
        exampleDynamicArray();
        printPerformanceNotes();

        // small interactive demo of two-sum using ArrayList input
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 2, 4));

        int[] arr = input.stream().mapToInt(Integer::intValue).toArray();
        int[] res = twoSum(arr, 6);

        System.out.println("interactive two-sum on " + input + " target 6 -> indices " + Arrays.toString(res));

        System.out.println("\nDone. Read comments in the source for deeper notes you can quote in interviews.");
    }
}


