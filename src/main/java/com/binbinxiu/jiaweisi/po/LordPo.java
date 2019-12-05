package com.binbinxiu.jiaweisi.po;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * LordPo
 *
 * @author : binbin
 * @description : ToDo
 * @date : 2019/12/5
 **/
@Table(name = "lord")
public class LordPo {
    @Id
    private Long id;
    private String name;
    private LocalDateTime createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
