package com.example.demo.controller;

import com.example.demo.entity.Lost;
import com.example.demo.entity.User;
import com.example.demo.service.LostServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LostController {
    private final static Logger logger = LoggerFactory.getLogger(LostController.class);
    @Autowired
    private LostServiceImpl lostService;

    //查询失物信息
    @RequestMapping(value = "select",method = RequestMethod.GET)
    public String Select(String lost_id){
        logger.info("记录查询失物信息日志");
        return lostService.getLostInfo(lost_id).toString();
    }

    //删除数据
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(String lost_id) {
        int result = lostService.deleteById(lost_id);
        if (result >= 1) {
            logger.info("记录删除失物信息日志");
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //插入数据
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public Lost insert(Lost lost) {
        logger.info("记录插入失物信息日志");
        return lostService.save(lost);
    }

    //修改数据
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(Lost lost) {
        int result = lostService.update(lost);
        if (result >= 1) {
            logger.info("记录修改失物信息日志");
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Lost> ListLost() {
        logger.info("记录查询所有失物信息日志");
        return lostService.selectAll();
    }
}
