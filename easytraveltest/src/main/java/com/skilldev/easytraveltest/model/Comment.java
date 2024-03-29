package com.skilldev.easytraveltest.model;

import jakarta.persistence.*;

@Entity
public class Comment extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String text;

    public Comment() {}

    public Comment(Activity activity, User user, String text) {
        this.activity = activity;
        this.user = user;
        this.text = text;
    }


    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}