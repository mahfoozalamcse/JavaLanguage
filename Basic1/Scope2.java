package Basic1;

public class Scope2 {
    public static void main(String[] args) {
        // for(int x=0; x<5; x++){
        //     System.out.println(x);
        // } 
        // give error
        // System.out.println(x);


        // give error re initialize global variable

        // int x;
        // for(int x=0; x<4; x++){
        //     System.out.println(x);
        // }

        //corrected code above
        // int x;
        // for(x=0; x<3; x++){
        //     System.out.println(x);
        // }


        // guess output
        // proper work not give error 
        // for(int x=0; x<5; x++){
        //     System.out.println(x);
        // }
        // int x = 10;
        // System.out.println(x);


        // give error duplicate variable

        // int y=7;
        // for(int y=0; y<7; y++){
        //     System.out.println(y);
        // }


        // give error
        
        // int z=0;
        // {
        //     int z= 2;
        //     System.out.println(z);
        // }






    }
}
