package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
	
	public WebDriver driver;//null
   @FindBy(xpath ="//img[@title='Faded Short Sleeve T-shirts']")
   private WebElement image;
   
   @FindBy(xpath ="//a[@class='quick-view']")
   private WebElement img_click;

public Page2(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getImage() {
	return image;
}

public WebElement getImg_click() {
	return img_click;
}
}
