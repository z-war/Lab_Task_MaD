package com.example.json_parsing;

import com.google.gson.annotations.SerializedName;

import javax.security.auth.Subject;

public class User {
    private String name;
    private int dob ;
    private int phone;
    @SerializedName("subj")
    private subject subj;

    public User(String name, int dob, int phone, subject subj) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.subj = subj;
    }

    public String getName() {
        return name;
    }

    public int getDob() {
        return dob;
    }

    public int getPhone() {
        return phone;
    }

    public subject getSubj() {
        return subj;
    }
}
