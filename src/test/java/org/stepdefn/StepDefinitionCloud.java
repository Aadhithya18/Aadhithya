package org.stepdefn;

import org.base.LibGlobal;
import org.pojo.EletronicsPage;
import org.pojo.PlaceOrder;
import org.pojo.SelectAc;
import org.pojo.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionCloud extends LibGlobal {

	@Given("User should be in Login page of Flipkart and verified {string},{string}")
	public void userShouldBeInLoginPageOfFlipkartAndVerified(String string, String string2) {
		launchBrowser();
		maximize();
		navigateTo("https://www.flipkart.com/");
		implicitWait(20);
		loginPage l = new loginPage();
		l.loginToPage(string, string2);
	}

	@When("User should search Electronics and select TVs & Appliances")
	public void userShouldSearchElectronicsAndSelectTVsAppliances() throws InterruptedException {

		EletronicsPage ele = new EletronicsPage();
		ele.electronicsTvapp("electronics");
	}

	@When("User should select any AC  add the AC in the cart add two quatity and print the discount ,Total amount")
	public void userShouldSelectAnyACAddTheACInTheCartAddTwoQuatityAndPrintTheDiscountTotalAmount() {
		SelectAc se = new SelectAc();
		se.selectAcAs();
		
		

	}

	@When("User should place the order and user should navigate to My cart page")
	public void userShouldPlaceTheOrderAndUserShouldNavigateToMyCartPage() {
		PlaceOrder pl = new PlaceOrder();
		pl.placeOrderas();

	}

	@Then("User should remove the orders")
	public void userShouldRemoveTheOrders() {
		PlaceOrder p = new PlaceOrder();
		p.removeProduct();
		p.verifyremove();
		driver.quit();
	}
	@Given("User should be at Login the page of Flipkart")
	public void userShouldBeAtLoginThePageOfFlipkart() {
		launchBrowser();
		maximize();
		navigateTo("https://www.flipkart.com/");
		implicitWait(20);
	   
	}

	@When("User should login with {string} and {string}")
	public void userShouldLoginWithAnd(String string, String string2) {
	    loginPage l = new loginPage();
	    l.loginPages(string, string2);
	   
	}

	@Then("User should verify the {string} is logged in")
	public void userShouldVerifyTheIsLoggedIn(String id) {
		 loginPage l = new loginPage();
		l.verifyName(id);
	   driver.quit(); 
	   
	}

}
