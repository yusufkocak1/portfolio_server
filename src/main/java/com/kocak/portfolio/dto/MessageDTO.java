package com.kocak.portfolio.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable {
    private long fromID;
    private long toID;
    private String messageText;

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

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
