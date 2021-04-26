package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindReservation extends BasePage {
	

	WebDriver driver;

	public FindReservation(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//a[@id='act2']")
	WebElement Find_Button_Locator;

	@FindBy(how = How.XPATH, using = "//a[@id='menu3_0']")
	WebElement Reservation_Button_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='searchLastName']")
	WebElement Last_Name_Field_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='searchFirstName']")
	WebElement First_Name_Field_Locator;
	

	@FindBy(how = How.XPATH, using = "//select[@name='searchStatus']")
	WebElement Status_Field_Locator;
	
	@FindBy(how = How.XPATH, using = "//select[@name='searchRoomType']")
	WebElement Room_Type_Locator;
	

	@FindBy(how = How.XPATH, using = "//a[@id='SubmitFindReservation']")
	WebElement Search_Button_Locator;

	// Interactive Methods

	public void clickOnFindButton() {

		Find_Button_Locator.click();
	}

	public void clickOnReservationButton() {

		waitForElement(driver, 5, Reservation_Button_Locator);

		Reservation_Button_Locator.click();

	}

	public void enterLastName(String LastName) {

		Last_Name_Field_Locator.sendKeys(LastName);

	}

	public void enterFirstName(String FirstName) {

		First_Name_Field_Locator.sendKeys(FirstName);

	}
	



	public void statusField(String status) {
		selectDropDown(Status_Field_Locator, status);

	}
	
	public void RoomTypeField(String roomtype) {
		waitForElement(driver, 5, Room_Type_Locator);
		selectDropDown(Room_Type_Locator, roomtype);
		
	}

	
	public void clickOnSearchButton() {
		
		Search_Button_Locator.click();
	}

}


