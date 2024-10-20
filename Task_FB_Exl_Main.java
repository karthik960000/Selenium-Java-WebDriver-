package DDT;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_FB_Exl_Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis= new FileInputStream("./Test/Sele.xlsx");

		Workbook book= WorkbookFactory.create(fis);
		String url= book.getSheet("Sheet2").getRow(0).getCell(0).toString();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			System.out.println("URL Testpass");
		}
		else {
			System.out.println("URL testfail");
		}
		
		Task_POM_Log_fb pom= new Task_POM_Log_fb(driver);
		
		String UN= book.getSheet("Sheet2").getRow(0).getCell(2).toString();
		pom.getEmail().sendKeys(UN);
		Thread.sleep(2000);
		
		String PW=book.getSheet("Sheet2").getRow(0).getCell(1).toString();
		pom.getPass().sendKeys(PW);
		Thread.sleep(2000);
		
		pom.getLogbtn().click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			System.out.println("Login success");
			driver.close();
		}
		else {
			System.out.println("Login not Success");
			driver.close();	
			
		}
		
	}

}
