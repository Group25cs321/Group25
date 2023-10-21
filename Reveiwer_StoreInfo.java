import static org.junit.Assert.*;
import org.junit.Test;

public class Reviewer {

    @Test
    public void toStoreInfoTest() {
        Review review = new Review();
        assertEquals(review.toStoreInfo(),"Information stored Successfully");
    }
}
