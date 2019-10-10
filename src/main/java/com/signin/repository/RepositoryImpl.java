package com.signin.repository;

import com.signin.data.UserData;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryImpl implements com.signin.repository.Repository {

    @Autowired
    private SqlSession sqlSession;

    private static final String MAPPER = "mapper.";

    @Override
    public UserData selectUserDataByUserId(String userId) {
        return sqlSession.selectOne("mapper.selectUserData", userId);
    }

    @Override
    public UserData selectUserByUserId(String userId) {
        return sqlSession.selectOne(MAPPER +"selectUser", userId);
    }

    @Override
    public void insertUser(UserData user) {
        sqlSession.selectOne("mapper.insertUser", user);
    }

    @Override
    public void updateUser(UserData user) {

    }
}
