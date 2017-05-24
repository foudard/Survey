package dao;

import model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by flori_000 on 16/05/2017.
 */
@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    User findByLogin(String login);
}
