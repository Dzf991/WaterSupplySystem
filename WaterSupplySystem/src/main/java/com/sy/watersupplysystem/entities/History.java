package com.sy.watersupplysystem.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class History {
    private Integer hid;
    private Integer custId;
    private Integer workerId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(
          pattern = "yyyy-MM-dd",
            timezone ="GMT+8"
    )
    private Date sendWaterTime;
    private Integer sendWaterCount;

    public History() {
    }

    public History(Integer hid, Integer custId, Integer workerId, Date sendWaterTime, Integer sendWaterCount) {
        this.hid = hid;
        this.custId = custId;
        this.workerId = workerId;
        this.sendWaterTime = sendWaterTime;
        this.sendWaterCount = sendWaterCount;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
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
