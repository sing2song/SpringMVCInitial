package com.signin.repository;

import com.signin.data.UserData;

public interface Repository {
    UserData selectUserByUserId(String userId);
    void insertUserData(UserData userData);
}
