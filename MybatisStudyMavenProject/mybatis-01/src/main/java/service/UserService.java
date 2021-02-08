package service;

import pojo.User;

public interface UserService{
    public User login();
    public User login(User user);
}
