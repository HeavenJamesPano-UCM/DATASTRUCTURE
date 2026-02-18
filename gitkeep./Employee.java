public class Employee extends Person implements ICompute {
    private String IDNo;
    private String position;
    private String department;
    private double hoursWorked;
    private double hourlyRate;

    public Employee(String firstname, String lastname, String IDNo, String position, String department, double hoursWorked, double hourlyRate) {
        super(firstname, lastname);
        this.IDNo = IDNo;
        this.position = position;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getIDNo() { return IDNo; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", ID: " + IDNo + ", Position: " + position + ", Dept: " + department;
    }
}
