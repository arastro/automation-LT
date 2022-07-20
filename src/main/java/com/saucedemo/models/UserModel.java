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
public class UserModel {

    private String name;
    private String lastname;
    private String zip;

    public static UserModel setUserModel(List<String> userData){
        return UserModel.builder()
                .name(userData.get(0).trim())
                .lastname(userData.get(1).trim())
                .zip(userData.get(2).trim())
                .build();
    }
}
