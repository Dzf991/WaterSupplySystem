package com.sy.watersupplysystem.service;

import com.sy.watersupplysystem.entities.History;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.entities.vo.SendHistory;

public interface HistoryService {
    PageVo<History> getHistoryList(Integer currentPage,SendHistory sendHistory);

    PageVo<History> delChecked(Integer[] hids);

    PageVo<History> delHistory(Integer hid);

    PageVo<History> addHistory(History history);

    History getHistoryById(Integer hid);

    PageVo<History> updateHistory(History history);
}
