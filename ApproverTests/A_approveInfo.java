/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
 
public class Approver{
    @Test
    @DisplayName("Approver can approve form")
    public void approverApprovesTest(){
        /*New approver object of Approver class */
        Approver approver = new Approver();

        /*Returns string if the approver approves info */
        assertEquals(approver.approveInfo(), "Correct information on form.");
    }
}
