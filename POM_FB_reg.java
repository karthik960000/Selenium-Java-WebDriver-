package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_FB_reg {
	@FindBy(partialLinkText ="Create")
	private WebElement create;
	@FindBy(name="firstname")
	private WebElement first;
	@FindBy(name="lastname")
	private WebElement last;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(name="birthday_year")
	private WebElement year;
	@FindBy(xpath="//input[@value='2']")
	private WebElement gender;
	@FindBy(name="reg_email__")
	private WebElement email;
	@FindBy(name="reg_passwd__")
	private WebElement password;
	@FindBy(name="websubmit")
	private WebElement signup;
	POM_FB_reg (WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreate() {
		return create;
	}
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return signup;
	}
	
}
