package seleniumDemo;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.zeromq.ZStar.Set;

public class HopeQaClickAcademy
{
	static 
	{
	   
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
	//	System.setProperty("WebDriver.geckoDriver", "/home/active35/Downloads/geckodriver");
	}

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver= new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize(); // to maximize the screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait for 10 sec
		String title = driver.getTitle(); // to get the title
		
		
		// give me the count of links on the page
		
		System.out.println(driver.findElements(By.tagName("a")).size()); // This is One of the HCL interview 
		
		driver.findElement(By.xpath("//a[text()=\"Practice\"] ")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		// get me the count of link present in the footer section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));   // we have created new Sub section
		System.out.println(footerdriver.findElements(By.tagName("a")).size());		// we have defined the path
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		
		
		
		
		// in this at first we have taken the frame element xpath after that we have created a new object Stating 
		
		//           WebElement footerdriver that footdriver we have derived as the subsection of the footer page
		
		
		
	WebElement ColumnDriver	= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(ColumnDriver.findElements(By.tagName("a")).size());	
		
	//4 Next requirement is Click on each link in the column and check if the pages are opening or not
	
	for(int i =1;i<ColumnDriver.findElements(By.tagName("a")).size();i++)
	{
		
		String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		
		
		
		ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab); 
		Thread.sleep(5000L);
	} // opens all the tabs
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String>it=	abc.iterator();

		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}
		
	
		
	//driver.navigate().back(); to come backward
 		
		
	// driver.quit();
		

	}






  // General Interview Question

 // 1. What is The special you have done in your automation? / What is The special you did compare to others or how did u bring any optimisation Which got appreciated by your team ?

   /* Answer: We have some 30 links and we have to validate all the 30 links we have a script where we have to click each and every link and come back 
          and again click like that we have to continue       */

		  












	private static void iterator() {
		// TODO Auto-generated method stub
		
	}

}
