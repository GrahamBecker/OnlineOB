package services;

import java.util.List;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public interface Services<S, ID> {

    public S findById(ID id);

    public S save(S entity);

    public S update(S entity);

    public void delete(S entity);

    public List<S> findAll();
}
