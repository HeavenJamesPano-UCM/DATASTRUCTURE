public class RegularEmployee extends Employee {
    private double bonus;

    public RegularEmployee(String firstname, String lastname, String IDNo, String position, String department, double hoursWorked, double hourlyRate, double bonus) {
        super(firstname, lastname, IDNo, position, department, hoursWorked, hourlyRate);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public double computeSalary() {
        return super.computeSalary() + bonus;
    }
}
