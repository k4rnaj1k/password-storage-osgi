package com.k4rnaj1k.gateway.impl.model;

import com.k4rnaj1k.gateway.api.UserDataState;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class AccountData {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String passwordEncoded;
    private UserDataState state;
}
