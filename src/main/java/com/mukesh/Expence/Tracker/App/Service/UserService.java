package com.mukesh.Expence.Tracker.App.Service;

import org.springframework.stereotype.Service;

import com.mukesh.Expence.Tracker.App.Model.User;

@Service
public interface UserService {
    void saveNewUser(User user);
    User findByEmail(String email);
    
}

