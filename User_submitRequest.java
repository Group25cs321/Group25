/*imports for testing */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

@Test
@DisplayName("User is able to submit request to get acces to their original form document.")
public void submitRequest_test(){
    /*creating a new object of class User */
    User user = new User();
    
    /* return is empty because this method is not needed for the user class, however it was implemented as it is a public method so the user class still has access*/
    assertEquals(user.submitRequest(), "User was able to submit form request.");
}