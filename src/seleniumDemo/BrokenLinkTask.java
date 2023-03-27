package seleniumDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkTask 
{
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
	}

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Title = driver.getTitle();  // to get the Title 
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		
		
		
		String url = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[4]/a")).getAttribute("href");

		// this is Only for getting the one link
		
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		
		
		
		
		
		// VV Important  
		
		/* 1 You need to call this to the open connection Method  
		 * This method is present in URL Class	that is y we are creating object and  calling that method with object.method 
		 * and when we call this Method this return type is HttpURLConnection                         */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
