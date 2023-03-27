package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractiseRSA 
{
	static{
		
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
//		System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
			
		}
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();   //// To Maximize the Driver
		
		 //Implicit Wait
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		String Title = driver.getTitle();  // to get the Title 
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String text="Kiranmayee"; // We have created a string for this java alerts
		
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		 System.out.println(driver.switchTo().alert().getText()); // to grab the text 
	
		driver.switchTo().alert().accept(); // this is method for the java alerts 
		

		driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Name\"]")).sendKeys("RamaRao");
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();  // this is for cancel or no method in java script
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	driver.close();
	//	driver.quit();
		
		
	}

}
