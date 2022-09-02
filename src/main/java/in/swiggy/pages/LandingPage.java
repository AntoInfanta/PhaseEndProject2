package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	WebDriverWait wait;

	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(xpath="//span[text()='Bangalore, Karnataka, India']")
	private WebElement bangaloreLocation;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void enterLocation(String strlocation) {
		wait.until(ExpectedConditions.visibilityOf(location));
		location.sendKeys(strlocation);				
	}

	public void selectLocation() {
		wait.until(ExpectedConditions.visibilityOf(bangaloreLocation));
		bangaloreLocation.click();
	}
}
