/*Imports for tests*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Approver{
    @Test
    @DisplayName("Approver can validate")
    public void approverValidatesTest(){
        /*New approver object of Approver class */
        Approver approver = new Approver();

        /*Returns string if the approver can validate information on form */
        assertEquals(approver.validateInfo(), "Information is correct.");
    }
}
