package com.sy.watersupplysystem.entities;

public class Worker {
    private Integer wid;
    private String workerName;
    private String workerSalary ;
    private String workerTicheng;
    private String workerImage;


    public Worker() {
    }

    public Worker(Integer wid, String workerName, String workerSalary, String workerTicheng, String workerImage) {
        this.wid = wid;
        this.workerName = workerName;
        this.workerSalary = workerSalary;
        this.workerTicheng = workerTicheng;
        this.workerImage = workerImage;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerSalary() {
        return workerSalary;
    }

    public void setWorkerSalary(String workerSalary) {
        this.workerSalary = workerSalary;
    }

    public String getWorkerTicheng() {
        return workerTicheng;
    }

    public void setWorkerTicheng(String workerTicheng) {
        this.workerTicheng = workerTicheng;
    }

    public String getWorkerImage() {
        return workerImage;
    }

    public void setWorkerImage(String workerImage) {
        this.workerImage = workerImage;
    }
}
