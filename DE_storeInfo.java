/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class DataEntry{
    @Test
    @DisplayName("Data entry has stored information in database")
    public void storeInfo_test(){
        /*creating a new object of class Data Entry */
        DataEntry data = new DataEntry();
    
    /* once the data entry step has been complete an entry is made in the workflow table to send the form onto the reviewer*/
        assertEquals(data.storeInfo(), "Information has been stored in the database.");
    }
}