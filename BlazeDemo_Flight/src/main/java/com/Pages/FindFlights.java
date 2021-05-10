package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//This page is to select departure city and destination city on the BlazeDemo page and Find Flights accordingly
public class FindFlights {

	//WebElements are identified by @FindBy annotation
	WebDriver driver;

	@FindBy(name = "fromPort")
	WebElement departureCity;

	@FindBy(name = "toPort")
	WebElement destinationCity;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/form[1]/div[1]/input[1]")
	WebElement findFlights;


	public FindFlights(WebDriver driver) {
		this.driver = driver;

		//initElements method will create all web elements

		PageFactory.initElements(driver, this);
	}


	//select departure city value
	public void selectDepartureCity(String departure) {
		Select select = new Select(departureCity);
		select.selectByVisibleText(departure); 
	}
	//select destination city value
	public void selectDestinationCity(String destination) {
		Select select = new Select(destinationCity);
		select.selectByVisibleText(destination); 
	}
	//click on Find Flights button
	public void findFlights() {
		findFlights.click();
	}


	//method exposed to FlightTest test case
	public void flights(String departure, String destination) {
		this.selectDepartureCity(departure);

		this.selectDestinationCity(destination);

		this.findFlights();
	}
}


