package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {
  public WebDriver driver;
  
  @FindBy(xpath = "//a[@title='Proceed to checkout']")
  private WebElement waitPtCheck;
  
  public WebElement getWaitPtCheck() {
	return waitPtCheck;
}

@FindBy(xpath ="//a[@title='Proceed to checkout']")
  private WebElement ptcheckout;
  
  

public Page4(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getPtcheckout() {
	return ptcheckout;
}
}
