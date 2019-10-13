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

    public UserData selectUserByUserId(String userId) {
        return sqlSession.selectOne(MAPPER +"selectUser", userId);
    }

    @Override
    public void insertUserData(UserData userData) {
        sqlSession.selectOne(MAPPER + "insertUserData", userData);
    }
}
