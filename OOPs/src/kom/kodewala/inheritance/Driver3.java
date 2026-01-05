package kom.kodewala.inheritance;

public class Driver3 {

    public static void main(String[] args) {

        Employee e1 = new Manager("Abinash", 80000.00);
        Employee e2 = new Developer("Rohit", 98000.00);

        System.out.println("---- Manager ----");
        System.out.println("Salary: ₹" + e1.calculateSalary());

        System.out.println();

        System.out.println("---- Developer ----");
        System.out.println("Salary: ₹" + e2.calculateSalary());
    }
}

// ================= PARENT =================
class Employee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

// ================= MANAGER =================
class Manager extends Employee {

    private double bonus = 2000;

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// ================= DEVELOPER =================
class Developer extends Employee {

    private double skillAllowance = 15000;

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + skillAllowance;
    }
}
