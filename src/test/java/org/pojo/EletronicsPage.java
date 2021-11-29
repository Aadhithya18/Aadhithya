package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EletronicsPage extends LibGlobal {
	public EletronicsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement searchBox;

	@FindBy(xpath = "//span[text()='TVs & Appliances']")
	private WebElement tvapplinces;

	@FindBy(xpath = "//a[text()='Inverter AC']")
	private WebElement inverterAc;

	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	private WebElement searchbtn;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getTvapplinces() {
		return tvapplinces;
	}

	public WebElement getInverterAc() {
		return inverterAc;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public void electronicsTvapp(String search) throws InterruptedException {
		sendkeys(getSearchBox(), search);
		click(getSearchbtn());
		Thread.sleep(3000);
		moveToElement(getTvapplinces());
		moveToElement(getInverterAc());
		click(getInverterAc());
		

	}

	

}
