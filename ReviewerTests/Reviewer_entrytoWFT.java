import static org.junit.Assert.*;
import org.junit.Test;


public class Reviewer { 

    @Test
    @DisplayName("Entry to work flow table")
    public void entrytoWFT(){
        //New Reviewer object of reviewer class/
        Reviewer reviewer = new Reviewer()


        //Returns string if enetry to workflow table is successfull       

        assertEquals(Reviewer.entrytoWFT(), "Succesfully entered to the Work flow table");
    }
}
