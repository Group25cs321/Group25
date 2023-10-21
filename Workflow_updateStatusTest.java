
import static org.junit.Assert.*;
import org.junit.Test;


public class Workflow{
    @Test
    @DisplayName("Reveiwer can update status")
    public void updateStatusTest(){
        /*creating a new object of class for Reveiwer and workflow  */
        Reviewer reviewer = new Reviewer ();
        Workflow workflow = new Workflow()
    
    
        assertEquals(reviewer.updateStatusTest(), workflow.getStatus());
    }
}