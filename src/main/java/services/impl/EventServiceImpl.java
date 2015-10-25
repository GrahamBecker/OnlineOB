package services.impl;

import domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.EventService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/11.
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventService repo;

    @Override
    public Event findById(Long id){
        return repo.findById(id);
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
        List<Event> allEvents = new ArrayList<>();
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
