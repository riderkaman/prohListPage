package com.test.service;

import com.test.dao.MainDao;
import com.test.dao.MainDaoImpl;
import com.test.vo.ProhListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MainService {

    @Autowired
    private MainDao dao;

    public List<ProhListVO> getProhList(Map<String, Object> param) {
        return dao.getProhList(param);
    }

    public int getTotalCountProhList() {
        return dao.getTotalCountProhList();
    }

    public void insertProhWord(Map<String, Object> param) {
        dao.insertProhWord(param);
    }

    public int getProhWordExistCount(Map<String, Object> param) {
        return dao.getProhWordExistCount(param);
    }

    public List<ProhListVO> getProhWords() {
        return dao.getProhWords();
    }
}
