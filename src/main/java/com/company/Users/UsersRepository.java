package com.company.Users;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository {
    private List<Users> usersList = new ArrayList<>();

    public List<Users> getAll() {
        return usersList;
    }

    public String create(Users users) {
        for (Users u : usersList) {
            if (u.getId() == users.getId()) {
                return "User already exists";
            }
        }
        usersList.add(users);
        return "User created";
    }

    public String update(int id, Users users) {
        for (Users u : usersList) {
            if (u.getId() == id) {
                u.setName(users.getName());
                u.setGmail(users.getGmail());
                return "User updated";
            }
        }
        return "User not found or operation failed";
    }

    public String delete(int id) {
        for (Users u : usersList) {
            if (u.getId() == id) {
                usersList.remove(u);
                return "User deleted";
            }
        }
        return "User not found or operation failed";
    }


    public Users getById(int id) {
        for (Users u : usersList) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
