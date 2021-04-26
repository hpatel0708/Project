package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void selectDropDown(WebElement element, String visibleString) {

		Select sel = new Select(element);

		sel.selectByVisibleText(visibleString);

	}
	public void takeScreenShotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("user" + "/screenshots" + System.currentTimeMillis() + ".png"));
		
	}

}
