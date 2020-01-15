package com.sinopharm.craw;

import com.sinopharm.craw.server.FsServer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class CrawApplication {
private static FsServer fsServer;
	public static void main(String[] args) throws InterruptedException {
//		SpringApplication.run(CrawApplication.class, args);
		ApplicationContext context = new SpringApplicationBuilder(CrawApplication.class).headless(false).web(WebApplicationType.NONE).run(args);
		try {
			fsServer = context.getBean(FsServer.class);
			String result= fsServer.Start();
			JOptionPane.showMessageDialog(null, result, "结果反馈", JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
