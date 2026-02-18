public class Student extends Person {
    private String IDNo;
    private String course;
    private String department;

    public Student(String firstname, String lastname, String IDNo, String course, String department) {
        super(firstname, lastname);
        this.IDNo = IDNo;
        this.course = course;
        this.department = department;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", ID: " + IDNo + ", Course: " + course + ", Dept: " + department;
    }
}
