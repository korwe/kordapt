package com.korwe.kordapt.acl;

/**
 * Created by tjad on 2015/05/26.
 */
public class TreeCredentials {
    private final String username;
    private final String password;

    public TreeCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Object getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
