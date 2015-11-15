package OnlineOB.services.impl;

import OnlineOB.domain.KeyRegister;
import OnlineOB.repository.KeyRegisterRepository;
import OnlineOB.services.KeyRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Service
public class KeyRegisterServiceImpl implements KeyRegisterService {
    @Autowired
    private KeyRegisterRepository repo;
    @Override
    public KeyRegister findById(Long id){
        return repo.findOne(id);
    }
    @Override
    public KeyRegister save(KeyRegister entity){
        return repo.save(entity);
    }
    @Override
    public KeyRegister update(KeyRegister entity){
        return repo.save(entity);
    }
    @Override
    public void delete(KeyRegister entity){
        repo.delete(entity);
    }
    @Override
    public List<KeyRegister> findAll(){
        List<KeyRegister> allKeyRegisters = new ArrayList<KeyRegister>();
        Iterable<KeyRegister> keyRegisters = repo.findAll();
        for(KeyRegister keyRegister : keyRegisters){
            allKeyRegisters.add(keyRegister);
        }
        return allKeyRegisters;
    }
}
