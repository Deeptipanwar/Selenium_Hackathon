package com.training.demo_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_browser extends Set_utility{

	public static void main(String[] args) throws Exception {
		LaunchBrowser();
		goToUrl();
		//loginToSalesForce();
		//open_acnt_tab();
		//Account_Tab();
		//Create_acnt();
		//New_Acnt();
		
	}
	
	
	
	
	public static void open_acnt_tab() throws Exception{
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
	}
	
	
	public static void Account_Tab() throws Exception{
		
		waitExplicitly(10,driver.findElement(By.xpath("//input[@id='2']")));
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		driver.findElement(By.xpath("//form[@id='qcreate']/div[1]/div/div[contains(text(),' You must enter a value')]"));
		driver.findElement(By.xpath("//form[@id='qcreate']/div[4]/span"));
		
	}
	
	public static void Create_acnt() throws Exception{
		
		waitExplicitly(10,driver.findElement(By.xpath("//input[@id='2']")));
		driver.findElement(By.xpath("//input[@id='2']")).sendKeys("DeeptiAcnt");
		waitExplicitly(10,driver.findElement(By.xpath("//input[@id='10']")));
		driver.findElement(By.xpath("//input[@id='10']")).sendKeys("425243");
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		waitExplicitly(10,driver.findElement(By.xpath("//div[@class='quickCreateFooter']/a")));
	}
	
	public static void New_Acnt() {
		WebElement new_btn=driver.findElement(By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input"));
		new_btn.click();
		driver.findElement(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/input"))
		.sendKeys("DeeptiAcnt");
		
		Select opt= new Select(driver.findElement(By.id("acc6")));
		opt.selectByVisibleText("Technology Partner");
		Select opt2= new Select(driver.findElement(By.id("00N4x00000DW1vd")));
		opt2.selectByVisibleText("High");
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[1]"));
	}
	

}
