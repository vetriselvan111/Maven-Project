package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;// null

	@FindBy(xpath = "(//input[@name='email'][1])")
	private WebElement Email;
	
	@FindBy(xpath ="(//input[@name='passwd'][1])")
	private WebElement Password;
	
	@FindBy(id=("SubmitLogin"))
	private WebElement Submit_login;

	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit_login() {
		return Submit_login;
	}
}
