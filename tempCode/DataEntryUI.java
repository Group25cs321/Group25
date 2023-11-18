import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataEntryUI extends JFrame {

    private JTextField nameField, dobField, alienNumberField, emailField, addressField, formNumberField;
    private JTextField idField; // Assuming ID is a String for flexibility

    public DataEntryUI() {
        setTitle("Data Entry Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents(); // Initialize UI components
        pack(); // Pack the components to get preferred size
        setLocationRelativeTo(null); // Center the frame on the screen
        setResizable(false); // Disable frame resizing
        setVisible(true); // Make the frame visible
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout()); // Panel using GridBagLayout for better component placement
        GridBagConstraints gbc = new GridBagConstraints(); // Constraints for GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5); // Insets for spacing

        // Name
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridx++;
        nameField = new JTextField(20);
        panel.add(nameField, gbc);

        // ID
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("ID:"), gbc);
        gbc.gridx++;
        idField = new JTextField(20);
        panel.add(idField, gbc);

        // Date of Birth
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Date of Birth:"), gbc);
        gbc.gridx++;
        dobField = new JTextField(20);
        panel.add(dobField, gbc);

        // Alien Number
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Alien Number:"), gbc);
        gbc.gridx++;
        alienNumberField = new JTextField(20);
        panel.add(alienNumberField, gbc);

        // Email
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx++;
        emailField = new JTextField(20);
        panel.add(emailField, gbc);

        // Address
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Address:"), gbc);
        gbc.gridx++;
        addressField = new JTextField(20);
        panel.add(addressField, gbc);

        // Form Number
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Form Number:"), gbc);
        gbc.gridx++;
        formNumberField = new JTextField(20);
        panel.add(formNumberField, gbc);

        // Submit Button
        gbc.gridx = 0;
        gbc.gridy++;
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton, gbc);

        // Return to Main Window Button
        gbc.gridx++;
        JButton returnButton = new JButton("Return to Main Window");
        panel.add(returnButton, gbc);

        // Action listener for the Submit Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });

        // Action listener for the Return to Main Window Button
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the DataEntryUI
            }
        });

        // Add the panel to the frame
        add(panel);
    }

    private void submitForm() {
        // Get values from the text fields
        String name = nameField.getText();
        String id = idField.getText();
        String dob = dobField.getText();
        String alienNumber = alienNumberField.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        String formNumber = formNumberField.getText();

        // Perform basic validation
        if (name.isEmpty() || id.isEmpty() || dob.isEmpty() || alienNumber.isEmpty() || email.isEmpty() || address.isEmpty() || formNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error, Can't Submit Form. Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Assuming ID, Alien Number, and Form Number should be integers
                int idValue = Integer.parseInt(id);
                int alienNumberValue = Integer.parseInt(alienNumber);
                int formNumberValue = Integer.parseInt(formNumber);

                // If validation is successful, create a Form object (type Form)
                Form form = new Form(name, idValue, dob, alienNumberValue, email, address, formNumberValue);

                // You can now use the 'form' object as needed or pass it to other classes
                // For now, display a message
                JOptionPane.showMessageDialog(this, "Form submitted successfully:\n" + form.toString(), "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error, Can't Submit Form. ID, Alien Number, and Form Number must be integers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new DataEntryUI();
        });
    }
}

class Form {
    private String name;
    private int id;
    private String dob;
    private int alienNumber;
    private String email;
    private String address;
    private int formNumber;

    public Form(String name, int id, String dob, int alienNumber, String email, String address, int formNumber) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.alienNumber = alienNumber;
        this.email = email;
        this.address = address;
        this.formNumber = formNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nDate of Birth: " + dob + "\nAlien Number: " + alienNumber +
                "\nEmail: " + email + "\nAddress: " + address + "\nForm Number: " + formNumber;
    }
}
