package service;

import model.Role;

/**
 * Created by Val on 24/05/2017.
 */
public interface IRoleService {
    Role findByName(String name);
}
