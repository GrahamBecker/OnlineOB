package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/10.
 */
@Entity
public class Login implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String password;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userId")
    private List<UserInfo> userInfos;

    private Login(){}

    public Login(Builder builder){
        userId=builder.userId;
        userName=builder.userName;
        password=builder.password;
    }
    public Long getUserId(){
        return userId;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }

    public static class Builder{
        private Long userId;
        private String userName;
        private String password;
        public Builder(Long userId){
            this.userId=userId;
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
            this.userId=value.userId;
            this.userName=value.userName;
            this.password=value.password;
            return this;
        }
        public Login build(){
            return new Login(this);
        }
    }

}

