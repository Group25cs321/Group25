import static org.junit.Assert.*;
import org.junit.Test;

public class Reviewer {

    @Test
    public void confirmvaltest() {
        Review review = new Review();
        assertEquals(review.confirmvalid(), "Review Step Completed");
    }
}