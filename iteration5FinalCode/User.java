import java.util.Date;


public class User {
    private String name;
    private int id;
    private String dob;
    private int alienNumber;
    private String email;
    private String address;
    private String form;

    // Default constructor
    public User() {
        // Default constructor
    }

    // Parameterized constructor
    public User(String name, int id, String dob, int alienNumber, String email, String address, String form) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.alienNumber = alienNumber;
        this.email = email;
        this.address = address;
        this.form = form;
    }

    // Getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters and setters for DOB
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getters and setters for alien number
    public int getAlienNumber() {
        return alienNumber;
    }

    public void setAlienNumber(int alienNumber) {
        this.alienNumber = alienNumber;
    }

    // Getters and setters for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getters and setters for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters and setters for form
    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public static void main(String[] args) {
        // Example usage
        User user = new User();
        user.setName("John Doe");
        user.setId(123);
        user.setDob("1990-01-01");
        user.setAlienNumber(456);
        user.setEmail("john.doe@example.com");
        user.setAddress("123 Main St, Cityville");
        user.setForm("Type A Form");

        // Displaying user information
        System.out.println("Name: " + user.getName());
        System.out.println("ID: " + user.getId());
        System.out.println("DOB: " + user.getDob());
        System.out.println("Alien Number: " + user.getAlienNumber());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Form: " + user.getForm());
    }
}
