package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontal 
{

	static 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (5)/chromedriver");
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='Events']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class=\"sc-7o7nez-0 cBsijw\"])[4]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)﻿﻿");    
		
		driver.findElement(By.xpath("//button[@class=\"df-bj df-bu df-bv df-bw df-bx df-by df-bz df-ca df-cb df-cc df-cd df-ce df-h df-s\"]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
