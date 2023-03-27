package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		/* How to scroll in selenium
		 * By default selenium will not perform any selenium techniques so you should execute javascript 
		 * all the browser is made on javascipt so we should write 1 script which will help you to scroll down  that script 
		 *  you have to execute through your selenium code .  */
		
		
		// to do that first you have to initialise javaScriptExecutor Object There is One class called  JavaScriptExecutor
		//  Which will help you to execute javascript related things 
		
		
		   // for scrolling down this is the code
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		
		
		
	
		System.out.println("Entered text");
		
		
		
		
		driver.close();

	}

}
