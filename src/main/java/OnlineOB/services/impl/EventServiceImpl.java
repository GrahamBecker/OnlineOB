package OnlineOB.services.impl;

import OnlineOB.domain.Event;
import OnlineOB.repository.EventRepository;
import OnlineOB.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository repo;
    @Override
    public Event findById(Long id){
        return repo.findOne(id);
    }
    @Override
    public Event save(Event entity){
        return repo.save(entity);
    }
    @Override
    public Event update(Event entity){
        return repo.save(entity);
    }
    @Override
    public void delete(Event entity){
        repo.delete(entity);
    }
    @Override
    public List<Event> findAll(){
        List<Event> allEvents = new ArrayList<Event>();
        Iterable<Event> events = repo.findAll();
        for(Event event : events){
            allEvents.add(event);
        }
        return allEvents;
    }
    @Override
    public List<Event> getEvents(Long id) {
        return null;
    }
}
