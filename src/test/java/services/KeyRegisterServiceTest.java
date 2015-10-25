package services;

import OnlineOB.App;
import conf.factory.KeyRegisterFactory;
import domain.KeyRegister;
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
public class KeyRegisterServiceTest extends AbstractTestNGSpringContextTests {

    private Long id;
    @Autowired
    private KeyRegisterService service;
    // @Test
    public void create() throws Exception {
//Create a Subject Class
        KeyRegister key = KeyRegisterFactory
                .createKeyRegister(20002L, "Key1", "George", "24/10/2015", "George", "25/10/2015");
// Save in the Database
        service.save(key);
//Id Should be available
        id = key.getKeyId();
        Assert.assertNotNull(key);
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
// Get subject
        KeyRegister key = service.findById(id);
        Assert.assertEquals(key.getKeyId(), key.getKeyId());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
//Get Subject
        KeyRegister key = service.findById(id);
//Change it
        KeyRegister newkey = new KeyRegister
                .Builder(key.getKeyId())
                .copy(key)
                .build();
//Save it
        service.update(newkey);
//Get Updated Subject
        KeyRegister updatedKey = service.findById(id);
        Assert.assertEquals(key.getKeyId(), key.getKeyId());
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        KeyRegister key = service.findById(id);
        service.delete(key);
        KeyRegister deletedSubject = service.findById(id);
        Assert.assertNull(deletedSubject);
    }
}