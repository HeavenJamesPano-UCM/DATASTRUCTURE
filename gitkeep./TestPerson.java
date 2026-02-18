public class TestPerson {
    public static void main(String[] args) {
        // Create Regular Employee
        RegularEmployee regEmp = new RegularEmployee("Justine", "Bayot", "E001", "Manager", "IT", 160, 20, 500);
        // Create Contractual Employee
        ContractualEmployee conEmp = new ContractualEmployee("Kirk", "Opaw", "E002", "Developer", "IT", 120, 18, 200);
        // Create Student
        Student student = new Student("Heaven", "Gwapo", "S001", "Computer Science", "IT");

        // Display information
        System.out.println("--- Regular Employee ---");
        System.out.println(regEmp.displayInfo() + ", Salary: " + regEmp.computeSalary());

        System.out.println("\n--- Contractual Employee ---");
        System.out.println(conEmp.displayInfo() + ", Salary: " + conEmp.computeSalary());

        System.out.println("\n--- Student ---");
        System.out.println(student.displayInfo());
    }
}
