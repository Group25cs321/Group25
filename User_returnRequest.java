/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class User{
    @Test
    @DisplayName("The user sent the form back to the approver for updating")
    public void returnRequest_test(){
        /*creating a new object of class User */
        User user = new User();
    
        /* if the information is not correct on the form sent back to the user, they can correctly update it and send it back to be processed so their information is updated*/
        assertEquals(user.returnRequest(), "User has sucessfully sent the form back to the approver.");
    }
}
