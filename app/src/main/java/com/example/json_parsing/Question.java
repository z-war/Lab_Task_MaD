package com.example.json_parsing;

public class Question {
    private String que;
    private String[] opt1;

    public Question(String que, String[] opt1) {
        this.que = que;
        this.opt1 = opt1;
    }

    public String getQue() {
        return que;
    }

    public String[] getOpt1() {
        return opt1;
    }
}
