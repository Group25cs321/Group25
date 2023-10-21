/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Form{
    @Test
    @DisplayName("Form updates status")
    public void formUpdateStatusTest(){
        /*New form object of Form class */
        Form form = new Form();

        /*Can form update status? */
        assertEquals(form.updateStatus(), workflow.getStatus());
    }
}
