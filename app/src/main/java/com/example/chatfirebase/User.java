package com.example.chatfirebase;

public class User {

    private final String uuid;
    private final String username;
    private final String profileUrl;

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
