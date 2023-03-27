package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyCartPractise {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (5)/chromedriver");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();   //// To Maximize the Driver
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit Wait
	
		String Title = driver.getTitle();  // to get the Title 
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		

	}

}
