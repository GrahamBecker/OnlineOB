package repository;

import domain.KeyRegister;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public interface KeyRegisterRepository extends CrudRepository<KeyRegister, Long> {

    KeyRegister findById(Long keyId);
}
