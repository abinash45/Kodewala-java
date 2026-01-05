package com.kodewala.comapnyhierarchy;

public class SoftwareEngineer extends Employee {

    protected String technology;      // protected → usable by child
    protected double skillAllowance;  // protected → usable by child

    public SoftwareEngineer(int employeeId, String name,
                            double baseSalary,
                            String technology,
                            double skillAllowance) {

        super(employeeId, name, baseSalary);
        this.technology = technology;
        this.skillAllowance = skillAllowance;
    }

    public double calculateSalary() {
        return getBaseSalary() + skillAllowance;
    }

    public void showSoftwareEngineerDetails() {
        showEmployeeDetails();
        System.out.println("Technology: " + technology);
        System.out.println("Skill Allowance: ₹" + skillAllowance);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}
