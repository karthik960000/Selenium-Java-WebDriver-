package DDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Declaration
public class Task_POM_Log_fb {
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement logbtn;
	public Task_POM_Log_fb(WebDriver driver) {
		//Initialization
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public WebElement getEmail() {
		 return email;
	 }
	public WebElement getPass() {
		 return password;
	 }
	public WebElement getLogbtn() {
		 return logbtn;
	 }

}
