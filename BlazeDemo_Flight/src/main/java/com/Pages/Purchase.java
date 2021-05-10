package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//This page is to fill in details and purchase the flight
public class Purchase {

	//WebElements are identified by @FindBy annotation
	WebDriver driver;

	@FindBy(id = "inputName")
	WebElement name;

	@FindBy(id = "address")
	WebElement address;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(id = "zipCode")
	WebElement zipCode;

	@FindBy(id = "cardType")
	WebElement cardType;

	@FindBy(id = "creditCardNumber")
	WebElement cardNumber;

	@FindBy(id = "creditCardMonth")
	WebElement month;

	@FindBy(id = "creditCardYear")
	WebElement year;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCard;

	@FindBy(xpath = "//body/div[2]/form[1]/div[11]/div[1]/input[1]")
	WebElement purchaseFlight;

	public Purchase(WebDriver driver) {
		this.driver = driver;

		//initElements method will create all webelements

		PageFactory.initElements(driver, this);
	}


	//set name in text box

	public void setUserName(String strUserName) {
		name.sendKeys(strUserName);
	}

	//set address
	public void setAddress(String strAddress) {
		address.sendKeys(strAddress);
	}

	//set city
	public void setCity(String strCity) {
		city.sendKeys(strCity);
	}
	//set state
	public void setState(String strState) {
		state.sendKeys(strState);
	}

	//set ZipCode
	public void setZip(String strZip) {
		zipCode.sendKeys(strZip);

	}
	//select Card type
	public void selectCardType(String type) {
		Select select = new Select(cardType);
		select.selectByVisibleText(type); 
	}

	//set month
	public void setMonth(String strMonth) {
		month.sendKeys(strMonth);
	}
	//set year	
	public void setYear(String strYear) {
		year.sendKeys(strYear);
	}

	//set name on card
	public void setNameOnCard(String strNameOnCard) {
		nameOnCard.sendKeys(strNameOnCard);
	}

	//click on Purchase Flight button
	public void purchaseFlight() {
		purchaseFlight.submit();
	}


	//method exposed to FlightTest test case
	public void purchase(String strUserName, String strAddress, String strCity, String strState, String strZip, String type, String strMonth, String strYear, String strNameOnCard) {


		this.setUserName(strUserName);
		this.setAddress(strAddress);
		this.setCity(strCity);
		this.setState(strState);
		this.setZip(strZip);
		this.selectCardType(type);
		this.setMonth(strMonth);
		this.setYear(strYear);
		this.setNameOnCard(strNameOnCard);
		this.purchaseFlight();
	}
}





