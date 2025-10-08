package AdvanceJava2;

public class ExceptionHandling {
    //1.  syntex

    // try {
    //  code that might throw exception
    // } catch (ExceptionType e) {
    //    handling code
    // } finally {
    //  code that always executes
    // }


    // 2. try catch
    // public static void main(String[] args) {
    //     try {
    //         int result = 10 / 0;
    //         System.out.println(result);
    //     } catch (ArithmeticException e) {
    //         System.out.println(" Cannot divide by zero: " + e.getMessage());
    //     } finally {
    //         System.out.println(" Finally block always runs!");
    //     }
    // }

    // 3. multiple try catch
    //    public static void main(String[] args) {
    //     try {
    //         int[] arr = {1, 2, 3};
    //         System.out.println(arr[4]);  // error
    //     } catch (ArithmeticException e) {
    //         System.out.println("Math error!");
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Index error!");
    //     } catch (Exception e) {
    //         System.out.println("General error!");
    //     }
    // }



    // 4. nested try block
    //  public static void main(String[] args) {
    //     try {
    //         int a = 10 / 2;
    //         try {
    //             int[] arr = {1, 2, 3};
    //             System.out.println(arr[5]);
    //         } catch (ArrayIndexOutOfBoundsException e) {
    //             System.out.println("Inner catch: " + e.getMessage());
    //         }
    //     } catch (ArithmeticException e) {
    //         System.out.println("Outer catch: " + e.getMessage());
    //     }
    // }



    // 5. throw and throws
    /* 
     static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible to vote!");
        else
            System.out.println("You can vote!");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
   */


    // custom exception
   
}



