package dao;

import model.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by flori_000 on 16/05/2017.
 */
@Repository
public interface ResponseDao extends CrudRepository<Response, Integer> {
}
