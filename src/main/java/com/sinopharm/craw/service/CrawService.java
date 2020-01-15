package com.sinopharm.craw.service;

import com.sinopharm.craw.entity.FsDto;

import java.util.List;
import java.util.Map;

/**
 * @Author:Yangying
 * @Date:2020-1-6 18:02
 */
public interface CrawService {

    //拿取数据
    public List<FsDto>crwaData();
    //数据插表
    public boolean InsertTb(FsDto fsDto);
    //调用存储过程
    public void callProduce(Map<String, Object> parMap);



}
