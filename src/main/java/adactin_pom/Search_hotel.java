package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
  
	public WebDriver driver;
	
	@FindBy (xpath ="//select[@name='location']")
	private WebElement location;
	
	@FindBy (xpath ="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy (xpath ="//select[@name='room_type']")
	private WebElement room_type;
	
	@FindBy (id ="room_nos" )
	private WebElement noOfRooms;
	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	@FindBy (xpath ="//input[@name='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy (xpath ="//input[@name='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy (xpath = "//select[@name='adult_room']")
	private WebElement adult_room;
	
	@FindBy (xpath = "//select[@name='child_room']")
	private WebElement child_room;
	
	@FindBy (xpath = "//input[@name='Submit']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public Search_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	
	
}
