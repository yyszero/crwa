package com.sinopharm.craw.server;

import com.sinopharm.craw.entity.FsDto;
import com.sinopharm.craw.service.impl.CrawServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:Yanying
 * @Date:2020-1-7 16:26
 */
@Component
@Slf4j
public class FsServer {
    @Autowired
    CrawServiceImpl crawService;

    public String Start() {
        String result = "拉取成功";
        try {
            List<FsDto> fsList = crawService.crwaData();
            if(fsList.size()<=0){
                result="拉取数据为空，请检查网络是否延迟";
            }
            fsList.forEach(fsDto -> {
                crawService.InsertTb(fsDto);
            });
            Map<String, Object> parMap = new HashMap<>(2);
            crawService.callProduce(parMap);
        }catch (Exception ex){
            log.debug("异常信息:"+ex.toString());
            result="拉取失败";
        }
        return result;
    }
}
