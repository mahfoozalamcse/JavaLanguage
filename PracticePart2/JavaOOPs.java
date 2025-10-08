package PracticePart2;

public class JavaOOPs {
// JavaOOPConcepts.java
// Demonstrates: Access Modifiers, this, final, static, super


    public static void main(String[] args) {
        System.out.println(" Java OOP Concepts Demo ");

        demoAccessModifiers();
        demoThisReference();
        demoFinalKeyword();
        demoStaticMembers();
        demoSuperKeyword();

        System.out.println("Complete all topic ");
    }


    
    // Access Modifiers Demo
    static void demoAccessModifiers() {
        System.out.println("Access Modifiers ...");

        AccessDemo ad = new AccessDemo();

        // public member: accessible everywhere
        System.out.println("publicField = " + ad.publicField);

        // package-private (no modifier) : accessible within same package
        System.out.println("packageField = " + ad.packageField);

        // protected: accessible in same package and in subclasses
        System.out.println("protectedField = " + ad.protectedField);

        // private: not accessible directly from other classes -> use getter
        // System.out.println(ad.privateField); //  compile error if uncommented
        System.out.println("privateField via getter = " + ad.getPrivateField());

        // Another class in same package (AccessTester) can access package & protected & public but not private
        new AccessTester().tryAccess();

        // Subclass access (protected) demonstration
        new AccessSubclass().demonstrateProtected();

        System.out.println();
    }



    // Top-level (package-private) class for access demo
    static class AccessDemo {
        private int privateField = 1;
        int packageField = 2;           // package-private
        protected int protectedField = 3;
        public int publicField = 4;

        public int getPrivateField() { return privateField; }
    }

    static class AccessTester {
        void tryAccess() {
            AccessDemo other = new AccessDemo();
            System.out.print("AccessTester can see: ");
            // privateField is not visible here -> would be compile error
            // System.out.print(other.privateField + ", ");
            System.out.print(other.packageField + " (package), ");
            System.out.print(other.protectedField + " (protected), ");
            System.out.println(other.publicField + " (public)");
        }
    }


    // Subclass showing protected access via inheritance
    static class AccessSubclass extends AccessDemo {
        void demonstrateProtected() {
            // can access protectedField because this class extends AccessDemo (same package)
            System.out.println("AccessSubclass can access protectedField = " + protectedField);
        }
    }


    // this reference 
    static void demoThisReference() {
        System.out.println(">>> this Reference Demo");

        ThisDemo a = new ThisDemo(42);
        System.out.println("a.x = " + a.x);

        ThisDemo b = new ThisDemo();            // demonstrates constructor chaining (this(...))
        b.setX(99).printThis();                 // demonstrates method chaining using this
        ThisDemo.acceptThis(b);                 // pass current instance 'this' into method

        // inner class referencing outer via OuterWithInner.this
        OuterWithInner outer = new OuterWithInner("OuterName");
        OuterWithInner.Inner inner = outer.new Inner();
        inner.showOuterName(); 

        System.out.println();
    }



    static class ThisDemo {
        int x;

        ThisDemo() {
            this(0); // constructor chaining
        }

        ThisDemo(int x) {
            this.x = x; // disambiguate field and parameter
        }

        ThisDemo setX(int x) {
            this.x = x;     // set with this
            return this;    // return this for chaining
        }

        void printThis() {
            System.out.println("printThis -> this.x = " + this.x);
        }

        static void acceptThis(ThisDemo t) {
            System.out.println("acceptThis received object with x = " + t.x);
        }
    }


    static class OuterWithInner {
        private String name;
        OuterWithInner(String name) { this.name = name; }
        class Inner {
            void showOuterName() {
                // refer explicitly to outer instance from inner class
                System.out.println("Inner can access outer name via OuterWithInner.this.name = " + OuterWithInner.this.name);
            }
        }
    }


