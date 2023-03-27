package seleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DemoProjectArun 
{
private static Object wait;


static{
		
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (2)/chromedriver");
//		System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
			
		}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();   //// To Maximize the Driver
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit Wait
		
		int i=0;
		driver.get("https://services.ecourts.gov.in/");
		driver.findElement(By.id("leftPaneMenuCS")).click();
		
		((Object) wait).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='OK']")));
		driver.findElement(By.xpath("//button[.='OK']")).click();
		WebElement stateDropdown = driver.findElement(By.id("sess_state_code"));
		Select stateDropdownSelect= new Select(stateDropdown);
		List<WebElement> allStateOptions = stateDropdownSelect.getOptions();
		
		stateDropdownSelect.selectByVisibleText("Uttar Pradesh");
		System.out.print("The State selected is: ");
		System.out.println(stateDropdownSelect.getFirstSelectedOption().getText());
		
		
		//wait.until(ExpectedConditions.textToBe(By.id("sess_state_code"),  "Karnataka"));
		//wait.until(ExpectedConditions.attributeContains(stateDropdown,stateDropdown.getText(),"Karnataka"));
		
		
		if(stateDropdownSelect.getFirstSelectedOption().getText().equalsIgnoreCase("Uttar Pradesh"))
		{
			System.out.println("The Districts Courts present in the state are: ");
		int j=0;
		WebElement districtDropdown = driver.findElement(By.id("sess_dist_code"));
		Select districtDropdownSelect=new Select(districtDropdown);
		List<WebElement> allDistrictOptions = districtDropdownSelect.getOptions();
		
		
		//waiting for all dropdown elements to be visible
		
		
		((Object) wait).until(ExpectedConditions.visibilityOfAllElements(allDistrictOptions));
		for(WebElement districtOption:allDistrictOptions)
		{
			String districtVisibleText=districtOption.getText();
			districtDropdownSelect.selectByVisibleText(districtVisibleText);
			if(districtOption.isSelected())
			{
				System.out.println(++j+" Pass: "+districtVisibleText+" is selected Successfully");
			}
			else
			{
				System.out.println(++j+" Fail: "+districtVisibleText+" is selected Successfully");
			}
		}
		Thread.sleep(5000);
		//districtSelectDropdownSelect.selectByVisibleText("KOLAR");
		}else {
			System.out.println("Fail: District Courts not Loaded in districtDropdown");
			System.out.println(stateDropdown.getText());
		}
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
	//	driver.close();
		
		

	}

}
