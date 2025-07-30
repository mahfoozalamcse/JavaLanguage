package OOPS;

public class Inheritance {
    int id, salary;
    Inheritance(int i, int s){
       id = i;
       salary = s;
    }
}
  
 // sales data 
  class SalesEmployee extends Inheritance{
     int salesInc;
     SalesEmployee(int i, int s, int si){
        super(i, s);
        salesInc = si;
     }
  }
  // main class
  class B{
    public static void main(String[] args) {
        System.out.println();
       SalesEmployee se = new SalesEmployee(101, 30000, 1000);
       System.out.println("Salary = "+se.salary);
       System.out.println("Employee id = "+se.id);
       System.out.println("Sales data = "+se.salesInc);
        
    }
  }

