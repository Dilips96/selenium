package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trackedo {
	static{
		
		
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (5)/chromedriver");
	     //  System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
			
		}


	public static void main(String[] args)throws InterruptedException 
	{
		  WebDriver driver = new ChromeDriver();
	//	  WebDriver driver = new FirefoxDriver(); 
		    driver.manage().window().maximize(); //// To Maximize the page
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); // to wait for 4 seconds

			driver.get("http://betacode.trackado.net/");
			String Title = driver.getTitle();
			System.out.println(Title);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]")).sendKeys("shrutireddy1201@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"user_pass\"]")).sendKeys("121212");
			Thread.sleep(7000);
			
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			Thread.sleep(2000);
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			
			
			driver.findElement(By.xpath("//*[@id=\"head-nav\"]/div/div/div[1]/nav/ul/li[2]/a")).click();
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//*[@id=\"cl-wrapper\"]/div[1]/div/div[2]/a[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@class=\"form-control \"])[1]")).sendKeys("Udemy.co");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]")).sendKeys("https://www.ttm.agency/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[@value=\"5\"]")).click();
			Thread.sleep(2000);
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)", "");
			
			
			driver.findElement(By.xpath("(//input[@class=\"form-control \"])[2]")).sendKeys("Tester");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"town\"]")).sendKeys("Test Town");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("757658768");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"county\"]")).sendKeys("456456");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"addressline1\"]")).sendKeys("dghkhgkkfjhkjfd");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"postcode\"]")).sendKeys("4565656");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"addressline2\"]")).sendKeys("tfsdhkghkdfhgdfkjfd");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//option[text()=\"United Kingdom\"])[1]")).click();
			Thread.sleep(3000);
			
	        driver.findElement(By.id("275")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)", "");
			
			
			driver.findElement(By.xpath("//span[text()=\"1112\"]")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			
			driver.findElement(By.xpath("//option[@value=\"44\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[@value=\"147\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//option[@value=\"2\"])[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[text()=\"Candidate notes GENERIC\"]")).click();
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[@class=\"btn btn-primary aaa\"]")).click();
		    Thread.sleep(4000);
		    
		    
		    
		   
		    
		//	driver.navigate().back();
			
			driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"cl-wrapper\"]/div[1]/div/div[2]/a[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"clientname\"]")).sendKeys("Test Eli");
			Thread.sleep(3000); 
			
			
			
			
			
			
			
			
			
			
			
			
			
		//	Select sel = new Select(element)

			
		//driver.close();
			
		

	}

}
