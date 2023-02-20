package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class BuyPage {
	//Declaring variables globally
	public static WebDriver driver;
	//Locators
	static By checkout = By.xpath("/html/body/div[3]/aside[4]/div[2]/footer/button[2]/span");
	static By opencart = By.xpath("/html/body/div[2]/footer/div[2]/div/div[1]/div/div[2]/div/ul/li[3]/a");
	static By order = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div[2]/div[1]/ul/li/button/span");
	static By shipping = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input");
	static By next = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
	static By cod = By.id("cashondelivery");
	static By buynow = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[3]/div[2]/div[4]/div/button/span");
	//Applying constructor
	public BuyPage(WebDriver driver) {
	}
	//Methods
	public static void clickcart() {
		driver.findElement(opencart).click();
	}
	public static void clickbuy() {
		driver.findElement(order).click();
	}
	public static void clickshipping() {
		driver.findElement(shipping).click();
	}
	public static void clicknext() {
		driver.findElement(next).click();
	}
	public static void clickcod() {
		driver.findElement(cod).click();
	}
	public static void clickbuynow() {
		driver.findElement(buynow).click();
	}
	public static void clickcheck() {
		driver.findElement(checkout).click();
	}
}