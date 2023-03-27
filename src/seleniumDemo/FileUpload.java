package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		 
		driver.navigate().to("https://www.google.com/");
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	
	
		 WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("/home/active35/Downloads/DILIP CV.pdf"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
		
		
		

		
		
		
		
		
	//	driver.close();
		
		
	}

}
