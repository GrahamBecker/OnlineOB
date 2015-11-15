package OnlineOB.repository;

import OnlineOB.domain.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
public interface EventRepository extends CrudRepository<Event, Long> {
}
