package services;

import OnlineOB.App;
import conf.factory.EventFactory;
import domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class EventServiceTest extends AbstractTestNGSpringContextTests {

        private Long id;
        @Autowired
        private EventService service;
        // @Test
        public void create() throws Exception {
//Create a Subject Class
            Event event = EventFactory
                    .createEvent(20001L, "Description", "25/10/2015");
// Save in the Database
            service.save(event);
//Id Should be available
            id = event.getEventId();
            Assert.assertNotNull(event);
        }
        // @Test(dependsOnMethods = "create")
        public void read() throws Exception {
// Get subject
            Event event = service.findById(id);
            Assert.assertEquals(event.getEventId(), event.getEventId());
        }
        // @Test(dependsOnMethods = "read")
        public void update() throws Exception {
//Get Subject
            Event event = service.findById(id);
//Change it
            Event newevent = new Event
                    .Builder(event.getEventId())
                    .copy(event)
                    .description("Description1")
                    .build();
//Save it
            service.update(newevent);
//Get Updated Subject
            Event updateEvent = service.findById(id);
            Assert.assertEquals(event.getEventId(), event.getEventId());
        }
        // @Test(dependsOnMethods = "update")
        public void delete() throws Exception {
            Event event = service.findById(id);
            service.delete(event);
            Event deletedSubject = service.findById(id);
            Assert.assertNull(deletedSubject);
        }
}