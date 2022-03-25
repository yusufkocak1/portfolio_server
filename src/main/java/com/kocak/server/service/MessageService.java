package com.kocak.server.service;

import com.kocak.server.DAO.Message;
import com.kocak.server.dto.MessageDTO;
import com.kocak.server.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageService {

@Autowired
MessageRepository messageRepository;

    public String saveMessage(MessageDTO messageDTO) {
        Message message = new Message();
        message.fill(messageDTO);
        return messageRepository.save(message).toString();
    }
    public List<Message> getMessage(MessageDTO messageDTO) {
        List<Message> message = messageRepository.findByFromIDAndToID(messageDTO.getFromID(),messageDTO.getToID());
        return message;
    }
}

