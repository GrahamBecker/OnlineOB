package services.impl;

import domain.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.LoginService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/11.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginService repo;

    @Override
    public Login findById(Long id){
        return repo.findById(id);
    }
    @Override
    public Login save(Login entity){
        return repo.save(entity);
    }
    @Override
    public Login update(Login entity){
        return repo.save(entity);
    }
    @Override
    public void delete(Login entity){
        repo.delete(entity);
    }
    @Override
    public List<Login> findAll(){
        List<Login> allLogins = new ArrayList<>();
        Iterable<Login> logins = repo.findAll();
        for(Login login : logins){
            allLogins.add(login);
        }
        return allLogins;
    }
}
