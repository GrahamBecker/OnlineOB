package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/10.
 */
@Entity
public class KeyRegister implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long keyId;
    private String keyNo;
    private String issuedTo;
    private String dateIssued;
    private String returnedBy;
    private String dateReturned;

    private KeyRegister(){
    }
    public Long getKeyId(){
        return keyId;
    }
    public String getKeyNo(){
        return keyNo;
    }
    public String getIssuedTo(){
        return issuedTo;
    }
    public String getDateIssued(){
        return dateIssued;
    }
    public String getReturnedBy(){
        return returnedBy;
    }
    public String getDateReturned(){
        return dateReturned;
    }
    public KeyRegister(Builder builder){
        keyId=builder.keyId;
        keyNo=builder.keyNo;
        issuedTo=builder.issuedTo;
        dateIssued=builder.dateIssued;
        returnedBy=builder.returnedBy;
        dateReturned=builder.dateReturned;
    }
    public static class Builder{
        private Long keyId;
        private String keyNo;
        private String issuedTo;
        private String dateIssued;
        private String returnedBy;
        private String dateReturned;

        public Builder copy(KeyRegister value){
            this.keyId=value.keyId;
            this.keyNo=value.keyNo;
            this.issuedTo=value.issuedTo;
            this.dateIssued=value.dateIssued;
            this.returnedBy=value.returnedBy;
            this.dateReturned=value.dateReturned;
            return this;
        }

        public Builder keyNo(String value){
            this.keyNo = value;
            return this;
        }
        public Builder issuedTo(String value){
            this.issuedTo = value;
            return this;
        }
        public Builder dateIssued(String value){
            this.dateIssued = value;
            return this;
        }
        public Builder returnedBy(String value){
            this.returnedBy = value;
            return this;
        }
        public Builder dateReturned(String value){
            this.dateReturned = value;
            return this;
        }
        public Builder(Long keyId) {
            this.keyId = keyId;
        }
        public KeyRegister build(){
            return new KeyRegister(this);
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyRegister keyRegister = (KeyRegister) o;
        return keyId.equals(keyRegister.keyId);
    }
    @Override
    public int hashCode() {
        return keyId.hashCode();
    }
    @Override
    public String toString() {
        return "Key Register{" +
                "Key Id = " + keyId + "," +
                "Key Number = " + keyNo + "," +
                "Issued To = " + issuedTo + "," +
                "Date Issued = " + dateIssued + "," +
                "Returned By = " + returnedBy + "," +
                "Date Returned = " + dateReturned + "," +
                "}";
    }
}
