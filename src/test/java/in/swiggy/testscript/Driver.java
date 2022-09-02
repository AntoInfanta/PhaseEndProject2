package in.swiggy.testscript;
import org.openqa.selenium.chrome.ChromeDriver;
import in.swiggy.pages.LandingPage;
import in.swiggy.pages.Restaurant;
import in.swiggy.pages.AllRestaurants;
import in.swiggy.pages.Checkout;

public class Driver extends Tools {
	protected static LandingPage landingPage;
	protected static AllRestaurants allRestaurants;
	protected static Restaurant restaruant;
	protected static Checkout checkout;

	public static void init(){
		System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
		driver = new ChromeDriver();
		landingPage = new LandingPage(driver);		
		allRestaurants = new AllRestaurants(driver);
		restaruant = new Restaurant(driver);
		checkout = new Checkout(driver);
	}
	

}
