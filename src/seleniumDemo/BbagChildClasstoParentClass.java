package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbagChildClasstoParentClass 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
	//	System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://bbag.in/admin"); 
	 driver.manage().window().maximize();
	 
	 String title = driver.getTitle();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.id("email")).sendKeys("lakshyaparakh@gmail.com");
	 
	 
	 driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Bbag16022021#");
	 
	 driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-lg btn-block\"]")).click();
	 Thread.sleep(2000);
	 
	 
	 
	 
	 

	}

}
