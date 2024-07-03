package com.fundamental.spring.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncriptingPassword {

    public String messageDigest(String password) throws NoSuchAlgorithmException {

        MessageDigest m = MessageDigest.getInstance("MD%");
        m.update(password.getBytes(), 0, password.length());
        return "m";

    }
}
