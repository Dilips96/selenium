package seleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class TestDemo 
{
	private static final WebElement WebElement = null;



	static{
		
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (5)/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
			
		}
	
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize(); //// To Maximize the Driver
		
		String Title = driver.getTitle();  // to get the Title 
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	/*	driver.navigate().to("https://rahulshettyacademy.com/"); // it will navigate 
		Thread.sleep(4000);
		//driver.navigate().back(); To come back ward   */
		
		//driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
	//	Thread.sleep(2000);
		
		
		/* to handle the static dropdown
		
	
		WebElement sd = driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
		Select sd1 = new Select(sd);
		sd1.selectByIndex(3);
	
		System.out.println(sd1.getFirstSelectedOption().getText()); // to get whether it is selected or not
	    sd1.selectByVisibleText("USD");
	    Thread.sleep(3000); 
	 //   System.out.println(sd1.getFirstSelectedOption().getText());
     //   sd1.selectByVisibleText("AED");  */
		
		
	    
	    
	  //  To open the application Button
  
		driver.findElement(By.xpath("//div[text()=\"1 Adult\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnclosepaxoption")).click(); // done button	
		Thread.sleep(2000);
		
	// Using Dynamic Drop Down
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@text=\"Bengaluru (BLR)\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@text=\"Kolkata (CCU)\"])[2]")).click();
		Thread.sleep(2000);
		
		//             	This Code is For CheckBox
		
	/*	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(2000);            */
		
		//            Using regular expression
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount\']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount\']")).isSelected()); // Whethere the checkbox is Selected or not
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount\']")).isSelected()); // It will Give the oupur as true beacuse in the assertion we have written the true assert
		Thread.sleep(2000);
		
		
     //      Count the No of check Boxes present in the website
		
	   System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
	   
	   
	   // Check with calender  /// But as of now it is not working due to consistency
	   
	//   driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[1]")).click();
	 //  Thread.sleep(3000);
	  
	   
	   // whethere that is enabled or disabled
	
	/*   System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	  Thread.sleep(2000); */
		  
	   
	   
	   
	   
	   // How to select the current date 
	   driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
	  Thread.sleep(2000);
	  
	  // 
	  
	  
	  
    // for Round trip How to select the dropdown
	  driver.findElement(By.xpath("(//input[@name=\"ctl00$mainContent$rbtnl_Trip\"])[2]")).click();
	  Thread.sleep(2000);
	  
	  
	  // whethere that is enabled or disabled
	  
	  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	  Thread.sleep(2000);
	  
	  
	// Back to One Way
	  driver.findElement(By.xpath("(//input[@name=\"ctl00$mainContent$rbtnl_Trip\"])[1]")).click();
	  Thread.sleep(2000);
	  
	  
	  
	  
	  
	  
	   
	   
		
		
	   
	   
	   
	   
	   
		
		
		/*for(int i=1; i<5; i++);
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		*/
		
		
		// we can write the condition in while loop also
		/*int i=1;
		while(i<5);
		{
			driver.findElement(By.id("hrefIncAdt")).click();  // 2 adults
			i++;
		}
		
	
		driver.findElement(By.id("btnclosepaxoption")).click(); // done button	
		
	}*/
	

		
		
	
		
		
		
		
		
	//	driver.close();
		


	}

}
