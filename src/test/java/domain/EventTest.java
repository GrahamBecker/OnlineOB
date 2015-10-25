package domain;

import conf.factory.EventFactory;
import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Graham Becker on 2015/10/25.
 */
public class EventTest {

    @Test
    public void testCreate() throws Exception {
        Event event = EventFactory
                .createEvent(20001L, "Description", "25/10/2015");
        Assert.assertEquals(event.getEventId(), event.getEventId());
    }
    @Test
    public void testUpdate() throws Exception {
        Event event = new Event.Builder(20001L)
                .description("Description")
                .dateTime("25/10/2015")
                .build();
        Event newevent = new Event
                .Builder(event.getEventId())
                .copy(event)
                .description("Description1")
                .build();
        Assert.assertEquals("Description1",newevent.getDescription());
        Assert.assertEquals("25/10/2015",newevent.getDateTime());
        Assert.assertEquals(event.getEventId(),event.getEventId());
    }
    @Test
    public void testGetEventId() throws Exception {

    }

    @Test
    public void testGetDescription() throws Exception {

    }

    @Test
    public void testGetDateTime() throws Exception {

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