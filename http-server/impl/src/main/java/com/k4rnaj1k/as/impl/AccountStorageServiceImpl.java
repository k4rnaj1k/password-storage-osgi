package com.k4rnaj1k.as.impl;

import com.k4rnaj1k.as.api.AccountStorageService;

public class AccountStorageServiceImpl implements AccountStorageService {
    public AccountStorageServiceImpl() {
        System.out.println("Account storage service starting...");
    }


    @Override
    public String hello() {
        return "Hello World!";
    }
}
