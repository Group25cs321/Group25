import static org.junit.Assert.*;
import org.junit.Test;


public class Reviewer { 

    @Test
    @DisplayName("Reviewer has updated status")
    public void updateStatus(){
        //New Reviewer object of reviewer class/
        Reviewer reviewer = new Reviewer()


        //Returns string if the reviewer can load form/
       

        assertEquals(Reviewer.updateStatus(Form), "status has been succesfully updated.");
    }
}
