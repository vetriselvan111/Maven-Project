package sdp;

import org.openqa.selenium.WebDriver;

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

public class Page_Object_Manager {
   public WebDriver driver;
   private Home_Page hp;
   private Login_Page Login;
   private Page1 pg1;
   private Page2 pg2;
   private Page3 pg3;
   private Page4 pg4;
   private Page5 pg5;
   private Page6 pg6;
   private Page7 pg7;
   private Page8 pg8;
   private Page9 pg9;
   
   public Page_Object_Manager(WebDriver driver2) {
	
	   this.driver=driver2;
}

public Home_Page getInstanthp() {
	   if(hp==null) {
		   hp = new Home_Page(driver);  
	   }                                
	   return hp; 
   }
   
   public Login_Page getLogin() {
	   if (Login==null) {
		   Login = new Login_Page(driver);
		   }
	   return Login;
   }
   
   public Page1 getPg1() {
	   if(pg1==null) {
		   pg1= new Page1(driver);
	   }
	   return pg1;
   }
    public Page2 getPg2() {
    	if(pg2==null) {
    		pg2=new Page2(driver);
    	}
    	return pg2;
    }
    
    public Page3 getPg3() {
    	if(pg3==null) {
    		pg3=new Page3(driver);
    	}
    	return pg3;
    }
    
   public Page4 getPg4() {
	   if(pg4==null) {
		   pg4=new Page4(driver);
	   }
	   return pg4;
	    }
   public Page5 getPg5() {
	   if (pg5==null) {
		   pg5=new Page5(driver);
	   }
	   return pg5;
	   }
   public Page6 getPg6() {
	   if(pg6==null) {
		   pg6=new Page6(driver);
	   }
	   return pg6;
   }
   public Page7 getPg7() {
	   if(pg7==null) {
		   pg7=new Page7(driver);
	   }
	   return pg7;
   }
   public Page8 getPg8() {
	   if(pg8==null) {
		   pg8=new Page8(driver);
	   }
	   return pg8;
   }
   public Page9 getPg9() {
	   if(pg9==null) {
		   pg9=new Page9(driver);
	   }
	   return pg9;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
   

