package PracticePart2;

public class basic1 {
    // Variables and Primitive DataTypes
    public static void variables(){
        byte age = 25;
        short salary = 20000;
        int population = 1400000000;
        long distance = 9876543210L;

        float height = 5.9f;
        double price = 12345.6789;

        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        System.out.println("Height: " + height);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
    }

    // Class and Object
    static class Student {
       String name;
       int age;

    }

    // 

    public static void main(String[] args) {
        // System.out.println("Hello.. ");
        // variables();


        // class and object
        // Student s1 = new Student(); // object creation
        // s1.name = "Mahfooz";
        // s1.age = 22;

        // System.out.println(s1.name + " - " + s1.age);

        // string
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println(s1 + " " + s2);

        // Array
        int[] marks = {90, 80, 70};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Total subjects: " + marks.length);



    }
}
