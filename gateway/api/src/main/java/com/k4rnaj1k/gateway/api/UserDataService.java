package com.k4rnaj1k.gateway.api;

import com.k4rnaj1k.gateway.api.model.request.SaveUserDataRequest;

public interface UserDataService {
    UserDataState register(SaveUserDataRequest request);
}