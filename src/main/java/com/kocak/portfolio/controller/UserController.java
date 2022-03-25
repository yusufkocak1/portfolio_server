package com.kocak.portfolio.controller;

import com.kocak.portfolio.dto.UserLoginDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(path = "login",method = RequestMethod.POST)
    public String login(@RequestBody UserLoginDTO user){

    return "succes";
    }
}
