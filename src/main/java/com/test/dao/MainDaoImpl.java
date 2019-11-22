package com.test.dao;

import com.test.vo.ProhListVO;
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
    public List<ProhListVO> getProhList(Map<String, Object> param) {
        return sqlSession.selectList(namespace + ".getProhList", param);
    }

    @Override
    public int getTotalCountProhList() {
        return sqlSession.selectOne(namespace + ".getTotalCountProhList");
    }

    @Override
    public int getProhWordExistCount(Map<String, Object> param) {
        return sqlSession.selectOne(namespace + ".getProhWordExistCount", param);
    }

    @Override
    public void insertProhWord(Map<String, Object> param) {
        sqlSession.insert(namespace + ".insertProhWord", param);
    }

    @Override
    public List<ProhListVO> getProhWords() {
        return sqlSession.selectList(namespace + ".getProhWords");
    }
}
