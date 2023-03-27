package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHovering 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
	//	System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
	}

   
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	//	driver.get("https://www.lawyerwangu.com/");
		
		System.out.println("Amazon has it lot of Ui Guesters it has rich on its api Which you usually show on the UI page ");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Title = driver.getTitle();
		
	//	WebElement move=driver.findElement(By.xpath("//a[@class=\\\"nav-a nav-a-2   nav-progressive-attribute\\"));
		
		
		// Action class using mouse hovering
		
	
		
	    Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		
		//a.moveToElement(move).contextClick().build().perform();  // this is for right text element
	//    Thread.sleep(2000);
	    
		
		
	    // Write in capital letters by using Action class
		
	    a.moveToElement(driver.findElement(By.xpath("//input[@name=\"field-keywords\"]"))).click().keyDown(Keys.SHIFT).sendKeys("oppo mobiles").doubleClick().build().perform();
	    Thread.sleep(2000);
	    
	    
	    
	    // How to do right click on specific element
	    
	/*    a.moveToElement(driver.findElement(By.id("nav-orders"))).contextClick().build().perform();
	    Thread.sleep(3000);    */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	//	a.moveToElement(driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]"))).build().perform();
	//	Thread.sleep(2000);   
		
		
		// this actually moves to specific elements
	/*	Actions b = new Actions(driver);
		b.moveToElement(driver.findElement(By.xpath("(//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"])[1]"))).build().perform();
		
		*/
		
		
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	driver.quit();
	}

}
