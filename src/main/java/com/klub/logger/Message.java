package com.klub.logger;

import java.util.HashMap;

public class Message {

    private String from;
    private String text;


    private HashMap<String, Object> data = new HashMap<>();


    public String getText() {
        return text;
    }

    public String getFrom() {
        return from;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
