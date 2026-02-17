package PracticeJavaPart1;

public class basic1 {
    static class User{
        int id;
    }
    // ex2
    static class Car{
        String name;
        int price;
        Car(String name, int price){
            this.name = name;
            this.price = price;
        }
    }

    // ex3 interface
    public interface Animal {
       void sound();
    }

    static class Dog implements Animal{
        public void sound(){
            System.out.println("Bark");
        }
    }

    // example 4
    // Wrapper class


    public static void main(String[] args) {
        System.out.println("Hello");

        User u = new User();
        u.id = 101;
        System.out.println(u.id);

        Car c = new Car("BMW", 100000);
        System.out.println(c.name + " " + c.price);

        // interface
        Animal a = new Dog();
        a.sound();

          // example 4
         // Wrapper class
         Integer x = Integer.valueOf(10);
         System.out.println(x);

         Integer y = Integer.parseInt("123");
         System.out.println(y);
    }
}
