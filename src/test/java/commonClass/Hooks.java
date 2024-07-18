package commonClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Hooks{
	
	private static WebDriver driver;
	static ExtentTest extent;
	static ExtentReports report;
	

@BeforeClass
public static WebDriver driversetup(){
	//Setup Webdriver
	System.out.println("Starting Webdriver");
	System.setProperty("webdriver.chrome.driver", "D:/Trainings/workspace/MavenProject/MavenProject_Inside/DemoArtifactId/Framework/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
}

public static ExtentTest extentsetup(){
	System.out.println("Initialize Extent Report");
	report = new ExtentReports("D:/Trainings/workspace/MavenProject/MavenProject_Inside/DemoArtifactId/Framework/ExtentReports/ExtentReportResults.html");
	extent = report.startTest("ExtentDemo");
	
	return extent;
}


@AfterClass
public void endTest()
{
driver.quit();
//report.endTest(extent);
report.flush();
}

public static WebDriver getDriver() {
	// TODO Auto-generated method stub
	return null;
}


}
