/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class User{
    @Test
    @DisplayName("The form is able to be seen by the user.")
    public void loadForm_test(){
        /*creating a new object of class User */
        User user = new User();
    
        /* return is empty because this method is not needed for the user class, however it was implemented as it is a public method so the user class still has access*/
        assertNull(user.loadForm());
    }
}