package OnlineOB.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Entity
public class Event implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String description;
    private String dateTime;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="eventId")
    private Escalation escalations;

    private Event(){
    }
    public Long getId(){
        return Id;
    }
    public String getDescription(){
        return description;
    }
    public String getDateTime(){
        return dateTime;
    }

    public Event(Builder builder){
        Id=builder.Id;
        description=builder.description;
        dateTime=builder.dateTime;
    }

    public static class Builder{
        private Long Id;
        private String description;
        private String dateTime;

        public Builder copy(Event value){
            this.Id=value.Id;
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
            this.Id = eventId;
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
        return Id.equals(event.Id);
    }
    @Override
    public int hashCode() {
        return Id.hashCode();
    }
    @Override
    public String toString() {
        return "Event{" +
                "Event Id = " + Id + "," +
                "Description= " + description + "," +
                "Date Time = " + dateTime + "," +
                "}";
    }
}
