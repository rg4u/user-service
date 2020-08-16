package com.sdonjava.userservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.isBlank;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * TODO -
     * GET all users
     */
    /*@GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }*/

    /**
     *
     * GET user by id
     */
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(Long.parseLong(id));
    }

    /**
     *
     * GET select user on the search criteria of surname
     */
    @GetMapping("/users")
    public List<User> getUserByQueryParam(@RequestParam(name = "surname", required = false) String surname) {
       if(isNotBlank(surname))
       {
           return userService.getUserBySurName(surname);
       }
       else {
           return userService.getAllUsers();
       }

    }

    /**
     *
     * POST to add user
     */
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);

    }


}
