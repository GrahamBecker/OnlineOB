package OnlineOB.services.impl;

import OnlineOB.domain.Login;
import OnlineOB.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import OnlineOB.services.LoginService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository repo;
    @Override
    public Login findById(Long id){
        return repo.findOne(id);
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
        List<Login> allLogins = new ArrayList<Login>();
        Iterable<Login> logins = repo.findAll();
        for(Login login : logins){
            allLogins.add(login);
        }
        return allLogins;
    }
}
