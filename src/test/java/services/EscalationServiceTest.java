package services;

import OnlineOB.App;
import conf.factory.EscalationFactory;
import domain.Escalation;
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
public class EscalationServiceTest extends AbstractTestNGSpringContextTests {

    private Long id;
    @Autowired
    private EscalationService service;
    // @Test
    public void create() throws Exception {
//Create a Subject Class
        Escalation escalation = EscalationFactory
                .createEscalation(20001L, "Description", "Steven", "082911");
// Save in the Database
        service.save(escalation);
//Id Should be available
        id = escalation.getEscalationId();
        Assert.assertNotNull(escalation);
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
// Get subject
        Escalation escalation = service.findById(id);
        Assert.assertEquals(escalation.getEscalationId(), escalation.getEscalationId());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
//Get Subject
        Escalation escalation = service.findById(id);
//Change it
        Escalation newescalation = new Escalation
                .Builder(escalation.getEscalationId())
                .copy(escalation)
                .contactPerson("Brian").build();
//Save it
        service.update(newescalation);
//Get Updated Subject
        Escalation updatedEscalation = service.findById(id);
        Assert.assertEquals(escalation.getEscalationId(), escalation.getEscalationId());
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Escalation escalation = service.findById(id);
        service.delete(escalation);
        Escalation deletedSubject = service.findById(id);
        Assert.assertNull(deletedSubject);
    }
}