package repository;

import domain.Escalation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public interface EscalationRepository extends CrudRepository<Escalation, Long>{

    Escalation findById(Long escalationId);
}
