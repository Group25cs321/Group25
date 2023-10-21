/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public class User{
    @Test
    @DisplayName("User is able to submit request to get acces to their original form document.")
    public void submitRequest_test(){
        /*creating a new object of class User */
        User user = new User();
    
        /* the purpose behind our step is for the user to get their original documents back, in order to do so they need to submit a request*/
        assertEquals(user.submitRequest(), "User was able to submit form request.");
    }
}
