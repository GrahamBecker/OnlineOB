package repository;

import domain.Login;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public interface LoginRepository extends CrudRepository<Login, Long> {

    Login findById(Long id);
}
