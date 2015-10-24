package model;

import domain.Event;
        import domain.Login;
        import org.springframework.hateoas.ResourceSupport;
        import java.util.List;
/**
 * Created by Graham 23/10/2015
 */
public class model extends ResourceSupport{
    // Changed from id because of id in ResourceSupport
    private Long resid;
    private String name;
    private Login login;
    private List<Event> events;
    private model() {
    }
    public Long getResId() {
        return resid;
    }
    public String getName() {
        return name;
    }
    public Login getLogin() {
        return login;
    }
    public List<Event> getEvents() {
        return events;
    }
    public model(Builder builder) {
        this.login=builder.login;
        this.events=builder.events;
        this.resid=builder.resid;
        this.name=builder.name;
    }
    public static class Builder{
        private Long resid;
        private String name;
        private Login login;
        private List<Event> events;
        public Builder(String name) {
            this.name = name;
        }
        public Builder resid(Long value){
            this.resid=value;
            return this;
        }
        public Builder address(Login value){
            this.login=value;
            return this;
        }
        public Builder events(List<Event> value){
            this.events=value;
            return this;
        }
        public Builder copy(model value){
            this.login=value.login;
            this.events = value.events;
            this.resid=value.resid;
            this.name=value.name;
            return this;
        }
        public model build(){
            return new model(this);
        }
    }
}
