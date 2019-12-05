package com.binbinxiu.jiaweisi.service;

import com.binbinxiu.jiaweisi.po.LordPo;

import java.util.List;
/**
 * 处理用户数据
 *
 *
 * date           modify by            workitem
 * ──────────────────────────────────────────────
 * 2019年09月30日        dszvz
 */
public interface LordService {

    /**
     * 查询所有的用户
     *
     * @Title: selectPage
     * @param
     * @return : java.util.List<com.binbinxiu.jiaweisi.po.LordPo>
     *
     * date           modify by            workitem
     * ──────────────────────────────────────────────
     * 2019年09月30日        dszvz
     */
    public List<LordPo> selectPage();
}
