package ru.bulgakov.SpringBoot.service;


import ru.bulgakov.SpringBoot.model.Users;

import java.util.List;

public interface UserService {
    void addUser(Users users);

    List<Users> getAllUsers();

    void editUser(int id, Users updateUsers);

    void deleteUser(int id);

    Users getUserById(int id);

}
