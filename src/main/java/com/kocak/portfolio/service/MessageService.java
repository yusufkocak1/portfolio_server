package com.kocak.portfolio.service;

import com.kocak.portfolio.DAO.Message;
import com.kocak.portfolio.dto.MessageDTO;
import com.kocak.portfolio.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageService {


    public String saveMessage(MessageDTO messageDTO) {
        Message message = new Message();
        message.fill(messageDTO);
        return "";//messageRepository.save(message).toString();
    }
    public List<Message> getMessage(MessageDTO messageDTO) {
       // List<Message> message = messageRepository.findByFromIDAndToID(messageDTO.getFromID(),messageDTO.getToID());
        return null;
    }
}

