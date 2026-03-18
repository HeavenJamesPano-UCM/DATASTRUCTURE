import java.util.Scanner;
import java.util.ArrayList;

public class Pano_PhoneBook {
    static ArrayList<PhoneContact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int choice;

        do {
            System.out.println("\nPHONE BOOK MENU");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if(choice == 1){
                addContact();
            } else if(choice == 2){
                updateContact();
            } else if(choice == 3){
                searchContact();
            } else if(choice == 4){
                deleteContact();
            } else if(choice == 5){
                displayAllContacts();
            } else if(choice == 0){
                System.out.println("Exiting Phone Book!");
            } else{
                System.out.println("Invalid Choice! Please Choose Again");
            }

        } while (choice != 0);
    }

    static void addContact(){
        System.out.print("First Name: "); String fn = sc.nextLine();
        System.out.print("Last Name: "); String ln = sc.nextLine();
        System.out.print("Company: "); String comp = sc.nextLine();
        System.out.print("Nickname: "); String nick = sc.nextLine();
        System.out.print("Phone: "); String phone = sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();

        contacts.add(new PhoneContact(fn, ln, comp, nick, phone, email));
        System.out.println("Contact added successfully!");
    }

    static void updateContact(){
        System.out.print("Enter first name of contact to update: ");
        String name = sc.nextLine();

        for(PhoneContact c : contacts){
            if(c.getfName().equalsIgnoreCase(name)){
                  System.out.print("New First Name: "); c.setfName(sc.nextLine());
                System.out.print("New Last Name: "); c.setlName(sc.nextLine());
                System.out.print("New Company: "); c.setCompany(sc.nextLine());
                System.out.print("New Nickname: "); c.setnName(sc.nextLine());
                System.out.print("New Phone: "); c.setPhone(sc.nextLine());
                System.out.print("New Email: "); c.setEmail(sc.nextLine());
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    static void searchContact(){
        System.out.print("Enter first name to search: ");
        String name = sc.nextLine();
        for(PhoneContact c : contacts){
            if(c.getfName().equalsIgnoreCase(name)){
                c.display();
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    static void deleteContact(){
        System.out.print("Enter first name to delete: ");
        String name = sc.nextLine();
        for(PhoneContact c : contacts){
            if(c.getfName().equalsIgnoreCase(name)){
                contacts.remove(c);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    static void displayAllContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts available.");
            return;
        }
        for(PhoneContact c : contacts){
            c.display();
        }
    }
}