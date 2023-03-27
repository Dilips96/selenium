package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesRsa 
{
     static
     {
    	 System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
     }

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());   // it will find the total frame count in the webpage 
		driver.manage().window().maximize();  // to Maximise 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit Wait
		
		String title= driver.getTitle();   // it will give the title
		
		
	//	-------------  This is For how To deal with web elements ----------------------
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); // 
		
		//driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);    // for the action class we have created an new Object and defined the object
		WebElement source = driver.findElement(By.id("draggable"));  // for drag // and this created a WebElement to define the Source
		Thread.sleep(3000);
		
		WebElement target = driver.findElement(By.id("droppable"));  // for drop   // This created a WebElement to define for Target
		a.dragAndDrop(source, target).build().perform();
	    
		driver.switchTo().defaultContent();   //it will come outside of the frame  it will come back to normal Window and 
		

	//	driver.quit(); 
		
	}

}
