package OnlineOB.api;

import OnlineOB.domain.Event;
import OnlineOB.domain.Login;
import OnlineOB.services.EventService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {

    @Autowired
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index() {
        return "This is a Home Page";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Login getLogin() {
        Login login = new Login.Builder(1234L)
                .userName("Graham")
                .password("test")
                .build();

        return login;
    }

}