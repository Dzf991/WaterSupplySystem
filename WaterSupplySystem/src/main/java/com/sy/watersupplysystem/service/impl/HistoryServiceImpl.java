package com.sy.watersupplysystem.service.impl;

import com.sy.watersupplysystem.entities.History;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.entities.vo.SendHistory;
import com.sy.watersupplysystem.mapper.HistoryMapper;
import com.sy.watersupplysystem.service.HistoryService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HistoryServiceImpl implements HistoryService {
    @Resource
    private HistoryMapper historyMapper;
    @Override
    public PageVo<History> getHistoryList(Integer currentPage,SendHistory sendHistory) {
        PageVo<History> pageVo = new PageVo<>();
        int totalNum = historyMapper.getHistoryTotal(sendHistory);
        pageVo.setTotalNum(totalNum);
        pageVo.setStartIndex((currentPage-1) * pageVo.getPageSize());
        pageVo.setCurrentPage(currentPage);
        pageVo.setTotalPage((totalNum + pageVo.getPageSize() - 1) / pageVo.getPageSize());
        List<History> historyList = historyMapper.getHistoryList(pageVo,sendHistory);
        pageVo.setCode(200);
        pageVo.setResultData(historyList);
        return pageVo;
    }

    @Override
    public PageVo<History> delChecked(Integer[] hids) {
        PageVo<History> pageVo = new PageVo<>();
        int result = historyMapper.delChecked(hids);
       if (result == hids.length){
           pageVo.setCode(200);
       }else {
           pageVo.setCode(400);
       }
        return pageVo;
    }

    @Override
    public PageVo<History> delHistory(Integer hid) {
        PageVo<History> pageVo = new PageVo<>();
        int result = historyMapper.delHistory(hid);
        if (result > 0){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;

    }

    @Override
    public PageVo<History> addHistory(History history) {
        PageVo<History> pageVo = new PageVo<>();
        int result = historyMapper.addHistory(history);
        if (result > 0){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

    @Override
    public History getHistoryById(Integer hid) {
       return historyMapper.getHistoryById(hid);
    }

    @Override
    public PageVo<History> updateHistory(History history) {
        PageVo<History> pageVo = new PageVo<>();
        int result = historyMapper.updateHistory(history);

        if (result > 0){
            pageVo.setCode(200);
        }else {
            pageVo.setCode(400);
        }
        return pageVo;
    }

}
