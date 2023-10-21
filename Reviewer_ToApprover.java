import static org.junit.Assert.*;
import org.junit.Test;

public class Reviewer {

    @Test
    public void toApproverTest() {
        Review review = new Review();
        assertEquals(review.toApprover(),"Review sent to approver for further processing");
    }
}






