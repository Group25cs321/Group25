import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontScreen extends JFrame {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Main Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the buttons
        JPanel panel = new JPanel(new BorderLayout());

        // Create buttons
        JButton dataEntryButton = new JButton("Data Entry");
        JButton reviewButton = new JButton("Review");
        JButton approvalButton = new JButton("Approval");

        // Set up action listeners for the buttons
        dataEntryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDataEntryUI();
            }
        });

        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReviewUI();
            }
        });

        approvalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNewWindow("Approval");
            }
        });

        // Add buttons to the panel
        panel.add(dataEntryButton, BorderLayout.WEST);
        panel.add(reviewButton, BorderLayout.CENTER);
        panel.add(approvalButton, BorderLayout.EAST);

        // Set layout for the main frame
        frame.setLayout(new BorderLayout());

        // Add the panel to the center of the frame
        frame.add(panel, BorderLayout.CENTER);

        // Set frame size
        frame.setSize(300, 200);

        // Center the frame on the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void openDataEntryUI() {
        // Create an instance of DataEntryUI
        DataEntryUI dataEntryUI = new DataEntryUI();
        dataEntryUI.setLocationRelativeTo(null); // Center the DataEntryUI on the screen
    }

    private static void openReviewUI() {
        // Create an instance of ReviewUI
        Review reviewUI = new Review();
        reviewUI.setLocationRelativeTo(null); // Center the ReviewUI on the screen
    }

    private static void openNewWindow(String buttonText) {
        // Create a new window with a button to close it
        JFrame newFrame = new JFrame(buttonText + " Window");
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton closeButton = new JButton("Close " + buttonText + " Window");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFrame.dispose();
            }
        });

        JPanel panel = new JPanel();
        panel.add(closeButton);

        newFrame.getContentPane().add(panel);
        newFrame.setSize(200, 150);

        // Center the new window on the screen
        newFrame.setLocationRelativeTo(null);

        // Make the new window visible
        newFrame.setVisible(true);
    }
}
