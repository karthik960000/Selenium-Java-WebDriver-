package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_SAMPLE {
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	public POM_SAMPLE(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getemail() {
		return email;
	}
	public WebElement getpass() {
		return password;	
	}
	public WebElement getlogin() {
		return login;
	}
}
