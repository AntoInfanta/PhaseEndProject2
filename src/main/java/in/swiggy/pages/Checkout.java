package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {
	WebDriverWait wait;
	
	@FindBy(xpath = "//span[text()='Secure Checkout']")
	private WebElement lblSecureCheckout;
	
	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public String getLable() {
		wait.until(ExpectedConditions.visibilityOf(lblSecureCheckout));
		String strLable = lblSecureCheckout.getText();
		return strLable;
	}
	

}
