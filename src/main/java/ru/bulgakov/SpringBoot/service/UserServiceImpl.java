package ru.bulgakov.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bulgakov.SpringBoot.dao.UserDao;
import ru.bulgakov.SpringBoot.model.Users;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(Users users) {
        userDao.addUser(users);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void editUser(int id, Users updateUsers) {
        userDao.editUser(id, updateUsers);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Users getUserById(int id) {
        return userDao.getUserById(id);
    }
}
