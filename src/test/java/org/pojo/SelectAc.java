package org.pojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.base.LibGlobal;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAc extends LibGlobal {

	public SelectAc() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='_4rR01T' and contains(text(),'Whirlpool 1.5 Ton')]")
	private WebElement selectInverterAc;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement btnAddToCart;

	@FindBy(xpath = "//button[text()='+']")
	private WebElement btnPlusIcon;

	@FindBy(xpath = "//div[@class='_1YVZr_']")
	private WebElement btnDiscount;

	@FindBy(xpath = " //div[@class='_I_XQO']//div//span[text()=' ₹69,980']")
	private WebElement btnTotalAmount;

	public WebElement getSelectInverterAc() {
		return selectInverterAc;
	}

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getBtnPlusIcon() {
		return btnPlusIcon;
	}

	public WebElement getBtnDiscount() {
		return btnDiscount;
	}

	public WebElement getBtnTotalAmount() {
		return btnTotalAmount;
	}

	public void selectAcAs() {
		click(getSelectInverterAc());
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		List<String> li = new ArrayList<String>();
		li.addAll(windows);
		for (int i = 0; i < li.size(); i++) {
			String string = li.get(1);
			driver.switchTo().window(string);
		}
		
		click(getBtnAddToCart());
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", getBtnPlusIcon());
		click(getBtnPlusIcon());
		String discount = getBtnDiscount().getText();
		System.out.println("discount for the Ac is :" + discount);
		String totalamount1 = getBtnTotalAmount().getText();
		System.out.println("Total amount in Add to cart page" + totalamount1);

	}

	
}
