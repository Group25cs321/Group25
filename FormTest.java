package cs321;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FormTest {
    private Form testForm;

    // Set up a temporary form class
    @Before
    public void setUp() {
        testForm = new Form("John Doe", 123, "01-01-1990", 456, "john@example.com", "123 Main St", 789);
    }

    @Test
    public void testFormGetName() {
        assertEquals("John Doe", testForm.getName());
    }

    @Test
    public void testFormGetID() {
        assertEquals(123, testForm.getID());
    }

    @Test
    public void testFormGetDOB() {
        assertEquals("01-01-1990", testForm.getDOB());
    }

    @Test
    public void testFormGetAlienNumber() {
        assertEquals(456, testForm.getAlienNumber());
    }

    @Test
    public void testFormGetEmail() {
        assertEquals("john@example.com", testForm.getEmail());
    }

    @Test
    public void testFormGetAddress() {
        assertEquals("123 Main St", testForm.getAddress());
    }

    @Test
    public void testGetFormNumber() {
        assertEquals(789, testForm.getFormNumber());
    }

    @Test
    public void testFormToString() {
        String expected = "Name: John Doe\nID: 123\nDate of Birth: 01-01-1990\nAlien Number: 456\nEmail: john@example.com\nAddress: 123 Main St\nForm Number: 789";
        assertEquals(expected, testForm.toString());
    }
    
    @Test
    public void testFormGetDetails() {
        String expectedDetails = "Name: John Doe\nAddress: 123 Main St\nDate of Birth: 01-01-1990\nAlien Number: 456\nForm Number: 789";
        assertEquals("Details should match", expectedDetails, testForm.getDetails());
    }
       
    
    
}