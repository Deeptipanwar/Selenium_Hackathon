package com.training.demo_maven;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Create_Opportunity extends Set_utility{

	public static void main(String[] args) throws Exception  {
		LaunchBrowser();
		goToUrl();
		loginToSalesForce();
		open_opportunity_TC15();
		new_opportunity();
		//oppor_pipeline_TC17();
		//stuck_oppor_TC18();
		//stuck_oppor_TC19();

	}
	
	
	public static void open_opportunity_TC15() throws Exception{
		Thread.sleep(3000);
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Opportunity_Tab']")).click();
		Thread.sleep(3000);
		
		/*to display list of opportunities*/
		
		/*Select opt= new Select(driver.findElement(By.id("fcf")));
		 List <WebElement> op = opt.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }*/
	}
	
	public static void new_opportunity() throws Exception{
		WebElement new_btn=driver.findElement(By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input"));
		new_btn.click();
		driver.findElement(By.xpath("//td[@id='topButtonRow']/input[1]")).click();
		driver.findElement(By.id("opp3")).sendKeys("1234");
		driver.findElement(By.xpath("//form[@id='editPage']/div/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a")).click();
		driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
		Thread.sleep(5000);
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("searchFrame")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='theForm']/div/div[2]/input[@id='lksrch']")).sendKeys("DeeptiAcnt");
		Thread.sleep(3000);
		WebElement fb = driver.findElement(By.xpath("//form[@id='theForm']/div/div[2]/input[@title='Go!']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(fb).click().build().perform();
		driver.switchTo().defaultContent();
		
		
		
		driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
		driver.findElement(By.xpath("//div[@class='listRelatedObject lookupBlock']/div/div/table/tbody/tr[2]/th/a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(windows.get(0));
	
		
		
		driver.findElement(By.id("opp11")).click();
		Select opt= new Select(driver.findElement(By.id("opp11")));
		Thread.sleep(3000);
		opt.selectByVisibleText("Qualification");
		driver.findElement(By.id("opp12")).clear();
		driver.findElement(By.id("opp12")).sendKeys("12");
		Select opt1= new Select(driver.findElement(By.id("opp6")));
		opt1.selectByVisibleText("Phone Inquiry");
		driver.findElement(By.id("opp17_lkwgt")).click();
		
		ArrayList<String> wind=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wind.get(1));
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
		driver.findElement(By.xpath("//div[@class='listRelatedObject lookupBlock']/div/div/table/tbody/tr[2]/th/a")).click();
		driver.switchTo().window(wind.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[1]")).click();
				
	}
	
	public static void oppor_pipeline_TC17() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Opportunity_Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id='toolsContent']/tbody/tr/td/div/div/div/ul/li[1]/a")).click();
	}
	
public static void stuck_oppor_TC18() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Opportunity_Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id='toolsContent']/tbody/tr/td/div/div/div/ul/li[2]/a")).click();
	}

public static void stuck_oppor_TC19() throws Exception{
	
	waitExplicitly(20,driver.findElement(By.id("tabBar")));
	WebElement em= driver.findElement(By.id("tabBar"));
	driver.findElement(By.xpath("//table[@id='toolsContent']/tbody/tr/td[2]/div/div/h3")).click();
	Thread.sleep(3000);
	Select opt= new Select(driver.findElement(By.id("quarter_q")));
	opt.selectByVisibleText("Next FQ");
	Select opt1= new Select(driver.findElement(By.id("open")));
	opt1.selectByVisibleText("Open Opportunities");
	driver.findElement(By.xpath("//table[@class='opportunitySummary']/tbody/tr[3]/td/input")).click();
}


	
	
	
	

}
