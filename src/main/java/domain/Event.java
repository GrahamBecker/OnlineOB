package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/10.
 */
@Entity
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
    private String description;
    private String dateTime;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="eventId")
    private List<Escalation> escalations;

    private Event(){
    }
    public Long getEventId(){
        return eventId;
    }
    public String getDescription(){
        return description;
    }
    public String getDateTime(){
        return dateTime;
    }

    public Event(Builder builder){
        eventId=builder.eventId;
        description=builder.description;
        dateTime=builder.dateTime;
    }

    public static class Builder{
        private Long eventId;
        private String description;
        private String dateTime;

        public Builder copy(Event value){
            this.eventId=value.eventId;
            this.description=value.description;
            this.dateTime=value.dateTime;
            return this;
        }
        public Builder description(String value){
            this.description = value;
            return this;
        }
        public Builder dateTime(String value){
            this.dateTime = value;
            return this;
        }
        public Builder(Long eventId){
            this.eventId = eventId;
        }
        public Event build(){
            return new Event(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return eventId.equals(event.eventId);
    }
    @Override
    public int hashCode() {
        return eventId.hashCode();
    }
    @Override
    public String toString() {
        return "Event{" +
                "Event Id = " + eventId + "," +
                "Description= " + description + "," +
                "Date Time = " + dateTime + "," +
                "}";
    }
}

