package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_google {
	//Step-1
	@FindBy(id="APjFqb")
	private WebElement search;
	//Step-2
	 POM_google(WebDriver driver){
		PageFactory.initElements( driver,this);
	}
	 //Step-3
	 public WebElement getSearch() {
		 return search;
	 }
}
