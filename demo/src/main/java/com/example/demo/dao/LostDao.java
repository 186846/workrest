package com.example.demo.dao;

import com.example.demo.entity.Lost;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LostDao {
    /**
     * 通过lost_id查询失物的信息
     * @param lost_id
     * @return
     */
    public Lost getLostInfo(String lost_id);


    /**
     * 通过lost_ID删除相关数据
     * @param lost_id
     * @return
     */
    public int deleteById (String lost_id);

    /**
     * 插入一个数据
     * @param lost
     * @return
     */
    public int save (Lost lost);


    /**
     * 更新数据
     * @param lost
     * @return
     */
    public int update (Lost lost);

    /**
     * 获取所有数据
     * @return
     */
    public List<Lost> selectAll();
}

