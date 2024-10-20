package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_skillraryLogin {
	//step1
	@FindBy(linkText="LOGIN")
	private WebElement loginbutton;
	@FindBy(id="email")
	private WebElement Email;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement check;
	@FindBy(id="last")
	private WebElement submit;
	//step2
	POM_skillraryLogin(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	//step3
	public WebElement getLogin(){
		return loginbutton;	
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPass() {
		return password;
	}
	public WebElement getCheck(){
		return check;
	}
	public WebElement  getSubmit() {
		return submit;
	}
}
