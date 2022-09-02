package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Restaurant {
	WebDriverWait wait;
	
	@FindBy (xpath= "//div[text()='ADD']")
	private WebElement addFood;
	
	@FindBy (xpath="//span[text()='Add Item']")
	private WebElement addItems;
	
	@FindBy (xpath="//button[contains(text(),'Checkout')]")
	private WebElement checkout;
	
	@FindBy (xpath="//div[contains(text(),'busy')]")
	private WebElement errorMsg;

	public Restaurant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickAdd(){
		wait.until(ExpectedConditions.visibilityOf(addFood));
		addFood.click();		
	}
	public void clickAddItem(){
		wait.until(ExpectedConditions.visibilityOf(addItems));
		if (addItems.isDisplayed())
				addItems.click();	
	}
	
	public void clickCheckout(){

		wait.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
	}
	
	public String getErrorMsg() {
		String strErrorMsg = errorMsg.getText();
		return strErrorMsg;
		
	}
}
