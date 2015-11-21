package OnlineOB.api;

import OnlineOB.domain.Event;
import OnlineOB.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by Graham Becker on 2015/11/21.
 */
@RestController
@RequestMapping("/api/**")
public class EventPage {
    //@Autowired
    private EventService service;

    //Retrieve all events

    @RequestMapping(value = "/events/", method = RequestMethod.GET)
    public ResponseEntity<List<Event>> listAllEvents() {
        List<Event> Events = service.findAll();
        if (Events.isEmpty()) {
            System.out.println("Events are empty");
            return new ResponseEntity<List<Event>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Event>>(Events, HttpStatus.OK);
    }

    //Create an event

    @RequestMapping(value = "/event/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createEvent(@RequestBody Event event, UriComponentsBuilder ucBuilder){
        System.out.println("Creating Event " + event.getDateTime());

        service.save(event);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/event/{id}").buildAndExpand(event.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
