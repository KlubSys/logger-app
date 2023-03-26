package com.klub.logger;

import java.util.HashMap;

public class OutputMessage {

    private String from;
    private String text;
    private String time;


    private HashMap<String, Object> data = new HashMap<>();

    public OutputMessage(final String from, final String text, final String time) {

        this.from = from;
        this.text = text;
        this.time = time;
    }

    public OutputMessage(String from, String text, String time, HashMap<String, Object> data) {
        this.from = from;
        this.text = text;
        this.time = time;
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
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
