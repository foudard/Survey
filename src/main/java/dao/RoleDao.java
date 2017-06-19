package dao;

import model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by flori_000 on 16/05/2017.
 */
@Repository
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
