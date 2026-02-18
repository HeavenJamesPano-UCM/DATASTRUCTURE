public class ContractualEmployee extends Employee {
    private double overtime;

    public ContractualEmployee(String firstname, String lastname, String IDNo, String position, String department, double hoursWorked, double hourlyRate, double overtime) {
        super(firstname, lastname, IDNo, position, department, hoursWorked, hourlyRate);
        this.overtime = overtime;
    }

    public double getOvertime() { return overtime; }
    public void setOvertime(double overtime) { this.overtime = overtime; }

    @Override
    public double computeSalary() {
        return super.computeSalary() + overtime;
    }
}
