import static org.junit.Assert.*;
import org.junit.Test;


public class Reviewer { 

    @Test
    @DisplayName("Reviewer has validated reuqest")
    public void validateRequest(){
        //New Reviewer object of reviewer class/
        Reviewer reviewer = new Reviewer()

        //Returns string if reviewer validated request      
        assertEquals(Reviewer.confirmValid(), "Reviewer has successfully validated reuqest");
    }
}
