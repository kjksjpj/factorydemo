package com.example.factorydemo.pojo;


@SuppressWarnings("all")
public class Task {
    private int taskId;
    private String taskTitle;
    private String taskContent;
    private String taskSpecification;
    private int taskQuantity;
    private String taskNotes;
    private int taskState;
    private String taskCreateTime;
    private String taskDeadTime;
    private int taskFatherId;
    private int taskWorkerId;
    private String taskWorkerName;

    public Task() {
    }

    public Task(int taskId, String taskTitle, String taskContent, String taskSpecification, int taskQuantity, String taskNotes, int taskState, String taskCreateTime, String taskDeadTime, int taskFatherId, int taskWorkerId, String taskWorkerName) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.taskContent = taskContent;
        this.taskSpecification = taskSpecification;
        this.taskQuantity = taskQuantity;
        this.taskNotes = taskNotes;
        this.taskState = taskState;
        this.taskCreateTime = taskCreateTime;
        this.taskDeadTime = taskDeadTime;
        this.taskFatherId = taskFatherId;
        this.taskWorkerId = taskWorkerId;
        this.taskWorkerName = taskWorkerName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public String getTaskSpecification() {
        return taskSpecification;
    }

    public void setTaskSpecification(String taskSpecification) {
        this.taskSpecification = taskSpecification;
    }

    public int getTaskQuantity() {
        return taskQuantity;
    }

    public void setTaskQuantity(int taskQuantity) {
        this.taskQuantity = taskQuantity;
    }

    public String getTaskNotes() {
        return taskNotes;
    }

    public void setTaskNotes(String taskNotes) {
        this.taskNotes = taskNotes;
    }

    public int getTaskState() {
        return taskState;
    }

    public void setTaskState(int taskState) {
        this.taskState = taskState;
    }

    public String getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(String taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    public String getTaskDeadTime() {
        return taskDeadTime;
    }

    public void setTaskDeadTime(String taskDeadTime) {
        this.taskDeadTime = taskDeadTime;
    }

    public int getTaskFatherId() {
        return taskFatherId;
    }

    public void setTaskFatherId(int taskFatherId) {
        this.taskFatherId = taskFatherId;
    }

    public int getTaskWorkerId() {
        return taskWorkerId;
    }

    public void setTaskWorkerId(int taskWorkerId) {
        this.taskWorkerId = taskWorkerId;
    }

    public String getTaskWorkerName() {
        return taskWorkerName;
    }

    public void setTaskWorkerName(String taskWorkerName) {
        this.taskWorkerName = taskWorkerName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskTitle='" + taskTitle + '\'' +
                ", taskContent='" + taskContent + '\'' +
                ", taskSpecification='" + taskSpecification + '\'' +
                ", taskQuantity=" + taskQuantity +
                ", taskNotes='" + taskNotes + '\'' +
                ", taskState=" + taskState +
                ", taskCreateTime='" + taskCreateTime + '\'' +
                ", taskDeadTime='" + taskDeadTime + '\'' +
                ", taskFatherId=" + taskFatherId +
                ", taskWorkerId=" + taskWorkerId +
                ", taskWorkerName='" + taskWorkerName + '\'' +
                '}';
    }
}
