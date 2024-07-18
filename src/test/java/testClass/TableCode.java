package testClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonClass.Hooks;

public class TableCode extends Hooks{

@Test
public void TestClass() {
		
WebDriver driver = Hooks.getDriver();
driver.get("https://demo.guru99.com/test/web-table-element.php#");
driver.manage().window().maximize();
WebElement table = driver.findElement(By.xpath("//table[@class ='dataTable']"));
 
List<WebElement> rows = table.findElements(By.tagName("tr"));
 
double maximumPrice = Double.MIN_VALUE;
String company= "";
for(int i=1;i<rows.size();i++){
    List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
    String companyName = cells.get(0).getText();
    double price = Double.parseDouble(cells.get(3).getText().replace("$",""));
    if(price> maximumPrice){
        maximumPrice = price;
        company = companyName;
    }
}
 
System.out.println("Company with maximum price is: "+company+ " : "+ maximumPrice);
		
	}

}