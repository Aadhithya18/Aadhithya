package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder extends LibGlobal {
	public PlaceOrder() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement placeOrder;

	@FindBy(xpath = "//div[.='Total Payable']//parent::div[@class='_24KATy']//following-sibling::span//div[@class='_2Tpdn3']")
	private WebElement totalPrice;

	@FindBy(xpath = "//div[text()='Remove']")
	private WebElement btnRemove;

	@FindBy(xpath = "//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	private WebElement confirmRemove;

	@FindBy(xpath = "//div[text()='Your cart is empty!']")
	private WebElement confirmText;

	public WebElement getConfirmText() {
		return confirmText;
	}

	public WebElement getConfirmRemove() {
		return confirmRemove;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getBtnRemove() {
		return btnRemove;
	}

	public void placeOrderas() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		boolean enabled = getPlaceOrder().isEnabled();
		System.out.println(enabled);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getPlaceOrder());
		String totalpriceatorder = getTotalPrice().getText();
		System.out.println("Total price at order page" + totalpriceatorder);

	}

	public void removeProduct() {
		navigateBack();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", getBtnRemove());
		click(getBtnRemove());
		click(getConfirmRemove());
	}

	public void verifyremove() {
		String confirmText = getConfirmText().getText();
		System.out.println("Verify the order is removed : " + confirmText);

	}

}
