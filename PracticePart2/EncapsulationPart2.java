package PracticePart2;

public class EncapsulationPart2 {
   
    private int empId;
    private String name;
    private double salary;

    public EncapsulationPart2(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        setSalary(salary);
    }

    // Getter
    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Setter
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Invalid Salary!");
    }
   


    public static void main(String[] args) {
        EncapsulationPart2 e = new EncapsulationPart2(101, "Mahfooz", 50000);
        System.out.println(e.getName() + " earns " + e.getSalary());
    }
}


