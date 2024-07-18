package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonClass.Hooks;
import pageClass.LoginPage;


public class TestCase1 extends Hooks{

public static WebDriver driver;
String username = "standard_user";
String pwd = "secret_sauce";


@Test 
public void LoginPage() throws InterruptedException{
	
//driver=Hooks.driversetup();
//LoginPage loginpage = new LoginPage();
LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);

loginpage.launchurl();
loginpage.login(username, pwd);
loginpage.submit();
loginpage.validate();

}
}