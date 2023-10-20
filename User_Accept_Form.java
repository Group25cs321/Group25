import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.jupiter.api.Test;

public void test(){
    User user = new User();
    
    assertThat(user.acceptForm(), is("Form accepted"));
}
