// Imports
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Form class, has all variables to be inputted by Immigrant/User
class Form{
    // All values to be shown in form
    String name;
    String address;
    String dateOfBirth;
    int alienNumber;
    String requestedDocuments;
    String subjectName;
    String subjectPlaceOfBirth;
    String entryInTheUS;
    String usCitizenshipStatus;
    String nameOnCertificate;
    String interpreterInformation;
    String preparerInformation;
    String requesterInformation;
    String status;

    // Class Constructor
    public Form(String name, String address, String dateOfBirth, int alienNumber, String requestedDocuments, String status){
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.alienNumber = alienNumber;
        this.requestedDocuments = requestedDocuments;
        this.status = status;
    }

    // Function to print form details
    public void printDetails() {
        System.out.println("Form Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Alien Number: " + alienNumber);
        System.out.println("Requested Documents: " + requestedDocuments);
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }
    
    // Function to return string of details
    public String getDetails() {
        return "Name: " + name +
                "\nAddress: " + address +
                "\nDate of Birth: " + dateOfBirth +
                "\nAlien Number: " + alienNumber +
                "\nRequested Documents: " + requestedDocuments;
    }
}

// Temporary workflow file, will update in later Sprint
class Workflow{
    List<Form> formsTable = new ArrayList<>();

    // Loads form and displays information to show all fields displayed
    public void loadForm(Form form) {
        form.printDetails();
        formsTable.add(form);
    }
}

// Temporary Approver class, will add all methods later
public class Approver{
    private Workflow workflow;

    // Constructor
    public Approver(Workflow workflow){
        this.workflow = workflow;
    }

    public void loadForm(Form form){
        workflow.loadForm(form);
    }

    
    // Main Class, used to display code is working
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        Approver approver = new Approver(workflow);

        // Created temporary forms, will later pull information from workFlow tables with correct status
        Form form1 = new Form("John Doe", "123 Street", "01/01/2000", 1001, "Passport", "Pending");
        Form form2 = new Form("Jane Smith", "456 Avenue", "02/02/2002", 1002, "Birth Certificate", "Pending");

        // Loading forms from Workflow Table
        approver.loadForm(form1);
        approver.loadForm(form2);
        
        JFrame frame = new JFrame("Approval Process");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add panel to frame
        JPanel panel = new JPanel();
        frame.add(panel);
        components(panel, form1);

        // Display frame to user
        frame.setVisible(true);}
     
    // Class to create accept and reject buttons
	private static void components(JPanel panel, Form form) {
        panel.setLayout(null);

        // Creates text area to display form details
        JTextArea textArea = new JTextArea(form.getDetails());
        textArea.setBounds(50, 50, 300, 100);
        textArea.setEditable(false);
        panel.add(textArea);

        // Code to create ACCEPT Button on UI
        JButton accept = new JButton("Accept");
        // Sets position and size of button
        accept.setBounds(50, 200, 100, 25);
        // Action listener to display dialog
        accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Form Accepted");
            }
        });
        // Adds accept button to panel
        panel.add(accept);
        
        // Code to create REJECT Button on UI
        JButton reject = new JButton("Reject");
        // Sets position and size of button
        reject.setBounds(250, 200, 100, 25);
        //Action listener to display dialog
        reject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Form Rejected");
            }
        });
        // Adds reject button to panel
        panel.add(reject);
		
	}
}

        
    

