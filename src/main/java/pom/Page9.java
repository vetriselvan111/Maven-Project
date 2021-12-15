package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page9 {
  public WebDriver driver;//null
  
  @FindBy(xpath="//span[text()='I confirm my order']")
  private WebElement confirm;

public Page9(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getConfirm() {
	return confirm;
}
}
