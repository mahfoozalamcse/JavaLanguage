package PracticePart2;
import java.util.*;


public class OOPComplete {
    
    
    /**
     * 
     * 15 examples covering:
     * - class & object
     * - constructors (+ overloading, chaining)
     * - this reference
     * - instance vs static members
     * - access specifiers
     * - static initializer / block
     * - final (variables, methods, classes)
     * - nested classes, inner classes, anonymous classes
     * - immutable class, singleton, copy constructor, init order
     *
     * 
     */
    
    
        public static void main(String[] args) {
            System.out.println("=== OOP Complete — 15 Examples ===\n");
    
            example1_classObject();
            example2_constructors();
            example3_thisReference();
            example4_constructorChaining();
            example5();
            example6();
            example7_staticInitializerAndUtility();
            example8_finalVariablesAndReferences();
            example9_finalMethodAndFinalClass();
            example10();
            example11();
            example12_singletonPattern();
            example13_copyConstructorDeepCopy();
            example14_anonymousClassAndLambda();
            example15();
    
            System.out.println("\n=== End of Examples ===");
            
        }
    
        // Example 1
        // Simple class & object demonstration
        static void example1_classObject() {
            System.out.println("1) Class & Object:");
            Person p = new Person("Alice", 28);
            p.introduce(); // call instance method
            System.out.println();
        }
    
        static class Person {
            private String name;
            private int age;
    
            // method
            void introduce() {
                System.out.println("Hi, I'm " + name + ", age " + age);
            }
    
            // constructor
            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
    
        // Example 2 
        // Constructors: default, parameterized, overloading
        static void example2_constructors() {
            System.out.println("2) Constructors and Overloading:");
            Point defaultPoint = new Point();           // default constructor
            Point p2 = new Point(5, 10);                // parameterized
            Point p3 = new Point(7);                    // overloaded
            System.out.println("defaultPoint: " + defaultPoint);
            System.out.println("p2: " + p2);
            System.out.println("p3: " + p3);
            System.out.println();
        }
    
        static class Point {
            int x, y;
            Point() { this(0,0); }                      // delegates to two-arg
            Point(int x, int y) { this.x = x; this.y = y; }
            Point(int x) { this(x, 0); }                // overloaded
            public String toString() { return "(" + x + "," + y + ")"; }
        }
    
        // Example 3
        // this reference (field disambiguation and chaining)
        static void example3_thisReference() {
            System.out.println("3) this reference & method chaining:");
            Employee emp = new Employee("Bob", 3000);
            emp.setSalary(3500).increaseSalaryPct(10);
            emp.printInfo();
            System.out.println();
        }
    
        static class Employee {
            private String name;
            private double salary;
    
            Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
    
            // return this for chaining
            Employee setSalary(double salary) {
                this.salary = salary; // disambiguation
                return this;
            }
    
            Employee increaseSalaryPct(double pct) {
                this.salary *= (1 + pct/100.0);
                return this;
            }
    
            void printInfo() {
                System.out.printf("Employee %s, salary=%.2f%n", name, salary);
            }
        }
    
        // Example 4 
        // Constructor chaining (this(...))
        static void example4_constructorChaining() {
            System.out.println("4) Constructor chaining (this(...)):");
            Rectangle r1 = new Rectangle();                 // uses default -> chained
            Rectangle r2 = new Rectangle(3,4);
            System.out.println("r1: " + r1);
            System.out.println("r2: " + r2);
            System.out.println();
        }
    
        static class Rectangle {
            int w, h;
            Rectangle() { this(1,1); }                      // chain to two-arg
            Rectangle(int side) { this(side, side); }
            Rectangle(int w, int h) { this.w = w; this.h = h; }
            public String toString() { return "Rectangle(" + w + "x" + h + ")"; }
        }
    
        // Example 5
        // static vs instance members
        static void example5() {
            System.out.println("5) static vs instance members:");
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            System.out.println("c1.id=" + c1.id + ", c2.id=" + c2.id + ", c3.id=" + c3.id);
            System.out.println("Total created (static): " + Counter.totalCreated);
            System.out.println();
        }
    
