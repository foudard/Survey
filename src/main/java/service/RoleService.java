package service;

import dao.RoleDao;
import model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Val on 24/05/2017.
 */
@Service
public class RoleService implements IRoleService{
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByName(String name) {
        return roleDao.findByName(name);
    }
}
