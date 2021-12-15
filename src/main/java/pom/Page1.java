package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
 
	public WebDriver driver;// null
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement Tshirt;

	public Page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirt() {
		return Tshirt;
	}
}
