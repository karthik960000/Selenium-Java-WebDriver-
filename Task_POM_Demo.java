package DDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_POM_Demo {
	@FindBy(linkText="Register")
	private WebElement register;
	@FindBy(id="gender-male")
	private WebElement gender;
	@FindBy(id="FirstName")
	private WebElement first;
	@FindBy(id="LastName")
	private WebElement last;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement pass;
	@FindBy(id="ConfirmPassword")
	private WebElement confirm;
	@FindBy(id="register-button")
	private WebElement submit;
	 Task_POM_Demo(WebDriver driver){
		 PageFactory.initElements(driver,this);
		
	}
	 public WebElement getReg() {
		 return register;
	 }
	 public WebElement getGender() {
		 return gender;
	 }
	 public WebElement getFirst() {
		 return first;
	 }
	 public WebElement getLast() {
		 return last;
	 }
	 public WebElement getEmail() {
		 return email;
	 }
	 public WebElement getPassword() {
		 return pass;
	 }
	 public WebElement getConfirm() {
		 return confirm;
	 }
	 public WebElement getSubmit() {
		 return submit;
	 }
}