        static class Counter {
            static int totalCreated = 0;     // static shared across instances
            int id;                         // instance field
            Counter() {
                totalCreated++;
                id = totalCreated;
            }
        }
    
        // Example 6 
        // access specifiers and encapsulation (public, private, protected, default)
        static void example6() {
            System.out.println("6) Access specifiers & encapsulation:");
    
            BankAccount acct = new BankAccount("ACC1001", 500);
            acct.deposit(200);
            boolean success = acct.withdraw(1000);
            System.out.println("Balance after ops: " + acct.getBalance() + " (withdraw success? " + success + ")");
    
            // protected access via subclass
            Manager mgr = new Manager("M1");
            mgr.showProtectedInfo(); // Manager inherits BaseProtected and accesses protectedMember
            System.out.println();
        }
    
        static class BankAccount {
            private String accountNo;      // private: not accessible outside
            private double balance;
    
            BankAccount(String accountNo, double balance) {
                this.accountNo = accountNo;
                this.balance = balance;
            }
    
            public void deposit(double amt) {
                if (amt <= 0) throw new IllegalArgumentException("deposit positive");
                balance += amt;
            }
    
            public boolean withdraw(double amt) {
                if (amt <= 0) throw new IllegalArgumentException("withdraw positive");
                if (amt > balance) return false;
                balance -= amt;
                return true;
            }
    
            // getter safely exposes balance (encapsulation)
            public double getBalance() { return balance; }
        }
    
        // show protected and default behavior
        static class BaseProtected {
            protected String protectedMember = "protected-info";
            String packageMember = "package-private"; // default
        }
        static class Manager extends BaseProtected {
            Manager(String name) { /*just extends for demo*/ }
            void showProtectedInfo() {
                // allowed because Manager is subclass in same package
                System.out.println("Manager accessing protectedMember: " + protectedMember);
            }
        }
    
        // Example 7
        // static initializer and utility static methods
        static void example7_staticInitializerAndUtility() {
            System.out.println("7) static initializer & utility:");
            // access class to trigger static initializer
            System.out.println("Utility.version: " + Utility.version());
            System.out.println("Random static value: " + Utility.RANDOM_STATIC);
            System.out.println();
        }
    
        static class Utility {
            static final int RANDOM_STATIC;
            static {
                // static initializer executed when class is loaded first time
                RANDOM_STATIC = new Random().nextInt(1000);
                System.out.println("[Utility static initializer executed]");
            }
            public static String version() { return "Utility v1.0"; }
        }
    
        // Example 8
        // final variables and final references
        static void example8_finalVariablesAndReferences() {
            System.out.println("8) final keyword - variables & references:");
    
            final int x = 10;          // cannot reassign
            final int[] arr = {1,2,3}; // final reference cannot be reassigned...
            arr[0] = 99;               // ...but internal content can change
            System.out.println("final x = " + x + ", modified arr[0] = " + arr[0]);
    
            // blank final (set in constructor) demonstration via local example class:
            class BlankFinal {
                final int value;
                BlankFinal(int v) { this.value = v; }
                int get() { return value; }
            }
            BlankFinal bf = new BlankFinal(42);
            System.out.println("blank final value = " + bf.get());
            System.out.println();
        }
    
        // Example 9
        // final method & final class
        static void example9_finalMethodAndFinalClass() {
            System.out.println("9) final method and final class:");
    
            Child9 child = new Child9();
            child.finalSay(); // calls final method defined in parent
    
            FinalClass9 fc = new FinalClass9();
            fc.show();
            System.out.println("Note: can't extend FinalClass9 (would not compile). See comments in code.");
            System.out.println();
        }
    
        static class Parent9 {
            public final void finalSay() {
                System.out.println("Parent9.finalSay (cannot be overridden)");
            }
        }
        static class Child9 extends Parent9 {
            // attempting to override finalSay() would be compile error
            // public void finalSay() { } // <-- illegal
        }
        static final class FinalClass9 {
            void show() { System.out.println("FinalClass9 instance method"); }
        }
    
        // Example 10
        // static nested class vs inner class (non-static)
        static void example10() {
            System.out.println("10) static nested class vs inner class:");
            Outer10.StaticNested sn = new Outer10.StaticNested();
            sn.greet();
    
            Outer10 outer = new Outer10("OuterName");
            Outer10.Inner inner = outer.new Inner();
            inner.greet();
            System.out.println();
        }
    
