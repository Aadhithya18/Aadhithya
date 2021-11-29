package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void loadUrl(String data) {
		driver.get(data);

	}

	public void sendkeys(WebElement ele, String data) {
		ele.sendKeys(data);

	}

	public void click(WebElement ele) {
		ele.click();

	}

	public void moveToElement(WebElement e) {
		Actions action = new Actions(driver);
		action.moveToElement(e).perform();

	}

	public void navigateBack() {
		driver.navigate().back();

	}

	public void navigateTo(String data) {
		driver.navigate().to(data);

	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public void implicitWait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);

	}

	public void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);

	}
	
}
