package com.k4rnaj1k.as.impl;

import com.k4rnaj1k.as.api.AccountStorageService;
import com.k4rnaj1k.as.api.model.TestDTO;

public class AccountStorageServiceImpl implements AccountStorageService {

    @Override
    public TestDTO hello() {
        return new TestDTO("Test");
    }
}
