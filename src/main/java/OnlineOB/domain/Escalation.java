package OnlineOB.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Entity
public class Escalation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String description;
    private String contactPerson;
    private String contactNo;

    private Escalation(){
    }
    public Long getId(){
        return Id;
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
        Id=builder.Id;
        description=builder.description;
        contactPerson=builder.contactPerson;
        contactNo=builder.contactNo;
    }

    public static class Builder{
        private Long Id;
        private String description;
        private String contactPerson;
        private String contactNo;

        public Builder copy(Escalation value){
            this.Id=value.Id;
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
        public Builder(Long Id){
            this.Id = Id;
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
        return Id.equals(esc.Id);
    }
    @Override
    public int hashCode() {
        return Id.hashCode();
    }
    @Override
    public String toString() {
        return "Escalation{" +
                "Escalation Id = " + Id + "," +
                "Description = " + description + "," +
                "Contact Person= " + contactPerson + "," +
                "Contact Number= " + contactNo + "," +
                "}";
    }
}
