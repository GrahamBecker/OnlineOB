package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/10.
 */
@Entity
public class Escalation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long escalationId;
    private String description;
    private String contactPerson;
    private String contactNo;

    private Escalation(){
    }
    public Long getEscalationId(){
        return escalationId;
    }
    public String getDescription(){
        return description;
    }
    public String getContactPerson(){
        return contactPerson;
    }
    public String getContactNo(){
        return contactNo;
    }

    public Escalation(Builder builder){
        escalationId=builder.escalationId;
        description=builder.description;
        contactPerson=builder.contactPerson;
        contactNo=builder.contactNo;
    }

    public static class Builder{
        private Long escalationId;
        private String description;
        private String contactPerson;
        private String contactNo;

        public Builder copy(Escalation value){
            this.escalationId=value.escalationId;
            this.description=value.description;
            this.contactPerson=value.contactPerson;
            this.contactNo=value.contactNo;
            return this;
        }
        public Builder description(String value){
            this.description = value;
            return this;
        }
        public Builder contactPerson(String value){
            this.contactPerson = value;
            return this;
        }
        public Builder contactNo(String value){
            this.contactNo = value;
            return this;
        }
        public Builder(Long escalationId){
            this.escalationId = escalationId;
        }
        public Escalation build(){
            return new Escalation(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escalation esc = (Escalation) o;
        return escalationId.equals(esc.escalationId);
    }
    @Override
    public int hashCode() {
        return escalationId.hashCode();
    }
    @Override
    public String toString() {
        return "Escalation{" +
                "Escalation Id = " + escalationId + "," +
                "Description = " + description + "," +
                "Contact Person= " + contactPerson + "," +
                "Contact Number= " + contactNo + "," +
                "}";
    }
}

