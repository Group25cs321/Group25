package cs321;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

//Temporary Approver class, will add all methods later
public class Approver extends JFrame{
	
	public boolean ValidationCheck = false;
	
    private Map<String, profiles> userProfiles = new HashMap<>();

	// Constructor
    public Approver() {
        setTitle("Approver Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents(); // Initialize UI components
        pack(); // Pack the components to get preferred size
        setLocationRelativeTo(null); // Center the frame on the screen
        setResizable(false); // Disable frame resizing
        setVisible(true); // Make the frame visible
    }

    // UI Code
    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Adds buttons
        JButton createProfile = new JButton("Profile Creation");
        JButton updateForm = new JButton("Update Form");
        JButton viewForm = new JButton("View Form");
        JButton viewStatusButton = new JButton("Validate");
        JButton validateButton = new JButton("Validation");
        JButton revalidationButton = new JButton("Revalidation");
        JButton emailUser = new JButton("Email");
        JButton exitButton = new JButton("Exit");

        // Creates actions for buttons pressed
        createProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                profileCreation();
            }
        });
        
        updateForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateForm();
            }
        });

        viewForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewForm();
            }
        });

        viewStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewValidation();
            }
        });

        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Validate();
            }
        });
        
        emailUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emailUser();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(createProfile, gbc);
        gbc.gridy++;
        panel.add(updateForm, gbc);
        gbc.gridy++;
        panel.add(viewForm, gbc);
        gbc.gridy++;
        panel.add(viewStatusButton, gbc);
        gbc.gridy++;
        panel.add(validateButton, gbc);
        gbc.gridy++;
        panel.add(emailUser, gbc);
        gbc.gridy++;
        panel.add(exitButton, gbc);

        add(panel);
    }
    
    // Workflow table/user profile list
    class profiles {
        private String alienNumber;
        private String name;
        private String email;
        private Form form;
        private String validationStatus;

        public profiles(String alienNumber, String name, Form form) {
            this.alienNumber = alienNumber;
            this.name = name;
            this.form = form;
            this.validationStatus = "Not Validated";
        }
        
        // Getter Functions
        public String getName() {
        	return name;
        }
        
        public Form getForm() {
        	return form;
        }
        
        public String getAlienNumber() {
            return alienNumber;
        }

        public String getValidationStatus() {
            return validationStatus;
        }

        public void setValidationStatus(String status) {
            validationStatus = status;
        }

    }
    
    // Action for profile creation button
    private void profileCreation() {
    	// Prompt for form and user profile information
        String name = JOptionPane.showInputDialog("Enter your name:");
        String id = JOptionPane.showInputDialog("Enter your ID:");
        String dob = JOptionPane.showInputDialog("Enter your date of birth:");
        String alienNumber = JOptionPane.showInputDialog("Enter your alien number:");
        String email = JOptionPane.showInputDialog("Enter your email:");
        String address = JOptionPane.showInputDialog("Enter your address:");
        String formNumber = JOptionPane.showInputDialog("Enter your form number:");
        
        // Create form and profile
        Form form = new Form(name, Integer.valueOf(id), dob, Integer.valueOf(alienNumber), email, address, Integer.valueOf(formNumber));
        profiles newProfile = new profiles(alienNumber, name, form);
        
        // Add into workflow table
        userProfiles.put(alienNumber, newProfile);
        
        // Display on screen profile created
        JOptionPane.showMessageDialog(this, "Profile created successfully.");
    }
    
    // Action for update form button
    private void updateForm() {
    	// Find existing profile
    	String viewAlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

    	// If found, update form
        if (userProfiles.containsKey(viewAlienNumber)) {
        	String name = JOptionPane.showInputDialog("Enter your new name:");
            String id = JOptionPane.showInputDialog("Enter your new ID:");
            String dob = JOptionPane.showInputDialog("Enter your new date of birth:");
            String alienNumber = JOptionPane.showInputDialog("Enter your new alien number:");
            String email = JOptionPane.showInputDialog("Enter your new email:");
            String address = JOptionPane.showInputDialog("Enter your new address:");
            String formNumber = JOptionPane.showInputDialog("Enter your new form number:");
            Form form = new Form(name, Integer.valueOf(id), dob, Integer.valueOf(alienNumber), email, address, Integer.valueOf(formNumber));
            profiles newProfile = new profiles(alienNumber, name, form);
            userProfiles.remove(alienNumber);
            userProfiles.put(alienNumber, newProfile);
            JOptionPane.showMessageDialog(this, "Form updated successfully.");
        }
        else {
        	JOptionPane.showMessageDialog(this, "User profile not found.");
        }
   }
        
    // Action for view form button
    private void viewForm() {
    	// Find form from alien number
        String viewAlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

        // If found, display information
        if (userProfiles.containsKey(viewAlienNumber)) {
            profiles temp = userProfiles.get(viewAlienNumber);
            Form form = temp.getForm();
            JOptionPane.showMessageDialog(this, "Form: " + form.getDetails());
        } else {
            JOptionPane.showMessageDialog(this, "User profile not found.");
        }
    }

    // Action for viewing validation status
    private void viewValidation() {
    	// Find user from alien number
        String AlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

        // If found, display validation status
        if (userProfiles.containsKey(AlienNumber)) {
            profiles statusProfile = userProfiles.get(AlienNumber);
            JOptionPane.showMessageDialog(this, "Validation Status: " + statusProfile.getValidationStatus());
        } else {
            JOptionPane.showMessageDialog(this, "User profile not found.");
        }
    }

    // Action for validating form and user information
    private void Validate() {
    	// Tracker for if/else statements
    	boolean check = false;
    	
    	// Find profile using alien number
        String AlienNumber = JOptionPane.showInputDialog("Enter your alien number:");
        
        if (userProfiles.containsKey(AlienNumber)) {
            profiles temp = userProfiles.get(AlienNumber);
            Form form = temp.getForm();
            
            // If any information of user does not match form, do not validate. Else, validate and update status.
            if (form.getAlienNumber()==Integer.valueOf(temp.getAlienNumber())) {
            	check = true;
            }
            
            if (form.getName().equals(temp.getName())) {
            	check = true;
            }
	        
	        if (check==true) {
	        	ValidationCheck = true;
	            temp.setValidationStatus("Validated");
	            JOptionPane.showMessageDialog(this, "Validation status is validated.");
	        }
	        
	        else {
	        	temp.setValidationStatus("Not Validated");
	            JOptionPane.showMessageDialog(this, "Validation status is not validated, please update form.");
	        }
        } else {
            JOptionPane.showMessageDialog(this, "User profile not found.");
        }
    }
    
    // Action for emailing user
    private void emailUser() {
        String AlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

        // If form has been validated, send email to user. 
        if (ValidationCheck==true) {
        	 if (userProfiles.containsKey(AlienNumber)) {
                 profiles temp = userProfiles.get(AlienNumber);
                 String email = temp.getForm().getEmail();
                 
                 String sentEmail = ("\nFrom: nsajid2@gmu.edu \n"
                 		+ "Recipient: " + email + "\n"
                 		+ "Subject: Form Request Validation \n"
                 		+ "Your form request has been validated, you will recieve them in 1-2 weeks. Thank you!");
                 
                 JOptionPane.showMessageDialog(this, "Email has been sent to given email: " + sentEmail);
        }
        else {
        	JOptionPane.showMessageDialog(this, "Profile not validated, cannot send email.");}
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Approver();
        });
    }
}
