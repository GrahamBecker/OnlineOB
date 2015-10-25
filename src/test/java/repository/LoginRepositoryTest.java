package repository;

import conf.factory.LoginFactory;
import domain.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
public class LoginRepositoryTest {

    @Test
    public void testFindById() throws Exception {

    }

    private Long id;
    private List<Login> login;
    //@Autowired
    private LoginRepository repository;
    @BeforeMethod
    public void setUp() throws Exception {
        login = new ArrayList<Login>();
    }
    @AfterMethod
    public void tearDown() throws Exception {
// repository.deleteAll();
    }
    // @Test
    public void create() throws Exception {
        Login login = LoginFactory
                .createLogin(20001L, "1", "2");
        repository.save(login);
        id=login.getId();
        Assert.assertNotNull(login.getId());
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Login login = repository.findOne(id);
        Assert.assertNotNull(login.getId());
        Assert.assertEquals("20001", login.getId());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Login login = repository.findOne(id);
        repository.delete(login);
        Login deletedFaculty = repository.findOne(id);
        Assert.assertNull(deletedFaculty);
    }
}