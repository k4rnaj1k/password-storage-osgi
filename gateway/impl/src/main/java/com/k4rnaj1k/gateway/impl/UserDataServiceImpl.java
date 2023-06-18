package com.k4rnaj1k.gateway.impl;

import com.k4rnaj1k.gateway.api.UserDataService;
import com.k4rnaj1k.gateway.api.UserDataState;
import com.k4rnaj1k.gateway.api.model.request.SaveUserDataRequest;
import com.k4rnaj1k.gateway.impl.model.AccountData;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class UserDataServiceImpl implements UserDataService {

    @PersistenceContext(unitName = "account-storage-hibernate")
    private EntityManager entityManager;

    @Override
    @Transactional
    public Long register(SaveUserDataRequest request) {
        AccountData result = AccountData.builder().username(request.getUsername()).state(UserDataState.SUBMITTED).build();
        entityManager.persist(result);
        entityManager.flush();
        return result.getId();
    }
}
