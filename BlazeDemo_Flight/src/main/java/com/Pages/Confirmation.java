package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//This page is to verify the confirmation ID generated
public class Confirmation {

	//WebElements are identified by @FindBy annotation
	WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement Id;



	public Confirmation(WebDriver driver) {
		this.driver = driver;

		//initElements method will create all web elements

		PageFactory.initElements(driver, this);
	}



	//method to verify id
	public String ID() {
		String ActualID = Id.getText();
		return ActualID;
		}

	
	//method exposed to FlightTest test case
	public void confirmation() {
		this.ID();
	}
}
