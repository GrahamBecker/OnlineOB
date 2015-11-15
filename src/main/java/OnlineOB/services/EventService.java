package OnlineOB.services;

import OnlineOB.domain.Event;

import java.util.List;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
public interface EventService extends Services<Event, Long> {
    List<Event> getEvents(Long id);
}
