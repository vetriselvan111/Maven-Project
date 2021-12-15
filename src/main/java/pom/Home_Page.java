package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Local;

public class Home_Page {
	
	public WebDriver driver;// null

	@FindBy(xpath ="//a[@class='login']")
	private WebElement Login;
	
	
	public Home_Page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	
	public WebElement getLogin() {
		return Login;
	}
}
