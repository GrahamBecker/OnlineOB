package domain;

import conf.factory.LoginFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
public class LoginTest {

    @Test
    public void testCreate() throws Exception {
        Login login = LoginFactory
                .createLogin(20003L, "George", "george@1");
        Assert.assertEquals(login.getId(), login.getId());
    }
    @Test
    public void testUpdate() throws Exception {
        Login login = new Login.Builder(20003L)
                .userName("George")
                .password("george@2")
                .build();
        Login newlogin = new Login
                .Builder(login.getId())
                .copy(login)
                .build();
        Assert.assertEquals("George",newlogin.getUserName());
        Assert.assertEquals("george@2",newlogin.getPassword());
        Assert.assertEquals(login.getId(),login.getId());
    }

    @Test
    public void testGetId() throws Exception {

    }

    @Test
    public void testGetUserName() throws Exception {

    }

    @Test
    public void testGetPassword() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {

    }

    @Test
    public void testHashCode() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}