package com.jwt.implementation.controllers;

import com.jwt.implementation.models.User;
import com.jwt.implementation.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private UserService userService;
//    http://localhost:8080/home/users
    @GetMapping("/users")
    public List<User> getUser(HttpServletRequest request){
        logger.info("Getting Users info.");
        return userService.getUsers();
    }
}
