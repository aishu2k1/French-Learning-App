package com.springlearning.frenchlearning.backend.controller;

import com.springlearning.frenchlearning.backend.entity.LoginDetails;
import com.springlearning.frenchlearning.backend.entity.Users;
import com.springlearning.frenchlearning.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sign")
    public String saveNewUser(@RequestBody Users user){
        return userService.saveNewUser(user);
    }

    @PostMapping("/signin")
    public String authenticateUser(@RequestBody LoginDetails data){
        return userService.checkPass(data);
    }
}
