package com.test.service;

import com.test.dao.MainDao;
import com.test.dao.MainDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MainService {

    @Autowired
    private MainDao dao;

    public List<Map> getProhList() {

        return dao.getProhList();
    }

}
