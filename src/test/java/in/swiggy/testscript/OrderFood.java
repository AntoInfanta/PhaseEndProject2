package in.swiggy.testscript;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFood extends Driver{

	@Given("a user is on Swiggy landing page")
	public void a_user_is_on_swiggy_landing_page() {
		Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}
	@When("he enters Bagalore,Karnataka,India in search box")
	public void he_enters_bagalore_karnataka_india_in_search_box() {
		landingPage.enterLocation("Bangalore");
	}
	@When("he clicks on Go button")
	public void he_clicks_on_go_button() {
		landingPage.selectLocation();

	}
	@When("he clicks on the first restaurant on the page")
	public void he_clicks_on_the_first_restaurant_on_the_page() {
		allRestaurants.clickfirstRestaurant();
	}
	@When("he clicks Add on the first item of the restaurant page")
	public void he_clicks_add_on_the_first_item_of_the_restaurant_page() {
		restaruant.clickAdd();
	}
	@When("he clicks on Checkout button")
	public void he_clicks_on_checkout_button() {
		restaruant.clickCheckout();

	}
	@Then("he must be on the Checkout page")
	public void he_must_be_on_the_checkout_page() {
		Assert.assertEquals(checkout.getLable(), "SECURE CHECKOUT");
	}



}
