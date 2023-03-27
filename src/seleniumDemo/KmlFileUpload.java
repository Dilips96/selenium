package seleniumDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KmlFileUpload 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.get("https://www.windy.com/?16.889,1.143,3");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class=\"iconfont clickable-size\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-do=\"rqstOpen,uploader\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Choose a file']")).click();
		
		
		Robot rb = new Robot();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("/home/active35/Downloads/cosmosVDC.kml");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	//	driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Tech Active solutions");
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//div[@type=\"submit\"]")).click();
	//	Thread.sleep(2000);
		
		
		
		
		
//		WebElement upload_file = driver.findElement(By.xpath("//label[text()='Choose a file']"));
//		upload_file.sendKeys("/home/active35/Downloads/cosmosVDC.kml");
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement upload_file = driver.findElement(By.xpath("/html/body/form/input[1]"));

		upload_file.sendKeys("/home/active35/Downloads/cosmosVDC.kml");   */
		
		
		
		

	}

}
