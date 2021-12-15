package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page6 {
  public WebDriver driver;// null
  
  @FindBy(xpath ="(//button[@type='submit'])[2]")
  private WebElement ptcheckout2;

public Page6(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getPtcheckout2() {
	return ptcheckout2;
}
  
}
