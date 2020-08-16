package com.sdonjava.userservice.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Validated
@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

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
     * GET user by id
     */
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id) {
        logger.info("Searched user by id "+ id);
        return userService.getUserById(Long.parseLong(id));
    }

    /**
     * GET select user on the search criteria of surname
     */
    @GetMapping("/users")
    public List<User> getUserByQueryParam(@RequestParam(name = "surName", required = false) String surname) {

        List<User> userList;
        /*
         *  Validate the surname in the Request Param
         */
        if (isNotBlank(surname)) {
            logger.info("Searched user by surName "+ surname);
            userList = userService.getUserBySurName(surname);
        } else {
            userList = userService.getAllUsers();
        }

        return userList;
    }

    /**
     * POST to add user
     */
    @PostMapping("/users")
    @NotEmpty(message = "Input user cannot be empty.")
    public void addUser(@Valid @RequestBody User user) {
        logger.info("Add User");
        userService.addUser(user);

    }


}
