package com.example.demo.service;

import com.example.demo.dao.LostDao;
import com.example.demo.entity.Lost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LostServiceImpl {
    @Autowired
    private LostDao lostDao;

    //查询
    public Lost getLostInfo(String lost_id){
        return lostDao.getLostInfo(lost_id);
    }

    public int deleteById(String lost_id) {
        return lostDao.deleteById(lost_id);
    }


    public Lost save(Lost lost) {
        int save = lostDao.save(lost);
        return lost;
    }

    public int update(Lost lost) {
        return lostDao.update(lost);
    }

    public List<Lost> selectAll() {
        return lostDao.selectAll();
    }
}
