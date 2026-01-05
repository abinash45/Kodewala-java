package com.kodewala.comapnyhierarchy;

public class SeniorSoftwareEngineer extends SoftwareEngineer {

    private double leadershipAllowance = 20000;

    public SeniorSoftwareEngineer(int employeeId, String name,
                                  double baseSalary,
                                  String technology,
                                  double skillAllowance) {

        super(employeeId, name, baseSalary, technology, skillAllowance);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + leadershipAllowance;
    }

    public void showSeniorEngineerDetails() {
        showEmployeeDetails();
        System.out.println("Technology: " + technology);
        System.out.println("Skill Allowance: ₹" + skillAllowance);
        System.out.println("Leadership Allowance: ₹" + leadershipAllowance);
        System.out.println("Total Salary (Senior): ₹" + calculateSalary());
    }
}
