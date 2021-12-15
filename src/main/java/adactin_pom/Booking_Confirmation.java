package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
 
	public Booking_Confirmation(WebDriver driver2) {
		driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;
	
	@FindBy (xpath = "//input[@name='my_itinerary']")
	private WebElement my_itinerary;

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
}
