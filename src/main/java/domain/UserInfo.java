package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 * Created by Graham Becker on 2015/09/20.
 */
@Entity
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String contact;
    private String idNumber;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="userId")
    private List<KeyRegister> keyRegisters;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="userId")
    private List<Event> events;

    private UserInfo() {
    }
    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDob() {
        return dob;
    }
    public String getAddress() {
        return address;
    }
    public String getContact() {
        return contact;
    }
    public String getIdNumber(){
        return idNumber;
    }
    public UserInfo(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        dob = builder.dob;
        address = builder.address;
        contact = builder.contact;
        idNumber = builder.idNumber;
    }
    public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String dob;
        private String address;
        private String contact;
        private String idNumber;
        public Builder copy(UserInfo value) {
            this.id = value.id;
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            this.dob = value.dob;
            this.address = value.address;
            this.contact = value.contact;
            this.idNumber = value.idNumber;
            return this;
        }
        public Builder firstName(String value) {
            this.firstName = value;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder dob(String value) {
            this.dob = value;
            return this;
        }
        public Builder address(String value) {
            this.address = value;
            return this;
        }
        public Builder contact(String value) {
            this.contact = value;
            return this;
        }
        public Builder idNumber(String value) {
            this.idNumber = value;
            return this;
        }
        public Builder(Long id) {
            this.id = id;
        }
        public UserInfo build() {
            return new UserInfo(this);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return id.equals(userInfo.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    @Override
    public String toString() {
        return "User{" +
                "User Id = " + id + "," +
                "Last Name = " + lastName + "," +
                "First Name = " + firstName + "," +
                "Date of Birth = " + dob + "," +
                "Address = " + address + "," +
                "Contact = " + contact + "," +
                "ID Number = " + idNumber + "," +
                "}";
    }
}