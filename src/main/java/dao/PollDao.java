package dao;

import model.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by flori_000 on 16/05/2017.
 */
@Repository
public interface PollDao extends CrudRepository<Poll, Integer> {

}
