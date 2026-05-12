package part2;

public class memory {
   
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();

        System.out.println("Total Memory: " + r.totalMemory());
        System.out.println("Free Memory: " + r.freeMemory());
        System.out.println("Max Memory: " + r.maxMemory());
    }
}

