package services;

import OnlineOB.App;
import conf.factory.UserInfoFactory;
import domain.UserInfo;
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
public class UserInfoServiceTest extends AbstractTestNGSpringContextTests {

    private Long id;
    @Autowired
    private UserInfoService service;
    // @Test
    public void create() throws Exception {
//Create a Subject Class
        UserInfo userInfo = UserInfoFactory
                .createUserInfo(2004L, "George", "Harrsis", "01/01/1990", "4 Street", "12345", "54321");
// Save in the Database
        service.save(userInfo);
//Id Should be available
        id = userInfo.getId();
        Assert.assertNotNull(userInfo);
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
// Get subject
        UserInfo userInfo = service.findById(id);
        Assert.assertEquals(userInfo.getId(), userInfo.getId());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
//Get Subject
        UserInfo userInfo = service.findById(id);
//Change it
        UserInfo newUserInfo = new UserInfo
                .Builder(userInfo.getId())
                .copy(userInfo)
                .build();
//Save it
        service.update(newUserInfo);
//Get Updated Subject
        UserInfo updatedUserInfo = service.findById(id);
        Assert.assertEquals(userInfo.getId(), userInfo.getId());
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        UserInfo userInfo = service.findById(id);
        service.delete(userInfo);
        UserInfo deletedSubject = service.findById(id);
        Assert.assertNull(deletedSubject);
    }
}