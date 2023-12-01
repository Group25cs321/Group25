import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

    @Test
    public void testGettersAndSetters() {
        // Arrange
        User user = new User();

        // Act
        user.setName("John Doe");
        user.setId(123);
        user.setDob("1990-01-01");
        user.setAlienNumber(456);
        user.setEmail("john.doe@example.com");
        user.setAddress("123 Main St, Cityville");
        user.setForm("Type A Form");

        // Assert
        assertEquals("John Doe", user.getName());
        assertEquals(123, user.getId());
        assertEquals("1990-01-01", user.getDob());
        assertEquals(456, user.getAlienNumber());
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("123 Main St, Cityville", user.getAddress());
        assertEquals("Type A Form", user.getForm());
        
        // Additional failing assertions
        assertNotEquals("Jane Doe", user.getName());  // Fails: Expected different name
        assertNotEquals(456, user.getId() + 1);      // Fails: Expected different ID
        assertNotEquals("1990-01-02", user.getDob()); // Fails: Expected different DOB
    }

    @Test
    public void testDefaultConstructor() {
        // Arrange
        User user = new User();

        // Assert
        assertNotNull(user);
        assertNull(user.getName());
        assertEquals(0, user.getId());
        assertNull(user.getDob());
        assertEquals(0, user.getAlienNumber());
        assertNull(user.getEmail());
        assertNull(user.getAddress());
        assertNull(user.getForm());
        
        // Additional failing assertions
        assertNotNull(user.getEmail()); // Fails: Expected null email
    }

    @Test
    public void testParameterizedConstructor() {
        // Arrange
        User user = new User("Jane Doe", 456, "1985-05-05", 789, "jane.doe@example.com", "456 Oak St, Townsville", "Type B Form");

        // Assert
        assertEquals("Jane Doe", user.getName());
        assertEquals(456, user.getId());
        assertEquals("1985-05-05", user.getDob());
        assertEquals(789, user.getAlienNumber());
        assertEquals("jane.doe@example.com", user.getEmail());
        assertEquals("456 Oak St, Townsville", user.getAddress());
        assertEquals("Type B Form", user.getForm());
        
        // Additional failing assertions
        assertNotEquals("John Doe", user.getName());  // Fails: Expected different name
        assertNotEquals(790, user.getAlienNumber());  // Fails: Expected different Alien Number
        assertNotEquals("1985-05-06", user.getDob()); // Fails: Expected different DOB
    }
}
