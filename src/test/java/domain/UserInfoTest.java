package domain;

import conf.factory.UserInfoFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
public class UserInfoTest {

        @Test
        public void testCreate() throws Exception {
            UserInfo userInfo = UserInfoFactory
                    .createUserInfo(2004L, "George", "Harrsis", "01/01/1990", "4 Street", "12345", "54321");
            Assert.assertEquals(userInfo.getId(), userInfo.getId());
        }
        @Test
        public void testUpdate() throws Exception {
            UserInfo userInfo = new UserInfo.Builder(2004L)
                    .firstName("George")
                    .lastName("Harrsis")
                    .dob("01/01/1990")
                    .address("4 Street")
                    .idNumber("123457890")
                    .contact("54321")
                    .build();
            UserInfo newUserInfo = new UserInfo
                    .Builder(userInfo.getId())
                    .copy(userInfo)
                    .build();
            Assert.assertEquals("George",newUserInfo.getFirstName());
            Assert.assertEquals("123457890",newUserInfo.getIdNumber());
            Assert.assertEquals(userInfo.getId(),userInfo.getId());
        }
    @Test
    public void testGetId() throws Exception {

    }

    @Test
    public void testGetFirstName() throws Exception {

    }

    @Test
    public void testGetLastName() throws Exception {

    }

    @Test
    public void testGetDob() throws Exception {

    }

    @Test
    public void testGetAddress() throws Exception {

    }

    @Test
    public void testGetContact() throws Exception {

    }

    @Test
    public void testGetIdNumber() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {

    }

    @Test
    public void testHashCode() throws Exception {

    }
}