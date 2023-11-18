package cs321;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Review extends JFrame {

    private Map<String, UserProfile> userProfiles;

    public Review() {
        setTitle("User Profile Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userProfiles = new HashMap<>();
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JButton createUpdateButton = new JButton("Create/Update Profile");
        JButton viewButton = new JButton("View Profile");
        JButton viewStatusButton = new JButton("View Validation Status");
        JButton notifyStatusButton = new JButton("Notify Validation Status");
        JButton requestRevalidationButton = new JButton("Request Revalidation");
        JButton exitButton = new JButton("Exit");

        createUpdateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createUpdateProfile();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewProfile();
            }
        });

        viewStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewValidationStatus();
            }
        });

        notifyStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notifyValidationStatus();
            }
        });

        requestRevalidationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                requestRevalidation();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(createUpdateButton, gbc);
        gbc.gridy++;
        panel.add(viewButton, gbc);
        gbc.gridy++;
        panel.add(viewStatusButton, gbc);
        gbc.gridy++;
        panel.add(notifyStatusButton, gbc);
        gbc.gridy++;
        panel.add(requestRevalidationButton, gbc);
        gbc.gridy++;
        panel.add(exitButton, gbc);

        add(panel);
    }

    private void createUpdateProfile() {
        String alienNumber = JOptionPane.showInputDialog("Enter your alien number:");
        String data = JOptionPane.showInputDialog("Enter your profile data:");

        UserProfile userProfile = new UserProfile(alienNumber, data);
        userProfiles.put(alienNumber, userProfile);
        JOptionPane.showMessageDialog(this, "Profile created/updated successfully.");
    }

    private void viewProfile() {
        String viewAlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

        if (userProfiles.containsKey(viewAlienNumber)) {
            UserProfile viewProfile = userProfiles.get(viewAlienNumber);
            JOptionPane.showMessageDialog(this,
                    "Alien Number: " + viewProfile.getAlienNumber() + "\nProfile Data: " + viewProfile.getData());
        } else {
            JOptionPane.showMessageDialog(this, "User profile not found.");
        }
    }

    private void viewValidationStatus() {
        String statusAlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

        if (userProfiles.containsKey(statusAlienNumber)) {
            UserProfile statusProfile = userProfiles.get(statusAlienNumber);
            JOptionPane.showMessageDialog(this, "Validation Status: " + statusProfile.getValidationStatus());
        } else {
            JOptionPane.showMessageDialog(this, "User profile not found.");
        }
    }

    private void notifyValidationStatus() {
        String notifyAlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

        if (userProfiles.containsKey(notifyAlienNumber)) {
            UserProfile notifyProfile = userProfiles.get(notifyAlienNumber);
            String validationStatus = JOptionPane.showInputDialog("Enter validation status (Validated/Not validated):");
            notifyProfile.setValidationStatus(validationStatus);
            JOptionPane.showMessageDialog(this, "Validation status updated.");
        } else {
            JOptionPane.showMessageDialog(this, "User profile not found.");
        }
    }

    private void requestRevalidation() {
        String revalidationAlienNumber = JOptionPane.showInputDialog("Enter your alien number:");

        if (userProfiles.containsKey(revalidationAlienNumber)) {
            UserProfile revalidationProfile = userProfiles.get(revalidationAlienNumber);
            revalidationProfile.requestRevalidation();
            JOptionPane.showMessageDialog(this, "Revalidation requested.");
        } else {
            JOptionPane.showMessageDialog(this, "User profile not found.");
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Review();
        });
    }
}

class UserProfile {
    private String alienNumber;
    private String data;
    private String validationStatus;
    private boolean revalidationRequested;

    public UserProfile(String alienNumber, String data) {
        this.alienNumber = alienNumber;
        this.data = data;
        this.validationStatus = "Not validated";
        this.revalidationRequested = false;
    }

    public String getAlienNumber() {
        return alienNumber;
    }

    public String getData() {
        return data;
    }

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String status) {
        validationStatus = status;
    }

    public boolean isRevalidationRequested() {
        return revalidationRequested;
    }

    public void requestRevalidation() {
        revalidationRequested = true;
    }
}
