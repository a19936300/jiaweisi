package com.binbinxiu.jiaweisi.po;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * taskPo
 *
 * @author : binbin
 * @description : ToDo
 * @date : 2019/12/9
 **/
@Table(name = "tj_task")
public class TaskPo {
    @Id
    private Long taskId;
    private Long lordId;
    private String title;
    private String taskType;
    private String taskContent;
    private Long taskCoin;
    private LocalDateTime createDate;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getLordId() {
        return lordId;
    }

    public void setLordId(Long lordId) {
        this.lordId = lordId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public Long getTaskCoin() {
        return taskCoin;
    }

    public void setTaskCoin(Long taskCoin) {
        this.taskCoin = taskCoin;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
