package repository;

import OnlineOB.App;
import conf.factory.EscalationFactory;
import domain.Escalation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
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
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class EscalationRepositoryTest extends AbstractTestNGSpringContextTests {

    @Test
    public void testFindById() throws Exception {

    }

        private Long id;
        private List<Escalation> escalation;
        //@Autowired
        private EscalationRepository repository;
        @BeforeMethod
        public void setUp() throws Exception {
            escalation = new ArrayList<Escalation>();
        }
        @AfterMethod
        public void tearDown() throws Exception {
// repository.deleteAll();
        }
        // @Test
        public void create() throws Exception {
            Escalation escalation = EscalationFactory
                    .createEscalation(20001L, "Description", "Steven", "082911");
            repository.save(escalation);
            id=escalation.getEscalationId();
            Assert.assertNotNull(escalation.getEscalationId());
        }
        // @Test(dependsOnMethods = "create")
        public void read() throws Exception {
            Escalation escalation = repository.findOne(id);
            Assert.assertNotNull(escalation.getEscalationId());
            Assert.assertEquals("Description", escalation.getDescription());
        }
        // @Test(dependsOnMethods = "read")
        public void update() throws Exception {
        }
        // @Test(dependsOnMethods = "update")
        public void delete() throws Exception {
            Escalation escalation = repository.findOne(id);
            repository.delete(escalation);
            Escalation deletedFaculty = repository.findOne(id);
            Assert.assertNull(deletedFaculty);
        }
}
