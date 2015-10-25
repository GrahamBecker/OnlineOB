package api;

import domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.EventService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/25.
 */
public class EventsPage {

    @RestController
    @RequestMapping(value="/event/**")
    public class FacultyPage {
        @Autowired
        private EventService service;

        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public List<Event> getFacultyDepartments(@PathVariable Long id) {
            return service.getEvents(id);
        }
    }


}
