import static org.junit.Assert.*;
import org.junit.Test;


public class Workflow{
    @Test
    @DisplayName("Reviewer can  load form")
    public void LoadformTest(){
        /*creating a new object of class for Reveiwer and workflow  */
        Reviewer reviewer = new Reviewer ();
        Workflow workflow = new Workflow()
    
    
        assertEquals(reviewer.Loadform_test(), workflow.getStatus());
    }
}
