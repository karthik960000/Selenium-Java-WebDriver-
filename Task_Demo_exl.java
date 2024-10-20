package DDT;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Demo_exl {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis= new FileInputStream("./Test/Sele.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String url= book.getSheet("Sheet1").getRow(0).getCell(0).toString();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		if(driver.getTitle().contains("Login")) {
			System.out.println("Login URL pass");
		}
		else {
			System.out.println("Login URL fail");
		}
		String UN= book.getSheet("Sheet1").getRow(0).getCell(1).toString();
		driver.findElement(By.id("Email")).sendKeys(UN);
		System.out.println(UN);
		Thread.sleep(2000);
		String PW= book.getSheet("Sheet1").getRow(0).getCell(2).toString();
		driver.findElement(By.id("Password")).sendKeys(PW);
		System.out.println(PW);
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
			System.out.println("Login success");
		}
		else {
			System.out.println("Login fail");
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
