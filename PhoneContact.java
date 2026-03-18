import java.util.Scanner;

public class PhoneContact {
    private String fName;
    private String lName;
    private String company;
    private String nName;
    private String phone;
    private String email;

    // Constructor
    public PhoneContact(String fName, String lName, String company, String nName, String phone, String email){
        this.fName = fName;
        this.lName = lName;
        this.company = company;
        this.nName = nName;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public String getfName(){ return fName; }
    public String getlName(){ return lName; }
    public String getCompany(){ return company; }
    public String getnName(){ return nName; }
    public String getPhone(){ return phone; }
    public String getEmail(){ return email; }

    // Setters
    public void setfName(String fName){ this.fName = fName; }
    public void setlName(String lName){ this.lName = lName; }
    public void setCompany(String company){ this.company = company; }
    public void setnName(String nName){ this.nName = nName; }
    public void setPhone(String phone){ this.phone = phone; }
    public void setEmail(String email){ this.email = email; }

    public void display(){
        System.out.println(" ");
        System.out.println("Name: " + fName + " " + lName);
        System.out.println("Company: " + company);
        System.out.println("Nickname: " + nName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }
}