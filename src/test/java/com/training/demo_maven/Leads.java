package com.training.demo_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leads extends Set_utility{

	public static void main(String[] args)throws Exception {
		LaunchBrowser();
		goToUrl();
		loginToSalesForce();  
		open_lead_tabTC20();
		//open_lead_dropdownTC21();
		//defaultviewTC22();
		//today_leadsTC23();
		new_leadsTC24();

	}
	
	public static void open_lead_tabTC20() throws Exception{
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Lead_Tab']")).click();
		Thread.sleep(3000);
	}
	
	public static void open_lead_dropdownTC21() throws Exception{
		driver.findElement(By.id("fcf")).click();
		Select opt= new Select(driver.findElement(By.id("fcf")));
		 List <WebElement> op = opt.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	public static void defaultviewTC22() throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.id("fcf")).click();
		Select opt= new Select(driver.findElement(By.id("fcf")));
		opt.selectByVisibleText("Today's Leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNavMenu']")));
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='Logout']")));
		driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='Logout']")).click();
		Thread.sleep(3000);
		loginToSalesForce();
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Lead_Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value= ' Go! ']")).click();
		
	}
	public static void today_leadsTC23() throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.id("fcf")).click();
		Select opt= new Select(driver.findElement(By.id("fcf")));
		opt.selectByVisibleText("Today's Leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value= ' Go! ']")).click();
	}
	
	public static void new_leadsTC24() throws Exception{
		driver.findElement(By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
		driver.findElement(By.id("lea3")).sendKeys("ABCD");
		driver.findElement(By.xpath("//form[@id='editPage']/div/table/tbody/tr/td[2]/input[1]")).click();
	}

}
