package domain;

import conf.factory.EscalationFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
public class EscalationTest {

        @Test
        public void testCreate() throws Exception {
            Escalation escalation = EscalationFactory
                    .createEscalation(20001L,"Description","Steven","082911");
            Assert.assertEquals(escalation.getEscalationId(), escalation.getEscalationId());
        }
        @Test
        public void testUpdate() throws Exception {
            Escalation escalation = new Escalation.Builder(20001L)
                    .description("Description")
                    .contactPerson("Steven")
                    .contactNo("082911")
                    .build();
            Escalation newescalation = new Escalation
                    .Builder(escalation.getEscalationId())
                    .copy(escalation)
                    .contactPerson("Brian").build();
            Assert.assertEquals("Description",newescalation.getDescription());
            Assert.assertEquals("Brian",newescalation.getContactPerson());
            Assert.assertEquals(escalation.getEscalationId(),escalation.getEscalationId());
        }


    @Test
    public void testGetEscalationId() throws Exception {

    }

    @Test
    public void testGetDescription() throws Exception {

    }

    @Test
    public void testGetContactPerson() throws Exception {

    }

    @Test
    public void testGetContactNo() throws Exception {

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