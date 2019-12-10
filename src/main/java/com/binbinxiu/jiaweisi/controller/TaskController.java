package com.binbinxiu.jiaweisi.controller;

import com.binbinxiu.jiaweisi.po.TaskPo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * TaskController
 *
 * @author : binbin
 * @description : ToDo
 * @date : 2019/12/9
 **/
@Controller
@RequestMapping("/task")
public class TaskController {

    @RequestMapping("page")
    public List<TaskPo> selectPage(){


        return null;
    }



}
