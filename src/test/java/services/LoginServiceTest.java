package services;

import OnlineOB.App;
import conf.factory.LoginFactory;
import domain.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class LoginServiceTest extends AbstractTestNGSpringContextTests {

    private Long id;
    @Autowired
    private LoginService service;
    // @Test
    public void create() throws Exception {
//Create a Subject Class
        Login login = LoginFactory
                .createLogin(20003L, "George", "george@1");
// Save in the Database
        service.save(login);
//Id Should be available
        id = login.getId();
        Assert.assertNotNull(login);
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
// Get subject
        Login login = service.findById(id);
        Assert.assertEquals(login.getId(), login.getId());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
//Get Subject
        Login login = service.findById(id);
//Change it
        Login newlogin = new Login
                .Builder(login.getId())
                .copy(login)
                .build();
//Save it
        service.update(newlogin);
//Get Updated Subject
        Login updatedLogin = service.findById(id);
        Assert.assertEquals(login.getId(), login.getId());
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Login login = service.findById(id);
        service.delete(login);
        Login deletedSubject = service.findById(id);
        Assert.assertNull(deletedSubject);
    }
}