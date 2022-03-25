package com.kocak.portfolio.controller;

import com.kocak.portfolio.DAO.Message;
import com.kocak.portfolio.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kocak.portfolio.service.MessageService;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MessengerController {
    @Autowired
    MessageService messageService;

    @RequestMapping(path = "/sendMessage", method = RequestMethod.POST)
    public String sendMessages(@RequestBody MessageDTO message){

        return  messageService.saveMessage(message);
    }
    @RequestMapping(path = "/getMessage", method = RequestMethod.POST)
    public List<Message> getMessages(@RequestBody MessageDTO message){

        return  messageService.getMessage(message);
    }
}
