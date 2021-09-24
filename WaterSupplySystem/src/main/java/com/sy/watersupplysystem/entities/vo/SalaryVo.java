package com.sy.watersupplysystem.entities.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SalaryVo {

    private String workerName;
    private Integer workerSalary;
    private double workerTicheng;
    private Integer sendWaterCount;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone ="GMT+8"
    )
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone ="GMT+8"
    )
    private Date endDate;

    public SalaryVo() {
    }

    public SalaryVo(String workerName, Integer workerSalary, double workerTicheng, Integer sendWaterCount,  Integer sendWaterCount1, Date startDate, Date endDate) {
        this.workerName = workerName;
        this.workerSalary = workerSalary;
        this.workerTicheng = workerTicheng;
        this.sendWaterCount = sendWaterCount;
        this.sendWaterCount = sendWaterCount1;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Integer getWorkerSalary() {
        return workerSalary;
    }

    public void setWorkerSalary(Integer workerSalary) {
        this.workerSalary = workerSalary;
    }

    public double getWorkerTicheng() {
        return workerTicheng;
    }

    public void setWorkerTicheng(double workerTicheng) {
        this.workerTicheng = workerTicheng;
    }

    public Integer getSendWaterCount() {
        return sendWaterCount;
    }

    public void setSendWaterCount(Integer sendWaterCount) {
        this.sendWaterCount = sendWaterCount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