        static class Outer10 {
            String name;
            Outer10(String name) { this.name = name; }
            static class StaticNested {
                void greet() { System.out.println("Hello from StaticNested"); }
            }
            class Inner {
                void greet() { System.out.println("Hello from Inner, outer name=" + Outer10.this.name); }
            }
        }
    
        // Example 11
        // immutable class pattern
        static void example11() {
            System.out.println("11) Immutable class example:");
            ImmutablePerson ip = new ImmutablePerson("Sam", 30);
            System.out.println("ImmutablePerson: " + ip);
            // ip.name = "changed"; // no setters -> cannot modify
            System.out.println();
        }
    
        static final class ImmutablePerson {
            private final String name;
            private final int age;
            ImmutablePerson(String name, int age) {
                this.name = name;
                this.age = age;
            }
            public String getName() { return name; }
            public int getAge() { return age; }
            public String toString() { return "ImmutablePerson{name=" + name + ", age=" + age + "}"; }
        }
    
        // Example 12
        // singleton pattern (eager)
        static void example12_singletonPattern() {
            System.out.println("12) Singleton pattern (eager):");
            Singleton12 s1 = Singleton12.getInstance();
            Singleton12 s2 = Singleton12.getInstance();
            System.out.println("Same instance? " + (s1 == s2)); // true
            System.out.println();
        }
    
        static class Singleton12 {
            private static final Singleton12 instance = new Singleton12();
            private Singleton12() { /* private ctor */ }
            public static Singleton12 getInstance() { return instance; }
            public void hello() { System.out.println("Hello from singleton"); }
        }
    
        // Example 13 
        // copy constructor (deep copy vs shallow copy)
        static void example13_copyConstructorDeepCopy() {
            System.out.println("13) Copy constructor (deep copy vs shallow):");
    
            Data13 original = new Data13(1, new int[]{10,20,30});
            Data13 shallow = new Data13(original, false);
            Data13 deep = new Data13(original, true);
    
            System.out.println("Before change original.arr[0]= " + original.arr[0]);
            original.arr[0] = 999;
            System.out.println("After change original.arr[0]= " + original.arr[0]);
            System.out.println("shallow.arr[0]= " + shallow.arr[0] + " (reflects change)");
            System.out.println("deep.arr[0]= " + deep.arr[0] + " (independent copy)");
            System.out.println();
        }
    
        static class Data13 {
            int id;
            int[] arr;
            Data13(int id, int[] arr) {
                this.id = id;
                this.arr = arr;
            }
            // copy constructor: shallow or deep
            Data13(Data13 other, boolean deepCopy) {
                this.id = other.id;
                if (deepCopy && other.arr != null) {
                    this.arr = other.arr.clone(); // deep copy of array
                } else {
                    this.arr = other.arr; // shallow reference
                }
            }
        }
    
        //Example 14
        // anonymous inner class and lambda
        static void example14_anonymousClassAndLambda() {
            System.out.println("14) anonymous inner class & lambda:");
    
            Runnable anon = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running anonymous Runnable");
                }
            };
            anon.run();
    
            Runnable lambda = () -> System.out.println("Running lambda Runnable");
            lambda.run();
    
            // comparator via lambda
            List<String> names = new ArrayList<>(Arrays.asList("Zoe","Adam","John"));
            Collections.sort(names, (a,b) -> a.compareTo(b)); // lambda Comparator
            System.out.println("Sorted names: " + names);
            System.out.println();
        }
    
       //Example 15
        // initialization order static block, instance initializer, constructor
        static void example15() {
            System.out.println("15) Initialization order (static -> instance initializer -> constructor):");
            // triggers static initialization of InitOrder (on first reference)
            InitOrder io = new InitOrder("demo");
            System.out.println();
        }
    
        static class InitOrder {
            static { System.out.println("InitOrder: static initializer (runs when class loaded)"); }
            { System.out.println("InitOrder: instance initializer (runs before constructor)"); }
            InitOrder(String name) { System.out.println("InitOrder: constructor (runs after instance initializer), name=" + name); }
        }
    
}
    



