package com.signin.service;

import com.signin.data.UserData;

public interface UserService {
    boolean isLogin(UserData user);
    void createUserData(UserData userData);
}
