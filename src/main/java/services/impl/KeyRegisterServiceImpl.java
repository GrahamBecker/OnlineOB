package services.impl;

import domain.KeyRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.KeyRegisterService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/11.
 */
@Service
public class KeyRegisterServiceImpl implements KeyRegisterService {

    @Autowired
    private KeyRegisterService repo;

    @Override
    public KeyRegister findById(Long id){
        return repo.findById(id);
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
        List<KeyRegister> allKeyRegisters = new ArrayList<>();
        Iterable<KeyRegister> keyRegisters = repo.findAll();
        for(KeyRegister keyRegister : keyRegisters){
            allKeyRegisters.add(keyRegister);
        }
        return allKeyRegisters;
    }
}
