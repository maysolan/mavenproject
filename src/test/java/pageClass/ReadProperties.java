package pageClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import commonClass.Hooks;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties extends Hooks {

	@Test
	public void ReadPropertiesFile() throws InterruptedException, IOException {

		WebDriver driver = Hooks.getDriver();
		LoginPage loginpage = new LoginPage();

//		Load Properties File Logic
		Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("D:/Trainings/workspace/MavenProject/MavenProject_Inside/DemoArtifactId/Framework/TestData/config.properties");
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found Custom Error");
        }

     // Get properties from properties file
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String pwd = properties.getProperty("pwd");
        
        
        driver.get(url);
		driver.manage().window().maximize();

		loginpage.login(username, pwd);

}
}
