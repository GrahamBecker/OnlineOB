package repository;

import conf.factory.UserInfoFactory;
import domain.UserInfo;
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
public class UserInfoRepositoryTest {

    @Test
    public void testFindById() throws Exception {

    }
    private Long id;
    private List<UserInfo> userInfo;
    //@Autowired
    private UserInfoRepository repository;
    @BeforeMethod
    public void setUp() throws Exception {
        userInfo = new ArrayList<UserInfo>();
    }
    @AfterMethod
    public void tearDown() throws Exception {
// repository.deleteAll();
    }
    // @Test
    public void create() throws Exception {
        UserInfo userInfo = UserInfoFactory
                .createUserInfo(20001L, "George", "Harris", "1", "2", "3", "");
        repository.save(userInfo);
        id=userInfo.getId();
        Assert.assertNotNull(userInfo.getId());
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        UserInfo userInfo = repository.findOne(id);
        Assert.assertNotNull(userInfo.getId());
        Assert.assertEquals("20001", userInfo.getId());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        UserInfo userInfo = repository.findOne(id);
        repository.delete(userInfo);
        UserInfo deletedFaculty = repository.findOne(id);
        Assert.assertNull(deletedFaculty);
    }
}