/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Approver{
    @Test
    @DisplayName("Approver can deny form")
    public void approverDeniesTest(){
        /*New approver object of Approver class */
        Approver approver = new Approver();

        /*Returns string if the approver denies info */
        assertEquals(approver.denyInfo(), "Incorrect information on form.");
    }
}
