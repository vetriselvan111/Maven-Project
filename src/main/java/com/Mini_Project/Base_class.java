
package com.Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	
	public static WebDriver driver;//-----> null
	
	
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("WebDriver.Chrome.Driver", 
				System.getProperty("user.dir")+"//Driver//ChromeDriver.exe");
		 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("WebDriver.gecko.Driver", 
					System.getProperty("user.dir")+"//Driver//FirefoxDriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		return driver;
	}
	   // Actions Method
	public static void actionsPerform(String type,WebElement element) {
		Actions ac = new Actions(driver);
		if(type.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}
		else if (type.equalsIgnoreCase("moveToElement")) {
			ac.moveToElement(element).build().perform();
		}
		else if (type.equalsIgnoreCase("contextClick")) {
			ac.contextClick(element).build().perform();
			}
		else if (type.equalsIgnoreCase("doubleClick")) {
			ac.doubleClick().build().perform();
		}  
		
	}
	
	// DropDown Methods
	
	public static void dropDown(String type,WebElement element,String value) {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(value);
			s.selectByIndex(num);
		}
		else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
			}	
	}
	
  
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void sendKeysElement(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void URL(String url) {
		driver.get(url);
	}
	
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	 
	public static void screenShot(String pathname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(pathname);
		FileHandler.copy(source, destination);
			
}
	public static void scroll(String type,String value,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("scrollBy")) {
			js.executeScript(value);
		}
		else if (type.equalsIgnoreCase("scrollIntoView")) {
			js.executeScript("arguments[0].scrollIntoView()",element);
			
		}
		}
	public static void frames(String type,String value,WebElement element) {
		if (type.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(value);
			driver.switchTo().frame(num);
		}
		else if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);
			}
		else if (type.equalsIgnoreCase("defaultContent")) {
			driver.switchTo().defaultContent();
		}
			
		}
	
	public static void implicityWait(int sec, TimeUnit  type) {
		driver.manage().timeouts().implicitlyWait(sec, type);
	}
	
	public static void explicityWait(String type,int sec,WebElement element) {
		WebDriverWait waits = new WebDriverWait(driver,sec);
		if (type.equalsIgnoreCase("visibilityOfElement")) {
			waits.until(ExpectedConditions.visibilityOf(element));
		}
		}
	public static void alert(String type,String value) {
		if(type.equalsIgnoreCase("alert")) {
			driver.switchTo().alert().accept();
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
		else if (type.equalsIgnoreCase("sendkeys")) {
			driver.switchTo().alert().sendKeys(value);
		}
		else if (type.equalsIgnoreCase("getText")) {
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
			driver.switchTo().alert().accept();
		}
		
	}
	}

