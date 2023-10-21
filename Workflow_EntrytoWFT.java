import static org.junit.Assert.*;
import org.junit.Test;


public class Workflow{
    @Test
    @DisplayName("Reviewer has entered the workflow table")
    public void EntrytoWFT(){
        /*creating a new object of class for Reveiwer and workflow  */
        Reviewer reviewer = new Reviewer ();
        Workflow workflow = new Workflow()
    
    
        assertEquals(reviewer.EntrytoWFT(), workflow.getStatus());
    }
}