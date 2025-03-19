public class chapter3 {
    public static void IF(){ 
        int num = 10;
        if (num > 0) { 
            System.out.println("Positive number");
        } 
    } 

    public static void IFELSE(){
        int num = -5; 
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    // switch 
    public static void Switch(){
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }


    public static void main(String[] args) {

       IF(); 
       IFELSE();
       Switch();

       // nested if-else
       int marks = 85;

       if (marks >= 90) {
           System.out.println("Grade A");

       } else if (marks >= 80) {
           System.out.println("Grade B");

       } else if (marks >= 70) {
           System.out.println("Grade C");
           
       } else {
           System.out.println("Fail");
       }


    }
}
