package com.kea.attendance.Service;

import com.kea.attendance.Model.User;
import com.kea.attendance.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User findUserByEmail(String email) {
        return userRepository.getByEmail(email);
    }
}
