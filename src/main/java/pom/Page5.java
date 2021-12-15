package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5 {
  public WebDriver driver;
  
  @FindBy(xpath ="(//a[@title='Proceed to checkout'])[2]")
  private WebElement ptcheckout1;

public Page5(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getPtcheckout1() {
	return ptcheckout1;
}
}
