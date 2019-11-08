package com.test.dao;

import com.test.vo.ProhListVO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface MainDao {

    public List<ProhListVO> getProhList(Map<String, Object> param);

    public int getTotalCountProhList();
}
