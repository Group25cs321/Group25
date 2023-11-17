import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserProfileManagementSystem {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, UserProfile> userProfiles = new HashMap<>();

            while (true) {
                System.out.println("User Profile Management System");
                System.out.println("1. Create/Update Profile");
                System.out.println("2. View Profile");
                System.out.println("3. View Validation Status");
                System.out.println("4. Notify Validation Status");
                System.out.println("5. Request Revalidation");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter your alien number: ");
                        String alienNumber = scanner.nextLine();
                        System.out.print("Enter your profile data: ");
                        String data = scanner.nextLine();

                        UserProfile userProfile = new UserProfile(alienNumber, data);
                        userProfiles.put(alienNumber, userProfile);
                        System.out.println("Profile created/updated successfully.");
                        break;
                    case 2:
                        System.out.print("Enter your alien number: ");
                        String viewAlienNumber = scanner.nextLine();

                        if (userProfiles.containsKey(viewAlienNumber)) {
                            UserProfile viewProfile = userProfiles.get(viewAlienNumber);
                            System.out.println("Alien Number: " + viewProfile.getAlienNumber());
                            System.out.println("Profile Data: " + viewProfile.getData());
                        } else {
                            System.out.println("User profile not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter your alien number: ");
                        String statusAlienNumber = scanner.nextLine();

                        if (userProfiles.containsKey(statusAlienNumber)) {
                            UserProfile statusProfile = userProfiles.get(statusAlienNumber);
                            System.out.println("Validation Status: " + statusProfile.getValidationStatus());
                        } else {
                            System.out.println("User profile not found.");
                        }
                        break;
                    case 4:
                        System.out.print("Enter your alien number: ");
                        String notifyAlienNumber = scanner.nextLine();

                        if (userProfiles.containsKey(notifyAlienNumber)) {
                            UserProfile notifyProfile = userProfiles.get(notifyAlienNumber);
                            System.out.print("Enter validation status (Validated/Not validated): ");
                            String validationStatus = scanner.nextLine();
                            notifyProfile.setValidationStatus(validationStatus);
                            System.out.println("Validation status updated.");
                        } else {
                            System.out.println("User profile not found.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter your alien number: ");
                        String revalidationAlienNumber = scanner.nextLine();

                        if (userProfiles.containsKey(revalidationAlienNumber)) {
                            UserProfile revalidationProfile = userProfiles.get(revalidationAlienNumber);
                            revalidationProfile.requestRevalidation();
                            System.out.println("Revalidation requested.");
                        } else {
                            System.out.println("User profile not found.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting the system. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}

class UserProfile {
    private String alienNumber;
    private String data;
    private String validationStatus;
    private boolean revalidationRequested;
    private String validationCriteria; // Added validation criteria
    private String validationFeedback; // Added validation feedback

    public UserProfile(String alienNumber, String data) {
        this.alienNumber = alienNumber;
        this.data = data;
        this.validationStatus = "Not validated";
        this.revalidationRequested = false;
        this.validationCriteria = "Your data should meet specific criteria.";
        this.validationFeedback = "Your changes failed validation. Please review the criteria and try again.";
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

    public String getValidationCriteria() {
        return validationCriteria;
    }

    public String getValidationFeedback() {
        return validationFeedback;
    }
}