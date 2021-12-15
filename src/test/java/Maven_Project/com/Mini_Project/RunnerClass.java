package Maven_Project.com.Mini_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Mini_Project.Base_class;

import pom.Home_Page;
import pom.Login_Page;
import pom.Page1;
import pom.Page2;
import pom.Page3;
import pom.Page4;
import pom.Page5;
import pom.Page6;
import pom.Page7;
import pom.Page8;
import pom.Page9;
import sdp.Page_Object_Manager;



public class RunnerClass extends Base_class {
	
	public static WebDriver driver=getBrowser("Chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		URL("http://automationpractice.com/index.php");
		
		clickOnElement(pom.getInstanthp().getLogin());
		
		sendKeysElement(pom.getLogin().getEmail(), "talentedvetri@gmail.com");
		 
		sendKeysElement(pom.getLogin().getPassword(), "Mithun@123");
		
		clickOnElement(pom.getLogin().getSubmit_login());
		
		clickOnElement(pom.getPg1().getTshirt());
		
		actionsPerform("moveToElement", pom.getPg2().getImage());
		
		implicityWait(5, TimeUnit.SECONDS);
		
		actionsPerform("click", pom.getPg2().getImg_click());
	
		frames("element", null, pom.getPg3().getFrame());
		
		clickOnElement(pom.getPg3().getAddtocart());
		
		frames("defaultContent", null, null);
		
		explicityWait("visibilityOfElement", 20, pom.getPg4().getPtcheckout());
		
		actionsPerform("moveToElement",pom.getPg4().getPtcheckout());
		
		actionsPerform("click", pom.getPg4().getPtcheckout());
		
        scroll("scrollBy", "window.scrollBy(0,500);", null);
        
        implicityWait(5, TimeUnit.SECONDS);
		
		clickOnElement(pom.getPg5().getPtcheckout1());
		
	    scroll("scrollBy", "window.scrollBy(0,500);", null);
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    clickOnElement(pom.getPg6().getPtcheckout2());
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    clickOnElement(pom.getPg7().getCheckbox());
	    
	    actionsPerform("click", pom.getPg7().getPtcheckout3());
	    
	    scroll("scrollBy", "window.scrollBy(0,500);", null);
	    
	    actionsPerform("click", pom.getPg8().getCheque());
	    
	    scroll("scrollBy", "window.scrollBy(0,300);", null);
	    
	    actionsPerform("click", pom.getPg9().getConfirm());
	    
	    scroll("scrollBy", "window.scrollBy(0,300);", null);
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    screenShot("./Screenshots/project7.png");
	    	    
	}
}
