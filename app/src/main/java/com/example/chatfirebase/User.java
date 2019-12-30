package com.example.chatfirebase;

public class User {

    private String username;
    private String profileUrl;
    private  String uuid;

    public User(){
    }

    public User(String usid, String username, String profileUrl) {
        this.uuid = usid;
        this.username = username;
        this.profileUrl = profileUrl;
    }

    public String getUsid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

}
