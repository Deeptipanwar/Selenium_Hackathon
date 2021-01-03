package com.training.demo_maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contact extends Set_utility {

	public static void main(String[] args) throws Exception{
		LaunchBrowser();
		goToUrl();
		loginToSalesForce();
		open_contact();
		//create_newTC25();
		//create_new_viewTC26();
		//recentTC27();
		//TC28();
		//TC29();
		//TC30();
		//TC31();
		TC32();

	}
	public static void open_contact() throws Exception{
		
	Thread.sleep(3000);
	waitExplicitly(20,driver.findElement(By.id("tabBar")));
	WebElement em= driver.findElement(By.id("tabBar"));
	driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Contact_Tab']")).click();
	Thread.sleep(3000);
	}
	
	
	
	public static void create_newTC25() throws Exception{
		driver.findElement(By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.id("name_lastcon2")).sendKeys("Panwar");
		driver.findElement(By.id("con4")).sendKeys("Dips");
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@value=' Save ']")).click();
		
	}
	public static void create_new_viewTC26() throws Exception{
		
		driver.findElement(By.xpath("//form[@id='filter_element']/div/span/span[2]/a[2]")).click();
		driver.findElement(By.id("fname")).sendKeys("Rawat");
		driver.findElement(By.id("devname")).sendKeys("Rawat_01");
		driver.findElement(By.xpath("//div[@class='pbHeader']/table/tbody/tr/td/input[1]")).click();
	}
	public static void recentTC27() throws Exception{
		Select opt= new Select(driver.findElement(By.id("hotlist_mode")));
		opt.selectByVisibleText("Recently Created");
	
	}
	
	public static void TC28() throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.id("fcf")).click();
		Select opt= new Select(driver.findElement(By.id("fcf")));
		opt.selectByVisibleText("My Contacts");
		driver.findElement(By.xpath("//form[@id='filter_element']/div/span/span/input")).click();
	
	}
	public static void TC29() throws Exception{
		driver.findElement(By.xpath("//div[@class='hotListElement']/div/div[2]/table/tbody/tr[2]/th/a")).click();
		
	}
	
	public static void TC30() throws Exception{
		driver.findElement(By.xpath("//form[@id='filter_element']/div/span/span[2]/a[2]")).click();
		driver.findElement(By.id("devname")).sendKeys("EFGH");
		driver.findElement(By.xpath("//form[@id='editPage']/div/table/tbody/tr/td[2]/input[1]")).click();
	}
	
	public static void TC31() throws Exception{
		driver.findElement(By.xpath("//form[@id='filter_element']/div/span/span[2]/a[2]")).click();
		driver.findElement(By.id("fname")).sendKeys("Rawat");
		driver.findElement(By.id("devname")).sendKeys("Rawat_01");
		driver.findElement(By.xpath("//div[@class='pbHeader']/table/tbody/tr/td/input[2]")).click();
		
		
	}
	
	public static void TC32() throws Exception{
		driver.findElement(By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		driver.findElement(By.id("con4")).sendKeys("Global Media");
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@value=' Save ']")).click();
		driver.findElement(By.xpath("//div[@class='pbHeader']/table/tbody/tr/td/input[2]")).click();
	}
	
	
	

}
