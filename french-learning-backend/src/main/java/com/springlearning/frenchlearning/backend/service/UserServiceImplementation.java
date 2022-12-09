package com.springlearning.frenchlearning.backend.service;

import com.springlearning.frenchlearning.backend.entity.LoginDetails;
import com.springlearning.frenchlearning.backend.entity.Users;
import com.springlearning.frenchlearning.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public String saveNewUser(Users user) {
        String uid=user.getEmail();
        if(userRepository.existsById(uid)){
            return "User with the given email already exists";
        }
        userRepository.save(user);
        return "User has been created";
    }

    @Override
    public String checkPass(LoginDetails data) {
        String pass=data.getPassWord();
        if(!userRepository.existsById(data.getUserName())){
            return "Username does not exist";
        }
        String actualPass=userRepository.getById(data.getUserName()).getPassword();
        if(pass.equals(actualPass)){
            return "Successfully signed in";
        }
        else{
            return "Enter correct password";
        }
    }
}
