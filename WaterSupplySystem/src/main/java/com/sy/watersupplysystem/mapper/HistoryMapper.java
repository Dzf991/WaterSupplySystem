package com.sy.watersupplysystem.mapper;

import com.sy.watersupplysystem.entities.History;
import com.sy.watersupplysystem.entities.vo.PageVo;
import com.sy.watersupplysystem.entities.vo.SendHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HistoryMapper {
    List<History> getHistoryList(@Param(value = "pageVo") PageVo pageVo,
                                 @Param(value = "sendHistory")SendHistory sendHistory);

    int getHistoryTotal(SendHistory sendHistory);



    int delChecked(Integer[] hids);

    int delHistory(Integer hid);

    int addHistory(History history);

    History getHistoryById(Integer hid);

    int updateHistory(History history);
}
