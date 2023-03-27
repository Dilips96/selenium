package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpendDragAndDrop 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
		
	}

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://create.tech-active.com/");
	  driver.manage().window().maximize();
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  String title = driver.getTitle();
	  

	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div[1]/svg/path")).click();
	  
	  driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"ot-mainDropZone\"]")));
	  
	  Actions a = new Actions(driver);
	  WebElement source = driver.findElement(By.id("column1"));
	  Thread.sleep(2000);
	  
	  WebElement target = driver.findElement(By.xpath("//div[@class=\"ot-mainDropZone\"]"));
	  
	 driver.switchTo().defaultContent();
	  
	  

	  driver.quit();
	}

}
