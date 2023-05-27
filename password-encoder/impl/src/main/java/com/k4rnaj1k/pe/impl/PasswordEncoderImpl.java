package com.k4rnaj1k.pe.impl;

import com.k4rnaj1k.pe.api.PasswordEncoder;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.osgi.service.component.annotations.Component;

@Component(service = {PasswordEncoder.class})
public class PasswordEncoderImpl implements PasswordEncoder {
    public PasswordEncoderImpl() {
        System.out.println("Starting");
    }

    @Override
    public String encode(String password, String key) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(key);
        return encryptor.encrypt(password);
    }

    @Override
    public String decode(String encodedPassword, String key) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(key);
        return encryptor.decrypt(encodedPassword);
    }
}
