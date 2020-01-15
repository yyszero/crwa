package com.sinopharm.craw.utils;

import com.sinopharm.craw.entity.FsDto;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author:Yanying
 * @Date:2020-1-7 16:32
 */
@Slf4j
public class FsDeal {

    public List<FsDto> DelFs(Document doc, String compNames) {
        System.out.println("开始处理数据");
        List<FsDto> fsList = new ArrayList<FsDto>();
        String[] spString=null;
        String[] sourString=null;
        int i=0;
        try {
            Element table = doc.getElementById("gridlist");
            //Elements tr = table.getElementsByClass("ui-widget-content jqgrow ui-row-ltr");
            Elements tr = table.select("[tabindex='-1']");
            for (Element td : tr) {
                i++;
                FsDto fsDto = new FsDto();
                fsDto.setOrderDetailId(td.select("td[aria-describedby='gridlist_orderDetailId']").text());
                fsDto.setOrderId(td.select("td[aria-describedby='gridlist_orderId']").text());
                fsDto.setOrderName(td.select("td[aria-describedby='gridlist_orderName']").text());
                fsDto.setAreaName(td.select("td[aria-describedby='gridlist_areaName']").text());
                fsDto.setHospitalName(td.select("td[aria-describedby='gridlist_hospitalName']").text());
                fsDto.setSubmitTime(getStringDate(td.select("td[aria-describedby='gridlist_submitTime']").text()));
                fsDto.setPurchaseCount(Integer.parseInt(td.select("td[aria-describedby='gridlist_purchaseCount']").text()));
                fsDto.setPurchasePrice(Double.parseDouble(td.select("td[aria-describedby='gridlist_purchasePrice']").text()));
                fsDto.setPurchaseAmount(Double.parseDouble(td.select("td[aria-describedby='gridlist_purchaseAmount']").text()));
                fsDto.setGoodsId(td.select("td[aria-describedby='gridlist_goodsId']").text());
                String goodsInfo = td.select("td[aria-describedby='gridlist_goodsInfo']").text();
                spString = goodsInfo.split("\\s+");
                fsDto.setGoodsName(spString[0]);
                fsDto.setProductName(spString[1]);
                fsDto.setMedicineModel(spString[2]);
                fsDto.setOutLook(spString[3]);
                fsDto.setUnit(spString[4]);
                fsDto.setMATERIALNAME(spString[5]);
                String sourName=td.select("td[aria-describedby='gridlist_sourceName']").text();
                sourString = sourName.split("\\s+");
                fsDto.setSourceName_1(sourString[0]);
                fsDto.setCompanyNameSc(td.select("td[aria-describedby='gridlist_companyNameSc']").text());
                fsDto.setSourceName(sourString[1]);
                fsDto.setDetailDistributeAddress(td.select("td[aria-describedby='gridlist_detailDistributeAddress']").text());
                fsDto.setIsExpire(td.select("td[aria-describedby='gridlist_isExpire']").text());
                fsDto.setRemark(td.select("td[aria-describedby='gridlist_remark']").text());

                fsDto.setCOMPANYNAMEPS(compNames);
                Date now = new Date();
                fsDto.setCREATEDATE(now);
                fsDto.setStatus("00");
                fsList.add(fsDto);
            }
        } catch (Exception ex) {
            log.debug("异常:" + ex);
            System.out.println("异常:"+ex.toString());

        }
        System.out.println("处理了---"+i);
        return fsList;
    }

    public static Date getStringDate(String dateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateStr);
        } catch (Exception ex) {
            log.debug(ex.toString());
        }
        return date;
    }
}
