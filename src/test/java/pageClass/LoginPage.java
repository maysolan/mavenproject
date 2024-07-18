package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonClass.Hooks;

public class LoginPage extends Hooks{
	ExtentTest extent = Hooks.extentsetup();
	private static WebDriver driver;
	
@FindBy(xpath = "//input[@id='user-nam']") public WebElement usernamefield;
@FindBy(xpath = "//input[@id='password']") public WebElement pwdfield;
@FindBy(xpath = "//input[@id='login-button']") public WebElement submitbutton;


public LoginPage() {
		
	driver=Hooks.driversetup();

	}
public void launchurl() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
		
	
	public void login(String username, String password) throws InterruptedException {

		System.out.println("Apply Breakpoint");
//		WebElement usernamefield = driver.findElement(By.xpath("//input[@id='user-nam']"));

		usernamefield.sendKeys(username);
		System.out.println("Successfully entered Username");
		extent.log(LogStatus.PASS, "Successfully entered Username");
		Thread.sleep(1000);
		
//		WebElement pwdfield = driver.findElement(By.xpath("//input[@id='password']"));
		pwdfield.sendKeys(password);
		System.out.println("Successfully entered pwd");
		extent.log(LogStatus.PASS, "Successfully entered pwd");
		Thread.sleep(1000);
		
		
	
	}
	
		public void submit() throws InterruptedException {
		
//		WebElement submitbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		submitbutton.click();
		System.out.println("Successfully click on Login Button");
		extent.log(LogStatus.PASS, "Successfully click on Login Button");
		Thread.sleep(2000);
		}
		
		public void validate() throws InterruptedException {
			
//			 Log steps in report
			if(driver.getTitle().equals("Swag Labs"))
			{
				extent.log(LogStatus.PASS, "Login Successfull");
			}
			else
			{
				extent.log(LogStatus.FAIL, "Unable to Login & Test Failed");
			}
		}
}