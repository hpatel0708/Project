package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		
		this.driver = driver; 
	}

	// Element Library

	// WebElement User_Id = driver.findElement(By.xpath("//input[@type='text']"));

	// WebElement Password =
	// driver.findElement(By.xpath("//input[@type='password']"));

	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	WebElement User_Id;

	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//a[@id='greenButton']")
	WebElement Sign_In_Button;
	

	// Interactive Method
	
	public void enterUserId(String userId) {
		
		User_Id.sendKeys(userId);
		
	}
	
	public void enterPassword(String password) {
		
		Password.sendKeys(password);
		
	}
	
	public void clickSignInButton() {
		
		Sign_In_Button.click();
		
	}
	
	public void login(String userId, String password) {
		
		User_Id.sendKeys(userId);
		Password.sendKeys(password);
		waitForElement(driver, 5,Sign_In_Button);
		Sign_In_Button.click();
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
		public void takeScreenShotAtEndOfTest(WebDriver driver) throws IOException {
			TakesScreenshot ts = ((TakesScreenshot) driver);
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File("user" + "/screenshots" + System.currentTimeMillis() + ".png"));
			
		}
		
	}
	


