package com.training.demo_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Set_utility {

	public static void main(String[] args)throws Exception {
		LaunchBrowser();
		goToUrl();
		//forgot_pwd();
		//forgot_pwd4B();
		//Check_rememberMe();
	}
	
	
	
	public static void forgot_pwd()throws Exception  {
		driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.id("un")).click();
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("qadeep1234@gmail.com");
		driver.findElement(By.id("continue")).click();
	}
	
	public static void forgot_pwd4B()throws Exception  {
		WebElement ele= driver.findElement(By.xpath("//input[@id='username']"));
		ele.sendKeys("123");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("22231");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}
	
	public static void Check_rememberMe()throws Exception  {
		WebElement ele= driver.findElement(By.xpath("//input[@id='username']"));
		ele.sendKeys("qadeep1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Deep@2202");
		driver.findElement(By.xpath("//div[@id='theloginform']/form/div[3]/input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='My Profile']")));
		driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[@title='Logout']")).click();
	}

	
	

}
