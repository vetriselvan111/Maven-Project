package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage {
  public WebDriver driver;
  
  @FindBy (xpath="//input[@type='text']")
  private WebElement username;
  
  @FindBy (xpath = "//input[@type='password']")
  private WebElement password;
  
  @FindBy (xpath = "//input[@type='Submit']")
  private WebElement login;



public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public LoginPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getUsername() {
	return username;
}

}
