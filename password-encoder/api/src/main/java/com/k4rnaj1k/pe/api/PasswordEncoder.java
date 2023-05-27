package com.k4rnaj1k.pe.api;

public interface PasswordEncoder {
    String encode(String password, String key);
    String decode(String encodedPassword, String key);
}
