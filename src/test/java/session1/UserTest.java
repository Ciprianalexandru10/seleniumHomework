package session1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void canConstructNewUser(){

        User user = new User();

        assertEquals("John",user.getUsername());
        assertEquals("test",user.getPassword());

    }
    @Test
    public  void canConstructWithUsernameAndPassword() {

        User user= new User("admin","pass");
        assertEquals("admin",user.getUsername());
        assertEquals("pass",user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstruction() {

        User user = new User();
        user.setPassword("Test1234");

        assertEquals("John",user.getUsername());
        assertEquals("Test1234",user.getPassword());

    }

    @Test
    public void checkPublicField() {
        User user = new User();
        user.username = "newName";

        assertEquals(user.username, "newName");

    }

}
