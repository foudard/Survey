package service;

import model.User;

public interface IUserService {
    User findByLogin(String login);
    User save(User user);
}
