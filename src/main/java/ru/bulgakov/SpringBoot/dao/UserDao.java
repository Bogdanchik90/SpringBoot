package ru.bulgakov.SpringBoot.dao;


import ru.bulgakov.SpringBoot.model.Users;

import java.util.List;

public interface UserDao {
    List<Users> getAllUsers();

    void addUser(Users users);

    void editUser(int id, Users updateUsers);

    void deleteUser(int id);

    Users getUserById(int id);
}
