/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Form{
    @Test
    @DisplayName("Form updates Workflow")
    public void formEntryTest(){
        /*New form object of Form class */
        Form form = new Form();

        /*Can form update workflow? */
        assertEquals(form.entryToWFT(), "Workflow step has been created.");
    }
}
