package services.impl;

import domain.Escalation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.EscalationService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/11.
 */
@Service
public class EscalationServiceImpl implements EscalationService {

    @Autowired
    private EscalationService repo;

    @Override
    public Escalation findById(Long id){
        return repo.findById(id);
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
        List<Escalation> allEscalations = new ArrayList<>();
        Iterable<Escalation> escalations = repo.findAll();
        for(Escalation escalation : escalations){
            allEscalations.add(escalation);
        }
        return allEscalations;
    }
}
