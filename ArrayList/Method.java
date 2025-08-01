package ArrayList;

import java.util.ArrayList;

public class Method {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("mahfooz");
        arr.add("alam");
        arr.add("noida");
        System.out.println(arr);

       System.out.println(arr.remove(1));
       System.out.println(arr.contains("alam"));

       System.out.println(arr.get(1));
       arr.set(0, "Noida");
       System.out.println(arr);

       System.out.println(arr.indexOf("noida"));
       arr.clear();
       System.out.println(arr.isEmpty());

       ArrayList<Integer> al = new ArrayList<>();
       for(int i=0; i<100; i++){
          al.add(i);
       }
       System.out.println(al);
    }
}
