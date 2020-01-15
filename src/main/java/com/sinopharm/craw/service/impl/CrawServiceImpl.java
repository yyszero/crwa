package com.sinopharm.craw.service.impl;

import com.sinopharm.craw.dao.InptBillGpoMapper;
import com.sinopharm.craw.entity.FsDto;
import com.sinopharm.craw.service.CrawService;
import com.sinopharm.craw.utils.FsDeal;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author:Yanying
 * @Date:2020-1-7 16:16
 */
@Service
@Slf4j
public class CrawServiceImpl implements CrawService {

    @Autowired
    InptBillGpoMapper inptBillGpoMapper;

    @Override
    public List<FsDto> crwaData() {

        List<FsDto> fsList = new ArrayList<FsDto>();
        String Url = "https://gpo.gzggzy.cn";
        Document doc = null;
        FsDeal fsDeal = new FsDeal();

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get(Url);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //用key登录
            driver.findElement(By.xpath("//a[@href='javascript:loginByCert();']")).click();
            System.out.println("成功" + driver.getTitle() + "--" + driver.getCurrentUrl());
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //提示页面
            System.out.println("登录成功，进入->" + driver.getTitle() + "--" + driver.getCurrentUrl());
//            driver.findElement(By.xpath("//*[@onclick='btnClose()']")).click();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            //进入等待页面
//            System.out.println("进入->" + driver.getTitle() + "--" + driver.getCurrentUrl());
//            driver.findElement(By.xpath("//*[@onclick='closeBtm()']")).click();
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            //进去主页面
            System.out.println("进入->" + driver.getTitle() + "--" + driver.getCurrentUrl());
            WebElement iframe = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(iframe);
            driver.findElement(By.xpath("//*[@style='background-position:-900px 0']")).click();
            String UserInfo = driver.findElement(By.xpath("//div[@class='pull-left info']/p")).getText();
            UserInfo= UserInfo.replace(",","");
            UserInfo = UserInfo.substring(3,UserInfo.length());
            System.out.println("货主：" + UserInfo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //点开订单操作
            System.out.println("进入->" + driver.getTitle() + "--" + driver.getCurrentUrl());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//*[@class='fa cus-order']")).click();
            //选择订单响应
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//a[@href='/trade/fsDrugpurPurchaseOrderdetailRecent/toOrderToConfirmList.html']")).click();
            //第一次拿取数据
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("开始拿数据" + driver.getTitle() + "--" + driver.getCurrentUrl());
            WebElement iframes = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(iframes);
//           WebElement BtnPage=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-seek-next']"));
            //拿取表格
            driver.findElement(By.xpath("//tr[@tabindex='-1']"));
            doc = Jsoup.parse(driver.getPageSource());
            fsList = fsDeal.DelFs(doc, UserInfo);
            System.out.println("第一次拿" + fsList.size() + "条");
            //获取页数
            String pageCount = driver.findElement(By.xpath("//span[@id='sp_1_gridpage']")).getText();
            int a = Integer.parseInt(pageCount);
            System.out.println("页数" + pageCount);
            for (int i = 1; i < a; i++) {
                Document emDoc = null;
                List<FsDto> emList = new ArrayList<FsDto>();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                WebElement BtnNext = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-seek-next']"));
                BtnNext.click();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //下一页拿取表格
                driver.findElement(By.xpath("//tr[@tabindex='-1']"));
                emDoc = Jsoup.parse(driver.getPageSource());
                System.out.println("第" + i + "次***********************************************" + emDoc);
                emList = fsDeal.DelFs(emDoc, UserInfo);
                System.out.println("处理完*****" + i + "---" + emList.size());
                for (FsDto ems : emList) {
                    fsList.add(ems);
                }
            }
            //关闭浏览器
//           driver.close();
//           driver.quit();
            System.out.println("处理完*****" + fsList.size());
        } catch (Exception ex) {
            log.debug(ex.toString());
            System.out.println("异常：" + ex.toString());
            //关闭浏览器
            driver.close();
            driver.quit();
        }
        return fsList;
    }

    //解析
//
//		System.out.println(doc);
//
//		//获取页数
//		String pageCount=driver.findElement(By.xpath("//span[@id='sp_1_gridpage']")).getText();
//		System.out.println("页数"+pageCount);
//		int a=Integer.parseInt(pageCount);
//		for(int i=1;i<a;i++){
//			//线程休眠
//			Thread.sleep(3000);
//			WebElement BtnNext=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-seek-next']"));
//			System.out.println("点击第"+i+"次");
//			BtnNext.click();
//		}

//}

    @Override
    public boolean InsertTb(FsDto fsDto) {
        int result = 0;
        result = inptBillGpoMapper.insert(fsDto);
        return result == 1 ? true : false;
    }

    @Override
    public void callProduce(Map<String, Object> parMap) {
        inptBillGpoMapper.callProduce(parMap);
    }
}
