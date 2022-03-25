package com.kocak.server.DAO;

import com.kocak.server.dto.MessageDTO;
import com.kocak.server.util.DateTimeUtil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long fromID;
    private long toID;
    private String date;
    private String messageText;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFromID() {
        return fromID;
    }

    public void setFromID(long fromID) {
        this.fromID = fromID;
    }

    public long getToID() {
        return toID;
    }

    public void setToID(long toID) {
        this.toID = toID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void fill(MessageDTO messageDTO) {
        setToID(messageDTO.getToID());
        setFromID(messageDTO.getFromID());
        setMessageText(messageDTO.getMessageText());
        setDate(DateTimeUtil.getCurentDateTime());
    }

    @Override
    public String toString() {
        return "{\"Message\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"fromID\":\"" + fromID + "\""
                + ",                         \"toID\":\"" + toID + "\""
                + ",                         \"date\":\"" + date + "\""
                + ",                         \"messageText\":\"" + messageText + "\""
                + "}}";
    }
}
