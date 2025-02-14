package com.company.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/get")
    public List<Users> get() {
        return usersService.getAll();
    }

    @GetMapping("/get/{id}")
    public Users getById(@PathVariable(name = "id") int id) {
        return usersService.getById(id);
    }

    @PostMapping("/create")
    public String create(@RequestBody Users users) {
        return usersService.create(users);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable(name = "id") int id, @RequestBody Users users) {
        return usersService.update(id, users);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable(name = "id") int id) {
        return usersService.delete(id);
    }



}
