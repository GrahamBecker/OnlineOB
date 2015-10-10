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
    private Long userId;
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
    public Long getUserId() {
        return userId;
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
        userId = builder.userId;
        firstName = builder.firstName;
        lastName = builder.lastName;
        dob = builder.dob;
        address = builder.address;
        contact = builder.contact;
        idNumber = builder.idNumber;
    }
    public static class Builder {
        private Long userId;
        private String firstName;
        private String lastName;
        private String dob;
        private String address;
        private String contact;
        private String idNumber;
        public Builder copy(UserInfo value) {
            this.userId = value.userId;
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
        public Builder(Long userId) {
            this.userId = userId;
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
        return userId.equals(userInfo.userId);
    }
    @Override
    public int hashCode() {
        return userId.hashCode();
    }
    @Override
    public String toString() {
        return "User{" +
                "Last Name = " + lastName + "," +
                "First Name = " + firstName + "," +
                "Date of Birth = " + dob + "," +
                "Address = " + address + "," +
                "Contact = " + contact + "," +
                "ID Number = " + idNumber + "," +
                "}";
    }
}