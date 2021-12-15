package adactin_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Mini_Project.Base_class;

import sdp.Pom_Adactin;

public class RunnerClass_adactin extends Base_class {
 
	public static WebDriver driver = getBrowser("Chrome");
	
	public static Pom_Adactin pom = new Pom_Adactin(driver);
	
	public static void main(String[] args) throws IOException {
		
		URL("https://adactinhotelapp.com/index.php");
		
		sendKeysElement(pom.getInstantlp().getUsername(), "Vetriselvan");
		
		sendKeysElement(pom.getInstantlp().getPassword(), "Vetri@123");
		
		clickOnElement(pom.getInstantlp().getLogin());
		
		dropDown("index", pom.getSearch().getLocation(), "5");  //london
		
		dropDown("index", pom.getSearch().getHotels(), "4"); // hotel hervey
		
		dropDown("index", pom.getSearch().getRoom_type(), "3");  // delux
		
		dropDown("index", pom.getSearch().getNoOfRooms(), "3"); //three
		
		sendKeysElement(pom.getSearch().getCheckInDate(), "29/12/2021");
		
		sendKeysElement(pom.getSearch().getCheckOutDate(), "31/12/2021");
		
		dropDown("index", pom.getSearch().getAdult_room(), "2"); //two
		
		dropDown("index", pom.getSearch().getChild_room(), "1"); //0ne
		
		clickOnElement(pom.getSearch().getSearch());
		
		implicityWait(10, TimeUnit.SECONDS);
		
		clickOnElement(pom.getSelect().getCheck_Button());
		
		clickOnElement(pom.getSelect().getContinue1());
		
		implicityWait(10, TimeUnit.SECONDS);
		
		sendKeysElement(pom.getBook().getFirstName(), "Vetriselvan");
		
		sendKeysElement(pom.getBook().getLastName(), "Govindharaj");
		
		sendKeysElement(pom.getBook().getAddress(), "************************");
		
		sendKeysElement(pom.getBook().getCreditCard(), "1234567891234567");
		
		dropDown("index", pom.getBook().getCardType(), "2"); //visa
		
		dropDown("index", pom.getBook().getExp_Month(), "7"); // july
		
		dropDown("index", pom.getBook().getExp_Year(), "12"); //2022
		
		sendKeysElement(pom.getBook().getCvvNo(), "7860"); 
		
		clickOnElement(pom.getBook().getBookNow());
		
		implicityWait(20, TimeUnit.SECONDS);
		
		clickOnElement(pom.getBconfirm().getMy_itinerary());
		
		implicityWait(20, TimeUnit.SECONDS);
		
		clickOnElement(pom.getBook1().getCheckbox());
		
		implicityWait(15, TimeUnit.SECONDS);
		
	    screenShot("./Screenshots/project8.png");
	    
	    implicityWait(20, TimeUnit.SECONDS);
	    
	    clickOnElement(pom.getBook1().getCancel());
	    
	    implicityWait(20, TimeUnit.SECONDS);
	    
	    alert("getText", null);
	    
	    implicityWait(20, TimeUnit.SECONDS);
	    
	    clickOnElement(pom.getBook1().getLogout());
	    
	    implicityWait(15, TimeUnit.SECONDS);
	    
	    screenShot("./Screenshots/project9.png");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