    //  final keyword 
    static void demoFinalKeyword() {
        System.out.println(">>> final Keyword Demo");

        // final primitive
        final int CONST = 10;
        System.out.println("final primitive CONST = " + CONST);
        // CONST = 20; // compile error if uncommented

        // final reference
        final int[] arr = {1,2,3};
        arr[0] = 99;                // allowed — internal state mutation OK
        System.out.println("final array after mutation arr[0] = " + arr[0]);
        // arr = new int[]{4,5};   // compile error if uncommented

        // blank final - must be initialized in constructor (demonstrated below)
        BlankFinal bf = new BlankFinal(77);
        System.out.println("BlankFinal.value = " + bf.getValue());

        // final method cannot be overridden (demonstrated via classes)
        FinalMethodParent parent = new FinalMethodParent();
        parent.show();
        FinalMethodChild child = new FinalMethodChild();
        child.show(); // calls overridden (non-final) child methods, but parent's final method cannot be overridden

        // final class cannot be subclassed (see comment below)
        FinalClassExample fce = new FinalClassExample();
        fce.show();

        System.out.println();
    }



    static class BlankFinal {
        private final int value;   // blank final
        BlankFinal(int v) { this.value = v; }
        int getValue() { return value; }
    }



    static class FinalMethodParent {
        public final void finalMethod() {
            System.out.println("FinalMethodParent.finalMethod (cannot be overridden)");
        }
        public void show() {
            System.out.print("Parent show: "); finalMethod();
        }
    }



    static class FinalMethodChild extends FinalMethodParent {
        // Cannot override finalMethod() here — would be compile error
        // public void finalMethod() { } // <-- illegal
        @Override
        public void show() {
            System.out.print("Child show: "); finalMethod(); // calling parent's final method
        }
    }

    // final class demonstration
    static final class FinalClassExample {
        void show() { System.out.println("FinalClassExample.show()"); }
    }


    // class SubFinal extends FinalClassExample { } // <-- illegal: cannot extend final class

    // static members 
    static void demoStaticMembers() {
        System.out.println(">>> static Members Demo");

        System.out.println("StaticBlockDemo.RANDOM_VALUE (class load triggers static block) = " + StaticBlockDemo.RANDOM_VALUE);

        // static field shared across instances
        StaticCounter a = new StaticCounter();
        StaticCounter b = new StaticCounter();
        System.out.println("StaticCounter.count after creating two instances = " + StaticCounter.count);

        // static method call via class and instance (instance-call is allowed but discouraged)
        StaticCounter.staticUtility();

        // static nested class usage
        StaticContainer.StaticNested nested = new StaticContainer.StaticNested();
        nested.greet();

        System.out.println();
    }


    static class StaticBlockDemo {
        static final int RANDOM_VALUE;
        static {
            System.out.println("[StaticBlockDemo static initializer running]");
            RANDOM_VALUE = (int)(Math.random() * 1000);
        }
    }

    static class StaticCounter {
        static int count = 0; // shared by class
        int id;
        StaticCounter() {
            id = ++count;
        }
        static void staticUtility() {
            System.out.println("StaticCounter.staticUtility called. count = " + count);
        }
    }


    static class StaticContainer {
        static class StaticNested {
            void greet() { System.out.println("Hello from static nested class"); }
        }
        // non-static inner classes would have implicit reference to outer instance
    }


    //  super keyword
    static void demoSuperKeyword() {
        System.out.println(">>> super Keyword Demo");

        ChildSuper child = new ChildSuper("childName", 99);
        child.showBoth();

        // super() must be first line in constructor - demonstrated by code (see ChildSuper constructor)
        System.out.println();
    }


    static class ParentSuper {
        int val;
        String name;
        ParentSuper() {
            System.out.println("ParentSuper() called");
            this.val = 10;
            this.name = "parent";
        }
        ParentSuper(String name, int val) {
            System.out.println("ParentSuper(name,val) called");
            this.name = name;
            this.val = val;
        }
        void show() {
            System.out.println("ParentSuper.show -> name=" + name + ", val=" + val);
        }
    }



    static class ChildSuper extends ParentSuper {
        int val = 500; // hides parent field "val"
        ChildSuper(String name, int val) {
            super(name, val); // must be first statement; calls parent constructor
            System.out.println("ChildSuper() after super()");
        }
        void showBoth() {
            System.out.println("ChildSuper.showBoth -> this.val = " + this.val + ", super.val = " + super.val);
            System.out.print("Now calling super.show(): ");
            super.show(); // call parent's show
        }
    }
}


