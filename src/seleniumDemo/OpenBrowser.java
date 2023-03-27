package seleniumDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	static{
		
	System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (5)/chromedriver");
//	System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
		
	}
	

/**
 * @param args
 * @throws InterruptedException
 */
/**
 * @param args
 * @throws InterruptedException
 */
public static void main(String[] args) throws InterruptedException 
{
	
	
	
	WebDriver driver = new ChromeDriver();
//	WebDriver driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	driver.get("http://192.168.29.228:3001/");
	
	driver.manage().window().maximize(); //// To Maximize the Driver
	
	
	String Title = driver.getTitle();  // to get the Title 
	System.out.println(Title);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());

	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter mobile number\"]")).sendKeys("7676767676");
	

	
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter password\"]")).sendKeys("123456");
	

	
	driver.findElement(By.xpath("//button[@id=\"blue-btn1\"]")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//button[text() = \"NEW BOOKING\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter your number\"]")).sendKeys("7506165217");
	Thread.sleep(2000);
	
	//8903708390
	
	/*driver.findElement(By.xpath("//input[@placeholder=\"Enter your name\"]")).sendKeys("Tester");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter customer email address\"]")).sendKeys("test05active@gmail.com");
	Thread.sleep(2000); */
	
	driver.findElement(By.xpath("//button[@id=\"formSelectbtn\"]")).click(); 
	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)", "");
	
	driver.findElement(By.xpath("//p[text()=\"Bentley Bentley Mulsanne\"]")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jd5 = (JavascriptExecutor) driver;
	jd5.executeScript("window.scrollBy(0,500)", "");
	
	
	
                //	This is For Subscription Part	
	
	
/*	driver.findElement(By.xpath("//button[text()=\"Add Subscription(s)\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@value=\"153\"]")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,300)", "");             	
  

	driver.findElement(By.xpath("//input[@value=\"149\"]")).click();
	Thread.sleep(2000); */
	

	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,500)", ""); 
	
	driver.findElement(By.xpath("//button[text()=\"Add Service(s)\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()=\"Dr. Auto\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()=\"Anti Microbial Fumigation\"]")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jd1 = (JavascriptExecutor) driver;
	jd1.executeScript("window.scrollBy(0,1200)", "");
	
	driver.findElement(By.xpath("//button[text()=\"SAVE\"]")).click();
	Thread.sleep(2000);
	
	
	//-----------------------------------------------------------
	
/*	
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,900)", "");             	
  
	driver.findElement(By.xpath("//button[@class=\"btnpos\"]")).click();
	Thread.sleep(2000); */
	
//	driver.findElement(By.xpath("//input[@placeholder=\"Enter Discount Code\"]")).sendKeys("USE10");
//	Thread.sleep(2000);
	
	driver.findElement(By.className("applyButton")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jd6 = (JavascriptExecutor) driver;
	jd6.executeScript("window.scrollBy(0,200)", "");             	
  
	driver.findElement(By.className("ctNorm")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jd2 = (JavascriptExecutor) driver;
	jd2.executeScript("window.scrollBy(0,300)", "");  
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter vehicle registration number\"]")).sendKeys("KA09 TA 2022");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter the person name to handover the key\"]")).sendKeys("Sanjay");
	Thread.sleep(2000);
	
	System.out.println("For Delivery Date & Delivery Time i have not written the xpath");
	
	driver.findElement(By.xpath("//input[@placeholder=\"Select Date\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@aria-selected=\"true\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class=\"rc-time-picker-input\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/ul/li[24]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/ul/li[36]")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
  /*  driver.findElement(By.xpath("(//button[@id=\"formSelectbtn\"])[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@label=\"GST Number\"]")).sendKeys("18AABCU9603R1ZM");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter Billing Name\"]")).sendKeys("Monika");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter full address with city and postcode\"]")).sendKeys("23 Siva Arcade, 2nd Floor, 29th Main Rd, above Bank of Baroda, Jay Bheema Nagar, BTM 1st Stage, Bengaluru, Karnataka 560068");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()=\"SAVE\"]")).click();
	Thread.sleep(2000);  */
	
	driver.findElement(By.xpath("//textarea[@placeholder=\"Enter any comments or additional information\"]")).sendKeys("This is For automation Project");
	Thread.sleep(2000);  
	
	driver.findElement(By.xpath("//button[@btntext=\"CONFIRM BOOKING\"]")).click();
	Thread.sleep(7000);

	System.out.println("This Complete the sales module");
	 
	driver.findElement(By.xpath("//span[text()=\"Ops\"]")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
	

	
	
	
	
	

	
	
	driver.close(); // to close the Current Browser
	//driver.quit(); // to close all the tabs 
	
	
	
	
	
	
	
	
	
}

}
