package com.duytran.service.impl;

import com.duytran.model.User;
import com.duytran.service.UserService;
import com.duytran.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImpl2 implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }
}
