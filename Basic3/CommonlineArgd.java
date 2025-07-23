package Basic3;

public class CommonlineArgd {
    public static void main(String[] args) {
        System.out.println();
        if (args.length > 0) {
            System.out.println("Argument are : ");
            for(String x : args)
                 System.out.print(" "+x);
        }else{
            System.out.println("No Argument : ");
        }
    }
}
