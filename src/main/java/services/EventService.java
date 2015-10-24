package services;

import domain.Event;

import java.util.List;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public interface EventService extends Services<Event, Long>{
    List<Event> getEvents();
}
