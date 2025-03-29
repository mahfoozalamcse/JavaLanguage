public class chapert4 { 
    public static void FORLOOP(){
        for (int i = 1; i <= 5; i++) { 
            System.out.println("Hello " + i);
        }
    } 
   
    public static void WHILE(){
        int i = 1;  
        while (i <= 5) {
            System.out.println("Hello " + i);
            i++;
        }  
    }

    public static void DOWHILELOOP(){
        int i = 1;
        do {
            System.out.println("Hello " + i);
            i++;
        } while (i <= 5); 
    }


    // Branching statement

    public static void BREAK(){
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Stops when i = 5
            }
            System.out.println(i);
        }   
    }

    public static void CONTINUE(){

        for (int i = 1; i <= 5; i++) {
            
            if (i == 3) {
                continue; // Skips when i = 3
            }
            System.out.println(i);
        }
    }

    
    public static void main(String[] args) {
     FORLOOP();
     WHILE();
     DOWHILELOOP();
     BREAK();
     CONTINUE();
     
    }
}
