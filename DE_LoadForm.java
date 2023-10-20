/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class DataEntry{
    @Test
    @DisplayName("Data entry was able to access the form")
    public void loadForm_test(){
        /*creating a new object of class Data Entry */
        DataEntry data = new DataEntry();
    
    /* informs us that the data entry system was able to access the form with all of the information input by the user*/
        assertEquals(data.loadForm(Form), "Form has been accessed in Data Entry.");
    }
}