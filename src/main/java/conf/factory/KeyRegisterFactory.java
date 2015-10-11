package conf.factory;

import domain.KeyRegister;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public class KeyRegisterFactory {

    public static KeyRegister createKeyRegister(Long keyid, String keyNo, String issuedTo, String dateIssued, String returnedBy, String dateReturned){

        KeyRegister keyRegister = new KeyRegister
                .Builder(keyid)
                .keyNo(keyNo)
                .issuedTo(issuedTo)
                .dateIssued(dateIssued)
                .returnedBy(returnedBy)
                .dateReturned(dateReturned)
                .build();
        return keyRegister;
    }
}
