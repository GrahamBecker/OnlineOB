package repository;

import conf.factory.EventFactory;
import domain.Event;
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
public class EventRepositoryTest {

    @Test
    public void testFindById() throws Exception {

    }
    private Long id;
    private List<Event> event;
    //@Autowired
    private EventRepository repository;
    @BeforeMethod
    public void setUp() throws Exception {
        event = new ArrayList<Event>();
    }
    @AfterMethod
    public void tearDown() throws Exception {
// repository.deleteAll();
    }
    // @Test
    public void create() throws Exception {
        Event event = EventFactory
                .createEvent(20001L, "Description", "25/10/2015");
        repository.save(event);
        id=event.getEventId();
        Assert.assertNotNull(event.getEventId());
    }
    // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Event event = repository.findOne(id);
        Assert.assertNotNull(event.getEventId());
        Assert.assertEquals("Description", event.getDescription());
    }
    // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Event event = repository.findOne(id);
        repository.delete(event);
        Event deletedFaculty = repository.findOne(id);
        Assert.assertNull(deletedFaculty);
    }
}
