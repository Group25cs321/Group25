/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class User{
    @Test
    @DisplayName("The user was able to accept the form once it was returned by the approver.")
    public void acceptForm_test(){
        /*creating a new object of class User */
        User user = new User();
    
    /* if every step in the cycle has been completed, the user can get the from back after they recive an email from the approver. If the form has all of the correct information, they can accept it and keep it.*/
        assertEquals(user.acceptRequest(), "User has sucessfully accepted the form.");
    }
}
