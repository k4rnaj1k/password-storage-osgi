package com.k4rnaj1k.gateway.impl.model;

import com.k4rnaj1k.gateway.api.UserDataState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountData {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String passwordEncoded;
    @Enumerated(EnumType.STRING)
    private UserDataState state;
}
