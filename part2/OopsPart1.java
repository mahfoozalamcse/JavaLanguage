package part2;

public class OopsPart1 {
    // class
    static class Student{
        int id;
        String name;

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }
        
    }

    // Default constructor
    // Parameterized constructor
    // Copy constructor
    

    

   public static void main(String[] args) {
    Student s = new Student(1, "John");
    System.out.println(s.name);
   } 
}
