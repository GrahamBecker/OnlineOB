package repository;

import domain.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

    UserInfo findById(Long id);
}
