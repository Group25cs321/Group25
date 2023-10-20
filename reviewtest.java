import static org.junit.Assert.*;
import org.junit.Test;

public class ReviewTest {
    
    @Test
    public void testConfirmValid() {
        Review review = new Review();
        assertEquals("Review Step Completed", review.confirmValid());
    }
}