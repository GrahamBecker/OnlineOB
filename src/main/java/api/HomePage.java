        package api;

        import domain.Event;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;
        import services.EventService;

        import java.util.List;

/**
 * Created by Graham Becker on 2015/10/24.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private EventService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }
    @RequestMapping(value = "/event",method = RequestMethod.GET)
    public Event getEvent(){
        Event event = new Event.Builder(0001L)
                .build();
        return event;
    }

}