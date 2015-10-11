package conf.factory;

import domain.Event;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public class EventFactory {

    public static Event createEvent(Long eventId, String description, String dateTime){

        Event event = new Event
                .Builder(eventId)
                .description(description)
                .dateTime(dateTime)
                .build();
        return event;
    }
}
