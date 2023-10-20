/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class DataEntry{
    @Test
    @DisplayName("Data entry can update status")
    public void updateStatus_test(){
        /*creating a new object of class Data Entry */
        DataEntry data = new DataEntry();
        Workflow workflow = new Workflow()
    
    /*returns string if the status was correctly updated in the workflow table */
        assertEquals(data.updateStatus(), workflow.getStatus());
    }
}
