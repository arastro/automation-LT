package com.saucedemo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginModel {

    private String username;
    private String password;

    public static LoginModel setLoginModel(List<String> loginData){
        return LoginModel.builder()
                .username(loginData.get(0).trim())
                .password(loginData.get(1).trim())
                .build();
    }
}
