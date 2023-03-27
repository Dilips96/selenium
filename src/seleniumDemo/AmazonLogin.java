package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//span[text() =\"Sign in\"])[1]")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		
	}

}
