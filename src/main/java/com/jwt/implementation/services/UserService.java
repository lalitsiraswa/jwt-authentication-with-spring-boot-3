package com.jwt.implementation.services;

import com.jwt.implementation.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(UUID.randomUUID().toString(), "Lalit Siraswa", "lalit@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Suraj Dadheech", "suraj@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "JyotiPrakash", "jyotiprakash@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Karthik", "karthik@gmail.com"));
    }
    public List<User> getUsers(){
        return userList;
    }
}
