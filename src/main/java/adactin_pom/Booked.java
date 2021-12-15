package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked {
	public WebDriver driver;
  
	public Booked(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy (xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox;
	
	@FindBy (xpath = "(//input[@type='submit'])[2]")
	private WebElement cancel;
	
	@FindBy ( xpath = "(//input[@type='button'])[6]")
	private WebElement logout;

	

	

	public WebElement getCheckbox() {
		return checkbox;
	}





	public WebElement getCancel() {
		return cancel;
	}





	public WebElement getLogout() {
		return logout;
	}

	
	}

