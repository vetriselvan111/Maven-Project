package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page7 {
  public WebDriver driver;// null
  
  @FindBy(id ="cgv" )
  private WebElement checkbox;
  
  @FindBy(xpath="//button[@name='processCarrier']")
  private WebElement Ptcheckout3;

public Page7(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getCheckbox() {
	return checkbox;
}

public WebElement getPtcheckout3() {
	return Ptcheckout3;
}
  
}
