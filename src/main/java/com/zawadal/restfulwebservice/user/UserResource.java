package com.zawadal.restfulwebservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retriveAllUsers (){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User reytiveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUsers(@RequestBody User user) {
        User savedUser = service.save(user);
    }
}
