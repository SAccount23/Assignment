package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.FindFlights;
import com.Pages.Reserve;
import com.Pages.Purchase;
import com.Pages.Confirmation;



public class FlightTest {
	String projectPath = System.getProperty("user.dir");
	//String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	FindFlights flights;
	Reserve reserve;
	Purchase purchase;
	Confirmation confirmation;


	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", projectPath +"/drivers/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * This test select values on 1st page
	 * moves to "Reserve" page and clicks on "Choose this Flight button"
	 * then moves to "Purchase" page and fill the details and click on "Purchase Flight" button
	 * and then finally verify the ID generated is not empty.
	 */
	@Test
	public void booking() {

		//object of all 4 pages created
		FindFlights objFlights = new FindFlights(driver);
		Reserve objReserve = new Reserve(driver);
		Purchase objPurchase = new Purchase(driver);
		Confirmation objConfirmation = new Confirmation(driver);

		objFlights.flights("Paris", "Rome");
		objReserve.reserve();
		objPurchase.purchase("XYZ", "123 Main St", "Bangalore", "Karnataka", "12345","Visa", "11", "2017", "John Smith");
		objConfirmation.confirmation();
		String ExpectedTitle = null;
		
		Assert.assertNotNull(objConfirmation.ID(), ExpectedTitle);
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}







}





