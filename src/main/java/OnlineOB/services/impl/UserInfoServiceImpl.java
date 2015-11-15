package OnlineOB.services.impl;

import OnlineOB.domain.UserInfo;
import OnlineOB.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import OnlineOB.services.UserInfoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chantell witbooi on 11/14/2015.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoRepository repo;

    @Override
    public UserInfo findById(Long id){
        return repo.findOne(id);
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
        List<UserInfo> allUserInfos = new ArrayList<UserInfo>();
        Iterable<UserInfo> userInfos = repo.findAll();
        for(UserInfo userInfo : userInfos){
            allUserInfos.add(userInfo);
        }
        return allUserInfos;
    }

}
