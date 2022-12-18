package com.springlearning.frenchlearning.backend.service;

import com.springlearning.frenchlearning.backend.entity.LoginDetails;
import com.springlearning.frenchlearning.backend.entity.Users;

public interface UserService {
    public String saveNewUser(Users user);

    public String checkPass(LoginDetails data);
}
