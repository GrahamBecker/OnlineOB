package conf.factory;

import domain.UserInfo;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public class UserInfoFactory {

    public static UserInfo createUserInfo(Long id, String fName, String lName, String dob, String address, String idNumber, String contact){
        UserInfo userInfo = new UserInfo
                .Builder(id)
                .firstName(fName)
                .lastName(lName)
                .dob(dob)
                .address(address)
                .idNumber(idNumber)
                .contact(contact)
                .build();
        return userInfo;
    }
}
