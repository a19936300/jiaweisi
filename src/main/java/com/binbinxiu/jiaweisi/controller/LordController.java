package com.binbinxiu.jiaweisi.controller;

import com.binbinxiu.jiaweisi.po.LordPo;
import com.binbinxiu.jiaweisi.service.LordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * LordController
 *
 * @author : binbin
 * @description : ToDo
 * @date : 2019/12/5
 **/
@RequestMapping(value = "/lord")
@Controller
public class LordController {

    @Autowired
    private LordService lordService;

    @GetMapping(value = "/page")
    @ResponseBody
    public List<LordPo> selectLordPage(){
        return lordService.selectPage();
    }
}
