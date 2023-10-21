/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Approver{
    @Test
    @DisplayName("Approver can email user")
    public void approverEmailsTest(){
        /*New approver object of Approver class */
        Approver approver = new Approver();

        /*Returns string if the approver can email user */
        assertEquals(approver.emailUser(), "User has been emailed.");
    }
}
