package repository;

import conf.factory.KeyRegisterFactory;
import domain.KeyRegister;
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
public class KeyRegisterRepositoryTest {

    @Test
    public void testFindById() throws Exception {

    }

    private Long id;
    private List<KeyRegister> key;
    //@Autowired
    private KeyRegisterRepository repository;
    @BeforeMethod
    public void setUp() throws Exception {
        key = new ArrayList<KeyRegister>();
    }
    @AfterMethod
    public void tearDown() throws Exception {
// repository.deleteAll();
    }
    // @Test
    public void create() throws Exception {
        KeyRegister key = KeyRegisterFactory
                .createKeyRegister(20001L, "Key1", "1", "2", "3", "4");
        repository.save(key);
        id=key.getKeyId();
        Assert.assertNotNull(key.getKeyId());
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        KeyRegister key = repository.findOne(id);
        Assert.assertNotNull(key.getKeyId());
        Assert.assertEquals("20001", key.getKeyId());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        KeyRegister key = repository.findOne(id);
        repository.delete(key);
        KeyRegister deletedFaculty = repository.findOne(id);
        Assert.assertNull(deletedFaculty);
    }
}