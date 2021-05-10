package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//This page is to select flight based on the search performed on FindFlights page.
public class Reserve {

	//WebElements are identified by @FindBy annotation
	WebDriver driver;

	@FindBy(tagName = "input")
	WebElement chooseFlight;


	public Reserve(WebDriver driver) {
		this.driver = driver;

		//initElements method will create all web elements

		PageFactory.initElements(driver, this);
	}


	//click on Choose This Flight button
	public void chooseFlights() {
		chooseFlight.click();
	}


	//method exposed to FlightTest test case
	public void reserve() {
		this.chooseFlights();

	}
}

