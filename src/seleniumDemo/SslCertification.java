package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SslCertification 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
	}

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);     
		
		
	/*	FirefoxOptions option1 = new FirefoxOptions();
		option1.setAcceptInsecureCerts(true);   */
		
		WebDriver driver = new ChromeDriver(option);
	//	WebDriver driver= new FirefoxDriver(option);
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());  // to get the title 0f the page
		
		// when ever we run this we will assume that title will print but we will get an unexpected error 
		
		// at first we have to create an ChromeOptins Class
		
		 ChromeOptions option1 = new ChromeOptions();
		option1.setAcceptInsecureCerts(true);
		// after this we have to give that behaviour object as an argument in the chrome driver class 
		  // then only this chromedrive will get an knowledge about how it has to invoke the browser .
		 // if we donot pass the option it will donot have any clue about what the behaviour you are setting on top. 
		
		
		
		// for diffrent browser we have different class
		
		
		
		
		
		
		
		
	//	driver.close();

	}

}
