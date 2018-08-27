package pl.sda.tests.users;

import org.junit.Before;
import org.junit.Test;
import pl.sda.tests.users.exception.UserExistException;

public class UserTest{

    private UserService userService;

    @Before
    public void setUserService(){
        userService = new UserService();
    }

    @Test(expected = NullPointerException.class)
    public void saveUserTest() throws UserExistException{
        User user = null;
        userService.saveUser(user);
    }
    @Test(expected = UserExistException.class)
    public void addUserTest() throws UserExistException{
        User userTest = new User("few32t2", "32353q");
        userService.saveUser(userTest);
        userService.saveUser(userTest);
    }

    // dokończyć

}
