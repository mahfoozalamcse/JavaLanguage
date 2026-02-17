package PracticePart2;

public class Encapsulation {

//     // syntex
//     class  ClassName{
//     // Step 1: Private Data Members
//     private int data;

//     // Step 2: Getter (to access data)
//     public int getData() {
//         return data;
//     }

//     // Step 3: Setter (to modify data)
//     public void setData(int data) {
//         this.data = data;
//     }
//    }



   // implementaion basic


    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter with validation
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

   
    // Setter with validation
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }

   

    // encapsulation with validation
      private double balance;

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Invalid withdrawal");
    }


    
    
    public static void main(String[] args) {
        // Encapsulation s = new Encapsulation();
        // s.setName("Mahfooz");
        // s.setAge(25);

        // System.out.println("Student Name: " + s.getName());
        // System.out.println("Student Age: " + s.getAge()); 



        // Encapsulation with validation driver
         Encapsulation acc = new Encapsulation();
         acc.deposit(1000);
         acc.withdraw(300);

        System.out.println("Current Balance: " + acc.getBalance());


       
    }
}
