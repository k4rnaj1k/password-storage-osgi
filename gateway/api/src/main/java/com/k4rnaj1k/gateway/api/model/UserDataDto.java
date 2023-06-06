package com.k4rnaj1k.gateway.api.model;

import com.k4rnaj1k.gateway.api.UserDataState;
import lombok.Data;

@Data
public class UserDataDto {
    private String username;
    private UserDataState state;
    private String password;
}
