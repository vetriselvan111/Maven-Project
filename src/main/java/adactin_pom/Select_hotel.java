package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
  
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@type='radio']")
	private WebElement check_Button;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement continue1;

	public Select_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheck_Button() {
		return check_Button;
	}

	public WebElement getContinue1() {
		return continue1;
	}
	
}
