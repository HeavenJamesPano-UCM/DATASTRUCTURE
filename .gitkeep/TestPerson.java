import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Regular Employee ---
        System.out.println("Enter Regular Employee Firstname:");
        String regFirst = sc.nextLine();
        System.out.println("Enter Regular Employee Lastname:");
        String regLast = sc.nextLine();
        System.out.println("Enter Regular Employee ID:");
        String regID = sc.nextLine();
        System.out.println("Enter Regular Employee Position:");
        String regPos = sc.nextLine();
        System.out.println("Enter Regular Employee Department:");
        String regDept = sc.nextLine();
        System.out.println("Enter Hours Worked:");
        double regHours = sc.nextDouble();
        System.out.println("Enter Hourly Rate:");
        double regRate = sc.nextDouble();
        System.out.println("Enter Bonus:");
        double regBonus = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        RegularEmployee regEmp = new RegularEmployee(regFirst, regLast, regID, regPos, regDept, regHours, regRate, regBonus);

        // --- Contractual Employee ---
        System.out.println("\nContractual Employee Firstname:");
        String conFirst = sc.nextLine();
        System.out.println("Contractual Employee Lastname:");
        String conLast = sc.nextLine();
        System.out.println("Contractual Employee ID:");
        String conID = sc.nextLine();
        System.out.println("Contractual Employee Position:");
        String conPos = sc.nextLine();
        System.out.println("Contractual Employee Department:");
        String conDept = sc.nextLine();
        System.out.println("Hours Worked:");
        double conHours = sc.nextDouble();
        System.out.println("Hourly Rate:");
        double conRate = sc.nextDouble();
        System.out.println("Overtime:");
        double conOvertime = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        ContractualEmployee conEmp = new ContractualEmployee(conFirst, conLast, conID, conPos, conDept, conHours, conRate, conOvertime);

        // --- Student ---
        System.out.println("\nStudent Firstname:");
        String stuFirst = sc.nextLine();
        System.out.println("Student Lastname:");
        String stuLast = sc.nextLine();
        System.out.println("Student ID:");
        String stuID = sc.nextLine();
        System.out.println("Student Course:");
        String stuCourse = sc.nextLine();
        System.out.println("Student Department:");
        String stuDept = sc.nextLine();

        Student student = new Student(stuFirst, stuLast, stuID, stuCourse, stuDept);

        // --- Display Info ---
        System.out.println("\n--- Regular Employee ---");
        System.out.println(regEmp.displayInfo() + "\nSalary: " + regEmp.computeSalary());

        System.out.println("\n--- Contractual Employee ---");
        System.out.println(conEmp.displayInfo() + "\nSalary: " + conEmp.computeSalary());

        System.out.println("\n--- Student ---");
        System.out.println(student.displayInfo());

        sc.close();
    }
}
