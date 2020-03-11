package com.example.json_parsing;

public class Quiz {
    private String subjname;
    private Question q1;

    public Quiz(String subjname, Question q1) {
        this.subjname = subjname;
        this.q1 = q1;
    }

    public String getSubjname() {
        return subjname;
    }

    public Question getQ1() {
        return q1;
    }
}
