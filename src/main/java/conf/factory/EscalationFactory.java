package conf.factory;

import domain.Escalation;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public class EscalationFactory {

    public static Escalation createEscalation(Long escalationId, String description, String contactPerson, String contactNo){

        Escalation escalation = new Escalation
                .Builder(escalationId)
                .description(description)
                .contactPerson(contactPerson)
                .contactNo(contactNo)
                .build();
        return escalation;
    }
}
