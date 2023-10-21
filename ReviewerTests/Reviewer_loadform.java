import static org.junit.Assert.*;
import org.junit.Test;


public class Reviewer { 

    @Test
    @DisplayName("Can load form")
    public void loadFormTest(){
        //New Reviewer object of reviewer class/
        Reviewer reviewer = new Reviewer()


        //Returns string if the reviewer can load form/


        assertEquals(Reviewer.loadForm(Form), "Form has been accessed by Reviewer.");
    }
}
