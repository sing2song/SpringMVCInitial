package com.signin.repository;

import com.signin.data.UserData;

public interface Repository {
    UserData selectUserByUserId(String userId);

    void insertUser(UserData user);

    void updateUser(UserData user);

    UserData selectUserDataByUserId(String userId);
}
