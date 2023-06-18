package com.k4rnaj1k.as.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PasswordDto {
    private String plainPassword;
    private Long userId;
}
