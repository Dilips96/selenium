package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyByCartPractise {
	
	static {
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
	}
	
	public class base{

	public static void main(String[] args) 
	{
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	  
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  int j =0;
	  
	  string[] itemsNeeded = {"Beetroot","Brocolli","Cucumber"};
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  driver.quit();
	  

	}

}
