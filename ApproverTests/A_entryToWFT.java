/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
 
public class Approver{
    @Test
    @DisplayName("Approver can create WTF entry")
    public void approverWFTEntryTest(){
        /*New approver object of Approver class */
        Approver approver = new Approver();

        /*New workflow object of Workflow class */
        Workflow workflow = new Workflow();

        /*Did workflow get new entry by approver?*/
        assertEquals(approver.entryToWFT(), "Workflow step has been created.");
    }
}
