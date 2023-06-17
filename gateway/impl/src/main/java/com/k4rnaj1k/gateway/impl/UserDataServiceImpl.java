package com.k4rnaj1k.gateway.impl;

import com.k4rnaj1k.gateway.api.UserDataService;
import com.k4rnaj1k.gateway.api.UserDataState;
import com.k4rnaj1k.gateway.api.model.request.SaveUserDataRequest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
public class UserDataServiceImpl implements UserDataService {

    @PersistenceContext(unitName = "account-storage-hibernate")
    private EntityManager entityManager;

    @Override
    public UserDataState register(SaveUserDataRequest request) {

        //todo: save to database the username and status submitted
        return UserDataState.SUBMITTED;
    }
}
