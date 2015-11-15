package OnlineOB.services.impl;

import OnlineOB.domain.Escalation;
import OnlineOB.repository.EscalationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import OnlineOB.services.EscalationService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Service
public class EscalationServiceImpl implements EscalationService {
    @Autowired
    private EscalationRepository repo;

   @Override
    public Escalation findById(Long id){
        return repo.findOne(id);
    }
    @Override
    public Escalation save(Escalation entity){
        return repo.save(entity);
    }
    @Override
    public Escalation update(Escalation entity){
        return repo.save(entity);
    }
    @Override
    public void delete(Escalation entity){
        repo.delete(entity);
    }
    @Override
    public List<Escalation> findAll(){
        List<Escalation> allEscalations = new ArrayList<Escalation>();
        Iterable<Escalation> escalations = repo.findAll();
        for(Escalation escalation : escalations){
            allEscalations.add(escalation);
        }
        return allEscalations;
    }
}
