package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
     
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy (xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy (xpath = "//input[@name='cc_num']")
	private WebElement creditCard;
	
	@FindBy (xpath = "//select[@name='cc_type']")
	private WebElement cardType;
	
	@FindBy (xpath = "//select[@name='cc_exp_month']")
	private WebElement exp_Month;
	
	@FindBy (xpath = "//select[@name='cc_exp_year']")
	private WebElement exp_Year;
	
	@FindBy (xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNo;
	
	@FindBy (xpath = "//input[@name='book_now']")
	private WebElement bookNow;

	public Book_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_Year() {
		return exp_Year;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
}
