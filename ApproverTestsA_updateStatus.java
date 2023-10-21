/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
 
public class Approver{
    @Test
    @DisplayName("Approver can update status")
    public void approverUpdatesTest(){
        /*New approver object of Approver class */
        Approver approver = new Approver();

        /*New workflow object of Workflow class */
        Workflow workflow = new Workflow();

        /*Did status get updated correctly by approver?*/
        assertEquals(approver.updateStatus(), workflow.getStatus());
    }
}
