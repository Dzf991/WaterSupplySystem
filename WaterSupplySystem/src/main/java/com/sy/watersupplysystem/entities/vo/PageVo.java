package com.sy.watersupplysystem.entities.vo;

import javax.xml.crypto.Data;
import java.util.List;

public class PageVo<T> {
    private int code;
    // 当前页
    private Integer currentPage = 1;
    // 每页显示的总条数
    private Integer pageSize = 3;
    // 总条数
    private Integer totalNum;
    // 总页数
    private Integer totalPage;
    // 开始索引
    private Integer startIndex;

    private List<T> resultData;
    private T data;
    public PageVo() {
    }

    public PageVo(int code, Integer currentPage, Integer pageSize, Integer totalNum, Integer totalPage, Integer startIndex, List<T> resultData) {
        this.code = code;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalNum = totalNum;
        this.totalPage = totalPage;
        this.startIndex = startIndex;
        this.resultData = resultData;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<T> getResultData() {
        return resultData;
    }

    public void setResultData(List<T> resultData) {
        this.resultData = resultData;
    }
}
