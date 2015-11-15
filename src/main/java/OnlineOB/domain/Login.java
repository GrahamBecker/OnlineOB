package OnlineOB.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Entity
public class Login implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userId")
    private UserInfo userInfos;

    private Login(){}

    public Login(Builder builder){
        id=builder.id;
        userName=builder.userName;
        password=builder.password;
    }
    public Long getId(){
        return id;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }

    public static class Builder{
        private Long id;
        private String userName;
        private String password;
        public Builder(Long userId){
            this.id=id;
        }
        public Builder userName(String userName){
            this.userName=userName;
            return this;
        }
        public Builder password(String password){
            this.password=password;
            return this;
        }

        public Builder copy(Login value){
            this.id=value.id;
            this.userName=value.userName;
            this.password=value.password;
            return this;
        }
        public Login build(){
            return new Login(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return id.equals(login.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    @Override
    public String toString() {
        return "Login{" +
                "Login Id = " + id + "," +
                "User Name = " + userName + "," +
                "Password= " + password + "," +
                "}";
    }
}
