/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class DataEntry{
    @Test
    @DisplayName("Data entry was able to validate the form")
    public void validateRequest_test(){
        /*creating a new object of class Data Entry */
        DataEntry data = new DataEntry();
    
    /* the information is validated for correction once the user submits the form*/
        assertEquals(data.validateRequest(), "Information has been validated and processed.");
    }
}