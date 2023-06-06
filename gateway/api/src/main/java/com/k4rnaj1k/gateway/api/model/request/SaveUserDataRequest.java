package com.k4rnaj1k.gateway.api.model.request;

import lombok.Data;

@Data
public class SaveUserDataRequest {
    private String username;
    private String password;
}
