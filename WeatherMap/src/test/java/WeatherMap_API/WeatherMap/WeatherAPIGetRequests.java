package WeatherMap_API.WeatherMap;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class WeatherAPIGetRequests {



	//GET Request to validate Status code = 200 or 401 for API: cities within a rectangle zone
	@Test
	public void apiGetByRectangleZone() {

		Response resp = given().
				param("bbox", "12,32,15,37,10").
				param("appid", "4fbf1f2b9a4075aae742406753f09a22").
				when().
				get("http://api.openweathermap.org/data/2.5/box/city");
		if(resp.getStatusCode()==200) {
			System.out.println("API is working fine");
		}
		else
		{
			if(resp.getStatusCode()==401) {
				System.out.println("API is not working fine");
			}
		}

	}		

	//GET Request to validate Status code = 200 or 401 for API: cities in circle
	@Test
	public void apiGetByCircle() {

		Response resp = given().
				param("lat", "55.5").
				param("lon", "37.5").
				param("cnt", "10").
				param("appid", "4fbf1f2b9a4075aae742406753f09a22").
				when().
				get("http://api.openweathermap.org/data/2.5/find");
		if(resp.getStatusCode()==200) {
			System.out.println("API is working fine");
		}
		else
		{
			if(resp.getStatusCode()==401) {
				System.out.println("API is not working fine");
			}
		}

	}		

	//GET Request to validate a value in a response received from API: cities in circle
	@Test
	public void apiGetByCircleResponse() {

		String report = given().
				param("lat", "55.5").
				param("lon", "37.5").
				param("cnt", "10").
				param("appid", "4fbf1f2b9a4075aae742406753f09a22").
				when().
				get("http://api.openweathermap.org/data/2.5/find").
				then().
				contentType(ContentType.JSON).
				extract().
				path("list[0].weather[0].description");
		System.out.println("Weather Report: "+report);

	}

	//GET Request to calculate response time for API for finding cities within rectange zone
	@Test
	public void apiResponseTime() {

		Response resp = given().
				when().
				get("http://api.openweathermap.org/data/2.5/box/city");
				long time = resp.
				then().
				extract().
				time();
				System.out.println("Response Time is "+ time);
	}

}		




