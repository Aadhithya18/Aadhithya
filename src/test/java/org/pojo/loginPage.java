package org.pojo;

import org.base.LibGlobal;
import org.junit.Assert;
import org.junit.rules.Verifier;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;



public class loginPage extends LibGlobal {
	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[text()='Aadhithya']")
	private WebElement txtAadhi;

	public WebElement getTxtAadhi() {
		return txtAadhi;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void loginToPage(String string, String string2) {
		sendkeys(getTxtUsername(), string);
		sendkeys(getTxtPassword(), string2);
		click(getBtnLogin());
		String text = getTxtAadhi().getText();
		Assert.assertEquals(text, "Aadhithya");
		System.out.println("Logged sucessfully");
	}
	public void loginPages(String string, String string2) {
		sendkeys(getTxtUsername(), string);
		sendkeys(getTxtPassword(), string2);
		click(getBtnLogin());

	}
	
	public void verifyName(String verify) {
		String text = getTxtAadhi().getText();
		
	SoftAssert assertion = new SoftAssert();
	assertion.assertEquals(verify, text);
	System.out.println("Present user id name is not match with original account id name");
		

	}

}
