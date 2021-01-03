package com.training.demo_maven;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class User_Menu_Dropdown extends Set_utility{

	public static void main(String[] args) throws Exception {
		LaunchBrowser();
		goToUrl();
		loginToSalesForce();
		//Drop_down_appear_TC05();
		//DropDownName();
		//Edit_Prof();
		//Post_link();
		//File_link();
		Add_photo();
		//My_SettingsTC_07();
		//Developer_Console_TC08();
		//Logout_TC09();

	}
	public static void Drop_down_appear_TC05()  throws Exception{
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	}
	public static void DropDownName()  throws Exception{
		waitExplicitly(20, driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNavMenu']")));
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='My Profile']")));
		driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='My Profile']")).click();
		
	}
	public static void Edit_Prof() throws Exception{
		driver.findElement(By.xpath("//div[@class='contactInfo profileSection']//div[@class='editPen']/a")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		
		driver.findElement(By.xpath("//li[@id='aboutTab']"));
		driver.findElement(By.xpath("//li[@id='aboutTab']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Panwar");
		driver.findElement(By.xpath("//div[@class='net-buttons zen-mtl']/input[@value='Save All']")).click();
		
	}
	public static void Post_link() throws Exception{
		driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body")).sendKeys("hellooooo");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	}
	
	public static void File_link() throws Exception{
		driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']")).click();
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		WebElement ele=driver.findElement(By.id("chatterFile"));
		ele.sendKeys("/Users/rupeshpawar/code");
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	}
	public static void Add_photo() throws Exception{
		driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']/a")).click();
		Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.id("displayBadge"))).build().perform();
		   driver.findElement(By.id("uploadLink")).click();
		  
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
			Thread.sleep(3000);
			WebElement ele=driver.findElement(By.xpath("//input[@class='fileInput']"));
			ele.sendKeys("/Users/rupeshpawar/Desktop/Deepti/banner.jpg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")).click();
			Thread.sleep(3000);
			Actions crop = new Actions(driver);
			crop.dragAndDropBy(driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']")), 30,220).perform();
			driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click();
			driver.switchTo().defaultContent();
			
	}
	
	public static void My_SettingsTC_07() throws Exception{
		waitExplicitly(20, driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNavMenu']")));
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='My Settings']")));
		driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='My Settings']")).click();
		/* code for My profile dropdown */
		
		//driver.findElement(By.xpath("//div[@id='AutoNumber5']/div[2]/a")).click();
		//driver.findElement(By.xpath("//a[@id='LoginHistory_font']")).click();
		//driver.findElement(By.xpath("//div[@id='RelatedUserLoginHistoryList_body']/div/a")).click();
		
		/* code for display & layout dropdown */
		
		/*driver.findElement(By.xpath("//div[@id='AutoNumber5']/div[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='AutoNumber5']/div[3]/div/div[1]/a")).click();
		Select drop = new Select(driver.findElement(By.xpath("//div[@id='ep']/div[2]/div/table/tbody/tr[2]/td/select")));
		drop.selectByVisibleText("Salesforce Chatter");
		Select drop2 = new Select(driver.findElement(By.id("duel_select_0")));
		drop2.selectByVisibleText("Reports");
		driver.findElement(By.id("duel_select_0_right")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[1]")).click();*/
		
		/* code for Email dropdown */
		
		
		/*driver.findElement(By.xpath("//div[@id='AutoNumber5']/div[4]/a")).click();
		driver.findElement(By.xpath("//div[@id='AutoNumber5']/div[4]/div/div[1]/a")).click();
		driver.findElement(By.id("sender_name")).clear();
		driver.findElement(By.id("sender_name")).sendKeys("Deepti Panwar");
		driver.findElement(By.id("sender_email")).clear();
		driver.findElement(By.id("sender_email")).sendKeys("Deepti.Panwar22@gmail.com");
		driver.findElement(By.id("auto_bcc1")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[1]")).click();
		 driver.switchTo().alert().accept();*/
		
		
		 /* code for Calendar dropdown */
		driver.findElement(By.xpath("//div[@id='AutoNumber5']/div[6]/a")).click();
		driver.findElement(By.id("Reminders_font")).click();
		driver.findElement(By.id("testbtn")).click();
		//driver.switchTo().alert().accept();
	
	}
	
	public static void Developer_Console_TC08() throws Exception{
		waitExplicitly(20, driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNavMenu']")));
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='Developer Console (New Window)']")));
		driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='Developer Console (New Window)']")).click();
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(windows.get(0));
	}
	
	public static void Logout_TC09() throws Exception{
		waitExplicitly(20, driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNavMenu']")));
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='Logout']")));
		driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='Logout']")).click();
		
	}
	
	
	

}
