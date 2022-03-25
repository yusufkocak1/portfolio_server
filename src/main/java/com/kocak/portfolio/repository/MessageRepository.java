package com.kocak.portfolio.repository;

import com.kocak.portfolio.DAO.Message;
import com.kocak.portfolio.dto.MessageDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByFromIDAndToID (long fromID, long toID);
}

