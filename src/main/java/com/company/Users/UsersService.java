package com.company.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAll() {
        return usersRepository.getAll();
    }

    public String create(Users users) {
        return usersRepository.create(users);
    }

    public String update(int id, Users users) {
        return usersRepository.update(id, users);
    }

    public String delete(int id) {
        return usersRepository.delete(id);
    }

    public Users getById(int id) {
        return usersRepository.getById(id);
    }
}
