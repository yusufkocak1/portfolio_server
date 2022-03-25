package com.kocak.server.repository;

import com.kocak.server.DAO.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByFromIDAndToID (long fromID, long toID);
}

