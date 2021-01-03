package com.training.demo_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import org.junit.Assert;  


public class Miscellaneous extends Set_utility {

	public static void main(String[] args) throws Exception {
		LaunchBrowser();
		goToUrl();
		loginToSalesForce();
		open_Home_Tab();
		//TC33();
		//TC34();
		//TC35();
		//TC36();
		TC37();

	}
	public static void open_Home_Tab() throws Exception{
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='home_Tab']")).click();
		Thread.sleep(3000);
	}
	
	public static void TC33() throws Exception{
		
		String ActualTitle= driver.findElement(By.xpath("//div[@id='ptBody']/div/div[2]/span/h1/a")).getText();
		Thread.sleep(3000);
		String ExpectedTitle=driver.findElement(By.id("userNavLabel")).getText();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle); 
		driver.findElement(By.xpath("//div[@id='ptBody']/div/div[2]/span/h1/a")).click();
	}
	
	public static void TC34() throws Exception{
		
		driver.findElement(By.xpath("//div[@id='ptBody']/div/div[2]/span/h1/a")).click();
		driver.findElement(By.xpath("//div[@class='contactInfo profileSection']//div[@class='editPen']/a")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		driver.findElement(By.xpath("//li[@id='aboutTab']"));
		driver.findElement(By.xpath("//li[@id='aboutTab']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("abcd");
		driver.findElement(By.xpath("//div[@class='net-buttons zen-mtl']/input[@value='Save All']")).click();
	}
	
	public static void TC35() throws Exception{
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']/a")).click();
		driver.findElement(By.xpath("//input[@title='Customize My Tabs']")).click();
		Select opt= new Select(driver.findElement(By.id("duel_select_1")));
		opt.selectByVisibleText("Leads");
		driver.findElement(By.id("duel_select_0_left")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[1]")).click();
	}
	public static void TC36() throws Exception{
		driver.findElement(By.xpath("//td[@id='bodyCell']/div/div/div/div[2]/span[2]/a")).click();
		driver.findElement(By.xpath("//table[@id='calTable']/tbody/tr[2]/td/div[29]/a")).click();
		driver.findElement(By.xpath("//a[@title='Combo (New Window)']")).click();
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='choicesBox tertiaryPalette brandSecondaryBrd']/ul/li[5]/a")).click();
		driver.switchTo().window(windows.get(0));
		Thread.sleep(3000);
		driver.findElement(By.id("EndDateTime_time")).click();
		driver.findElement(By.xpath("//div[@id='simpleTimePicker']/div[contains(text(),'9:00 PM')]")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[1]")).click();
	}
	
	public static void TC37() throws Exception{
		driver.findElement(By.xpath("//td[@id='bodyCell']/div/div/div/div[2]/span[2]/a")).click();
		driver.findElement(By.xpath("//table[@id='calTable']/tbody/tr[2]/td/div[21]/a")).click();
		driver.findElement(By.xpath("//a[@title='Combo (New Window)']")).click();
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='choicesBox tertiaryPalette brandSecondaryBrd']/ul/li[5]/a")).click();
		driver.switchTo().window(windows.get(0));
		Thread.sleep(3000);
		driver.findElement(By.id("EndDateTime_time")).click();
		driver.findElement(By.xpath("//div[@id='simpleTimePicker']/div[contains(text(),'7:00 PM')]")).click();
		driver.findElement(By.id("IsRecurrence")).click();
		driver.findElement(By.id("rectypeftw")).click();
		driver.findElement(By.id("RecurrenceEndDateOnly")).click();
		driver.findElement(By.xpath("//table[@id='datePickerCalendar']/tbody/tr[6]/td[1]")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='dwmIcons']/a[3]/img")).click();
		
	}
	
	
	
	

}
