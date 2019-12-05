package com.binbinxiu.jiaweisi.service.impl;

import com.binbinxiu.jiaweisi.dao.LordDao;
import com.binbinxiu.jiaweisi.po.LordPo;
import com.binbinxiu.jiaweisi.service.LordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * LordServiceImpl
 *
 * @author : binbin
 * @description : ToDo
 * @date : 2019/12/5
 **/
@Service
public class LordServiceImpl implements LordService {

    @Autowired
    private LordDao lordDao;

    public List<LordPo> selectPage(){
        List<LordPo> lordPos = lordDao.selectAll();
        return  lordPos;
    }
}
