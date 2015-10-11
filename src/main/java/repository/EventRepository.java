package repository;

import domain.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public interface EventRepository extends CrudRepository<Event, Long> {

    Event findById(Long eventId);
}
