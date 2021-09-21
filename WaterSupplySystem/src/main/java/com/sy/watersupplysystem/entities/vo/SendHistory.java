package com.sy.watersupplysystem.entities.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SendHistory {
    private Integer hid;
    private String custName;
    private String workerName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone ="GMT+8"
    )
    private Date sendWaterTime;
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

    public SendHistory() {
    }

    public SendHistory(Integer hid, String custName, String workerName, Date sendWaterTime, Integer sendWaterCount, Date startDate, Date endDate) {
        this.hid = hid;
        this.custName = custName;
        this.workerName = workerName;
        this.sendWaterTime = sendWaterTime;
        this.sendWaterCount = sendWaterCount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Date getSendWaterTime() {
        return sendWaterTime;
    }

    public void setSendWaterTime(Date sendWaterTime) {
        this.sendWaterTime = sendWaterTime;
    }

    public Integer getSendWaterCount() {
        return sendWaterCount;
    }

    public void setSendWaterCount(Integer sendWaterCount) {
        this.sendWaterCount = sendWaterCount;
    }
}
