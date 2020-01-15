package com.sinopharm.craw.dao;

import com.sinopharm.craw.entity.FsDto;
import com.sinopharm.craw.entity.InptBillGpo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface InptBillGpoMapper {

    int insert(FsDto record);

    void callProduce(Map<String,Object> parMap);

}
