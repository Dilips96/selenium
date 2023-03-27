package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EliMouseHovering 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://beligo.trackado.net/login/dashboard");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.id("username")).sendKeys("shruthi@active.agency");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userpassword")).sendKeys("1133557799");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		
		driver.switchTo().alert().getText();
		
		
		//span[text()="Authentication failed.  "]
		
		
		
		
		
		
		
	//	driver.close();
		
		
		
	}

}
