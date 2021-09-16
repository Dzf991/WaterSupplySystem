package com.sy.watersupplysystem.entities;

public class Customer {
    private Integer cid;
    private String custName;
    private String custAddress;
    private String custMobile;
    private String custTicket;

    public Customer() {
    }

    public Customer(Integer cid, String custName, String custAddress, String custMobile, String custTicket) {
        this.cid = cid;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custMobile = custMobile;
        this.custTicket = custTicket;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustTicket() {
        return custTicket;
    }

    public void setCustTicket(String custTicket) {
        this.custTicket = custTicket;
    }
}
