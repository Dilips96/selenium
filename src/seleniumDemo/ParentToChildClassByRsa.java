package seleniumDemo;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class ParentToChildClassByRsa {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (5)/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Thread.sleep(4000);
		
		
		// how to handle the windows of parent window to child windows
		
		java.util.Set<String> Windows = driver.getWindowHandles();
		Iterator<String> it = Windows.iterator();
	    it.next();
		driver.switchTo().window(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
