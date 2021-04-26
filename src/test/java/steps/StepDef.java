package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.FindReservation;
import page.LoginPage;
import util.BrowserFactory;

public class StepDef {
	WebDriver driver;
	LoginPage loginpage;
	FindReservation findreservation;
	
	@Before
	public void BeforeRun() {
		
		driver =BrowserFactory.startBrowser();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		findreservation = PageFactory.initElements(driver, FindReservation.class);
		
	}

	@Given("^User is on the ChoiceAdvantage Login Page$")
	public void User_is_on_the_ChoiceAdvantage_Login_Page() {
		
		driver.get("https://www.choiceadvantage.com/choicehotels/sign_in.jsp");
		
	}

	@When("^User enters the userid as \"([^\"]*)\"$")
	public void User_enters_the_userid(String userId) {
		loginpage.enterUserId(userId);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hpatel.txa01");
		
	}
	
	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String password){
		loginpage.enterPassword(password);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Goku2020");
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String userId, String password) throws InterruptedException  {
	    loginpage.login(userId, password);
	    Thread.sleep(10000);
	}
	    
	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		loginpage.clickSignInButton();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@id='greenButton']")).click();
		
	}
	

	@Then("^User should be able to land on Welcome Page$")
	public void user_should_be_able_to_land_on_Welcome_Page() throws IOException  {
		
	    String expectedTitle="Good Morning, Hardik!";
	    String actualTitle="Good Morning, Hardik!";
	    Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("User is on WelcomePage");
		loginpage.getPageTitle();
		loginpage.takeScreenShotAtEndOfTest(driver);
	    
	}
	
	@Then("^User should not be able to land on Welcome Page$")
	public void user_should_not_be_able_to_land_on_Welcome_Page() throws Throwable {
		String expectedTitle="Welcome - December 21, 2020";
	    String actualTitle="Welcome - December 21, 2020";
	    Assert.assertEquals(expectedTitle, actualTitle);
	    loginpage.getPageTitle();
	    System.out.println("User is not able to login");
	}
	
	@Then("^User clicks on find button$")
	public void user_clicks_on_find_button()  {
		findreservation.clickOnFindButton();
	    
	}

	@Then("^User clicks on reservation button$")
	public void user_clicks_on_reservation_button()  {
		findreservation.clickOnReservationButton();
	 
	}

	@Then("^User fills up the form using \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_fills_up_the_form_using_and_and_and(String LastName, String FirstName, String status, String roomtype) throws Throwable {
	    findreservation.enterLastName(LastName);
	    findreservation.enterFirstName(FirstName);
	    findreservation.statusField(status);
	    findreservation.RoomTypeField(roomtype);
	    
	}

	@Then("^User clicks on the search button to find reservation$")
	public void user_clicks_on_the_search_button_to_find_reservation()  {
		findreservation.clickOnSearchButton();
	    
	}

	@Then("^User should be able to see the list and validate$")
	public void user_should_be_able_to_see_the_list_and_validate() throws IOException  {
		findreservation.takeScreenShotAtEndOfTest(driver);
		
	    
	}


	
	@After
	public void AfterRun() {
		driver.close();
		driver.quit();
		
	}
	

	

}
