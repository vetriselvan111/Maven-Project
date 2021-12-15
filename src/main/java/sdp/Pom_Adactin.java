package sdp;

import org.openqa.selenium.WebDriver;

import adactin_pom.Book_hotel;
import adactin_pom.Booked;
import adactin_pom.Booking_Confirmation;
import adactin_pom.LoginPage;
import adactin_pom.Search_hotel;
import adactin_pom.Select_hotel;

public class Pom_Adactin {
 
	private WebDriver driver;
	private LoginPage lp;
	private Search_hotel search;
	private Select_hotel select;
	private Book_hotel book;
	private Booked booked;
	private Booking_Confirmation bconfirm;
	
	public Pom_Adactin(WebDriver driver2) {
		this.driver= driver2;
	}

	public LoginPage getInstantlp() {
		if(lp==null) {
			 lp = new LoginPage(driver);
		}
		return lp;
	}
	
	public Search_hotel getSearch() {
		if(search==null) {
			 search = new Search_hotel(driver);
		}
		return search;
	}
	public Select_hotel getSelect() {
		if(select==null) {
			select = new Select_hotel(driver);
		}
		return select;
	}
	public Booked getBook1() {
		if(booked==null) {
			booked = new Booked(driver);
		}
		return booked;
	}
	public Book_hotel getBook() {
		if(book==null) {
			book = new Book_hotel(driver);
		}
		return book;
	}
	public Booking_Confirmation getBconfirm() {
		if(bconfirm==null) {
			bconfirm = new Booking_Confirmation(driver);
		}
		return bconfirm;
	}
}

