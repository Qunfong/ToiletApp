package com.man.toiletapp;

import android.text.TextUtils;

import java.util.Arrays;

public class Session {
    private String mName;
    private User mOwner;
    private User[] mParticipants;

    public Session(String name, User owner, User[] participants) {
        mName = name;
        this.mOwner = owner;
        this.mParticipants = participants;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public User getOwner() {
        return mOwner;
    }

    public void setOwner(User owner) {
        this.mOwner = owner;
    }

    public User[] getParticipants() {
        return mParticipants;
    }

    public void setParticipants(User[] participants) {
        this.mParticipants = participants;
    }

    public String getParticipantList(){
        StringBuilder stringBuilder = new StringBuilder();
        for (User user: mParticipants) {
            stringBuilder.append(user.getName()).append(",");
        }
        return stringBuilder.substring(0,stringBuilder.toString().length()-1);
    }
}
