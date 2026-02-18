public abstract class Person {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }

    public String displayInfo() {
        return "Name: " + firstname + " " + lastname;
    }
}
