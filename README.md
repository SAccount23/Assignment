Assignment

UI Automation: Description: This is created using Page Factory model. It has four pages: Find Flights, Reserve, Purchase and Confirmation follwed by test case as FlightTest.

Test Scenarios:

Verify that the URL : https://blazedemo.com/ navigates to the page with heading "Welcome to the Simple Travel Agency!"

Verify the first page has below details: a. "Travel the World" link b. "home" link c. "Choose your departure city" dropdown. d. "Choose your destination city" dropdown. e. "Find Flights" button f. "destination of the week! The Beach!" link g. "Welcome to the Simple Travel Agency!" text h. "The is a sample site you can test with BlazeMeter!" text i. "Check out our destination of the week! The Beach!" which is combination of text and link

Verify "Choose your departure city" dropdown shows list of names for departure cities to select.

Verify "Choose your destination city" dropdown shows list of names for destination cities to select.

Verify that clicking on "Find Flights" button navigates to next page with url "https://blazedemo.com/reserve.php" and shows "Flights from Paris to Buenos Aires:" text and flight details in below columns: a. Choose column containing "Choose This Flight" button b. Flight# c. Airline d. Departs: name e. Arrives: Name f. Price

Verify clicking on "Choose This Flight" button navigates to "Purchase" page where flight details along with total cost, followed by a form which user needs to fill to complete the booking process.

Verify below fields are displayed on the Purchase page: a. "Your flight from TLV to SFO has been reserved." text b. Flight details c. Total Cost d. Form having

Name textbox
Address textbox
City textbox
State textbox
ZipCode textbox
Card Type dropdown
Credit Card Numer textbox
Month textbox
Year textbox
Name on Card textbox
Remember Me checkbox
"Purchase Flight" button
Verify that clicking on "Purchase Flight" button navigates to "Confirmation" page wherein details of the booking are displayed: a. Id b. Status c. Amount d. Card Number e. Expiration f. Auth Code g. Date
Here the subset being automated is:

Clicking on the URL navigates to the https://blazedemo.com/ page
Selecting departure city and destination city and click on Find Flights and get navigated to "https://blazedemo.com/reserve.php" url.
Click on Choose This Flight button and navigate to "https://blazedemo.com/purchase.php" page.
Click on "Purchase Flight" button and navigate to "https://blazedemo.com/confirmation.php" page and verify the ID.
We are not validating:

1.Under Scenario 2:

Types of input fields

Functionality of each link

Dropdown values

Min and max values

Under Scenario 3 and 4 , entire list of values

Under scenario 5, column values

Under scenario 6 and 7, no form validation

Under scenario 8, no details validation except ID.

These values are not selected because as per the requirement, we have to create a booking without validation any values on each page. The only value which needs to be verified is the Confirmation ID, hence if we validate all the values, this is only gonna make our script slow. The purpose of the script is to validate a basic smoke test.

API Automation:

Scenarios tested:

Basic status codes for two API's
Response as JSON type and validating some value in JSON
Response Time
