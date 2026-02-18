public class Employee extends Person implements iCompute {
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
    public void setIDNo(String IDNo) { this.IDNo = IDNo; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }
}
