package OnlineOB.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Entity
public class KeyRegister implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String keyNo;
    private String issuedTo;
    private String dateIssued;
    private String returnedBy;
    private String dateReturned;

    private KeyRegister(){
    }
    public Long getId(){
        return Id;
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
        Id=builder.Id;
        keyNo=builder.keyNo;
        issuedTo=builder.issuedTo;
        dateIssued=builder.dateIssued;
        returnedBy=builder.returnedBy;
        dateReturned=builder.dateReturned;
    }
    public static class Builder{
        private Long Id;
        private String keyNo;
        private String issuedTo;
        private String dateIssued;
        private String returnedBy;
        private String dateReturned;

        public Builder copy(KeyRegister value){
            this.Id=value.Id;
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
            this.Id = keyId;
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
        return Id.equals(keyRegister.Id);
    }
    @Override
    public int hashCode() {
        return Id.hashCode();
    }
    @Override
    public String toString() {
        return "Key Register{" +
                "Key Id = " + Id + "," +
                "Key Number = " + keyNo + "," +
                "Issued To = " + issuedTo + "," +
                "Date Issued = " + dateIssued + "," +
                "Returned By = " + returnedBy + "," +
                "Date Returned = " + dateReturned + "," +
                "}";
    }
}
