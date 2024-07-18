package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import commonClass.Hooks;

public class ReadExcelData extends Hooks {

	@Test
	public void ExcelProgram() throws InterruptedException, IOException {

		WebDriver driver = Hooks.getDriver();
		LoginPage loginpage = new LoginPage();

//		Read the Excel File
		//Path of the excel file
		FileInputStream fis = new FileInputStream("D:/Trainings/workspace/MavenProject/MavenProject_Inside/DemoArtifactId/Framework/TestData/input.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		
//		Iterate through each row in the excel sheet
		for(Row row : sheet) {
			
//			Read data from each cell
			Cell usernameCell = row.getCell(0);
			Cell passwordCell = row.getCell(1);
			
			String username = usernameCell.getStringCellValue();
			String pwd =passwordCell.getStringCellValue();

		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		loginpage.login(username, pwd);

//		Extract results from Website
		WebElement LoginConfirm = driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[1]"));
		String result = LoginConfirm.getText();
		
//		Create a new Cell 
		Cell resultcell = row.createCell(2);
		resultcell.setCellValue(result);
		
	}

//	Write the result to Workbook
	FileOutputStream fos = new FileOutputStream("D:/Trainings/workspace/MavenProject/MavenProject_Inside/DemoArtifactId/Framework/TestData/Output.xlsx");
    workbook.write(fos);
    fos.close();

    // Close the workbook and the WebDriver
    workbook.close();
	}
}

