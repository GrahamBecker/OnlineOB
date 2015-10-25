package domain;

import conf.factory.KeyRegisterFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
public class KeyRegisterTest {

    @Test
    public void testCreate() throws Exception {
        KeyRegister key = KeyRegisterFactory
                .createKeyRegister(20002L, "Key1", "George", "24/10/2015", "George", "25/10/2015");
        Assert.assertEquals(key.getKeyId(), key.getKeyId());
    }
    @Test
    public void testUpdate() throws Exception {
        KeyRegister key = new KeyRegister.Builder(20002L)
                .keyNo("Key1")
                .issuedTo("George")
                .dateReturned("24/10/2015")
                .returnedBy("Steven")
                .dateReturned("25/10/2015")
                .build();
        KeyRegister newkey = new KeyRegister
                .Builder(key.getKeyId())
                .copy(key)
                .build();
        Assert.assertEquals("Key1",newkey.getKeyNo());
        Assert.assertEquals("George",newkey.getIssuedTo());
        Assert.assertEquals(key.getKeyId(),key.getKeyId());
    }

    @Test
    public void testGetKeyId() throws Exception {

    }

    @Test
    public void testGetKeyNo() throws Exception {

    }

    @Test
    public void testGetIssuedTo() throws Exception {

    }

    @Test
    public void testGetDateIssued() throws Exception {

    }

    @Test
    public void testGetReturnedBy() throws Exception {

    }

    @Test
    public void testGetDateReturned() throws Exception {

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