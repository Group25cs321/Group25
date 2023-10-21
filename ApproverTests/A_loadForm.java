/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Approver{
    @Test
    @DisplayName("Can load form")
    public void approverLoadFormTest(){
        /*New approver object of Approver class */
        Approver approver = new Approver();

        /*New form object of Form class */
        Form form = new Form();

        /*Returns string if the approver can load form */
        assertEquals(Approver.loadForm(Form), "Form has been accessed by Approver.");
    }
}
