package com.kocak.server.controller;

import com.kocak.server.dto.UserLoginDTO;
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
