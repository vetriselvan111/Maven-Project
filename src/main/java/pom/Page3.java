package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {
  public WebDriver driver;
  
  @FindBy(xpath="//iframe[@vspace='0']")
 private WebElement Frame;
  
  @FindBy(xpath="//button[@class='exclusive']")
  private WebElement addtocart;

public Page3(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getFrame() {
	return Frame;
}

public WebElement getAddtocart() {
	return addtocart;
}
}
