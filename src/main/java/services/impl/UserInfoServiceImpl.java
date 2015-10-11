package services.impl;

import domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.UserInfoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Becker on 2015/10/11.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoService repo;

    @Override
    public UserInfo findById(Long id){
        return repo.findById(id);
    }
    @Override
    public UserInfo save(UserInfo entity){
        return repo.save(entity);
    }
    @Override
    public UserInfo update(UserInfo entity){
        return repo.save(entity);
    }
    @Override
    public void delete(UserInfo entity){
        repo.delete(entity);
    }
    @Override
    public List<UserInfo> findAll(){
        List<UserInfo> allUserInfos = new ArrayList<>();
        Iterable<UserInfo> userInfos = repo.findAll();
        for(UserInfo userInfo : userInfos){
            allUserInfos.add(userInfo);
        }
        return allUserInfos;
    }
}
