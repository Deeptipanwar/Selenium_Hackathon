package com.training.demo_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Create_Account extends Set_utility {

	public static void main(String[] args)throws Exception {
		LaunchBrowser();
		goToUrl();
		loginToSalesForce();
		open_acnt_tab();
		//Account_Tab();
		//Create_acnt();
		//New_Acnt_TC10();
		//Edit_View_TC12();
		//Merge_Account_TC13();
		Account_Report_TC14();

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
	
	public static void New_Acnt_TC10()throws Exception {
		WebElement new_btn=driver.findElement(By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input"));
		new_btn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/input"))
		.sendKeys("DeeptiAcnt");
		
		Select opt= new Select(driver.findElement(By.id("acc6")));
		opt.selectByVisibleText("Technology Partner");
		Select opt2= new Select(driver.findElement(By.id("00N4x00000DW1vd")));
		opt2.selectByVisibleText("High");
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[1]")).click();
	}
	public static void Edit_View_TC12()throws Exception {
		driver.findElement(By.xpath("//form[@id='filter_element']/div/span/span[2]/a[1]")).click();
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("New view 1");
		driver.findElement(By.id("devname")).clear();
		driver.findElement(By.id("devname")).sendKeys("Deep_0708");
		Select opt= new Select(driver.findElement(By.xpath("//tr[@id='frow1']/td[2]/select")));
		opt.selectByVisibleText("Account Name");
		Select opt1= new Select(driver.findElement(By.xpath("//tr[@id='frow1']/td[3]/select")));
		opt1.selectByVisibleText("contains");
		driver.findElement(By.id("fval1")).clear();
		driver.findElement(By.id("fval1")).sendKeys("a");
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td/input[1]")).click();
	}
	
	public static void Merge_Account_TC13()throws Exception {
		driver.findElement(By.xpath("//table[@id='toolsContent']/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")).click();
		driver.findElement(By.id("srch")).clear();
		driver.findElement(By.id("srch")).sendKeys("DeeptiAcnt");
		driver.findElement(By.xpath("//div[@class='pbWizardBody']/input[2]")).click();
		driver.findElement(By.xpath("//div[@class='listRelatedObject accountBlock']/div/div/table/tbody/tr[2]/th/input")).click();
		driver.findElement(By.xpath("//div[@class='listRelatedObject accountBlock']/div/div/table/tbody/tr[3]/th/input")).click();
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/input[1]")).click();
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/input[@value=' Merge ']")).click();
		driver.switchTo().alert().accept();
	}
	
	public static void Account_Report_TC14()throws Exception {
		driver.findElement(By.xpath("//table[@id='toolsContent']/tbody/tr/td[1]/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.id("ext-gen148")).click();
		Thread.sleep(3000);
		waitExplicitly(10,driver.findElement(By.xpath("//div[@id='ext-gen265']/div[contains(text(),'Last Modified Date')]")));
		driver.findElement(By.xpath("//div[@id='ext-gen265']/div[contains(text(),'Last Modified Date')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen152")).click();
		driver.findElement(By.id("ext-gen281")).click();
		driver.findElement(By.id("ext-gen154")).click();
		driver.findElement(By.id("ext-gen296")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen49")).click();
		driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("QAReport1");
		driver.findElement(By.id("saveReportDlg_DeveloperName")).sendKeys("QAReport_1");
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen314")).click();
		
	}
	
	

}
