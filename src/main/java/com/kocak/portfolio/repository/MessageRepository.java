package com.kocak.portfolio.repository;

import com.kocak.portfolio.DAO.Message;


import java.util.List;

//@Repository
public interface MessageRepository  {
    List<Message> findByFromIDAndToID (long fromID, long toID);
}

