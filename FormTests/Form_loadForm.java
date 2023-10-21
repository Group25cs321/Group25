/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Form{
    @Test
    @DisplayName("Form loads form")
    public void formLoadFormTest(){
        /*New form object of Form class */
        Form form = new Form();

        /*Can form load form? */
        assertEquals(form.loadForm(Form), "Form has been loaded by Form.");
    }
}
