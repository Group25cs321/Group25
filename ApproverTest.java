package cs321;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import cs321.Approver.profiles;

public class ApproverTest{
    private profiles testProfile;
    private Form testForm;

    @Before
    public void setUp() {
        // Initialize a Form object
        testForm = new Form("John Doe", 123, "01-01-1990", 456, "john@example.com", "123 Main St", 789);
        
        // Initialize a profiles object
        testProfile = new profiles("456", "John Doe", testForm);
    }

    @Test
    public void testGetName() {
        assertEquals("Name should match", "John Doe", testProfile.getName());
    }

    @Test
    public void testGetForm() {
        assertEquals("Form should match", testForm, testProfile.getForm());
    }

    @Test
    public void testGetAlienNumber() {
        assertEquals("Alien number should match", "456", testProfile.getAlienNumber());
    }

    @Test
    public void testGetValidationStatusInitially() {
        assertEquals("Initial validation status should be 'Not Validated'", "Not Validated", testProfile.getValidationStatus());
    }

    @Test
    public void testSetAndGetValidationStatus() {
        testProfile.setValidationStatus("Validated");
        assertEquals("Validation status should be 'Validated'", "Validated", testProfile.getValidationStatus());
    }
}