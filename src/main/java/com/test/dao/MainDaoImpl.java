package com.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class MainDaoImpl implements MainDao{

    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "com.test.dao.MainDao";

    @Override
    public List<Map> getProhList() {

        return sqlSession.selectList(namespace + ".getProhList");
    }
}
