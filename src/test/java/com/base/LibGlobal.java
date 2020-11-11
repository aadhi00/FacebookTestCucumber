package com.base;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibGlobal {
	public static WebDriver driver;
	public void getDriver() {
		System.setProperty("webdriver.chromedriver", System.getProperty("user.dir")+"/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launch(String url) {
		driver.get(url);
	}
	public void fill(WebElement e, String s) {
		e.clear();
		e.sendKeys(s);
	}
	public void click(WebElement e) {
		e.click();
	}
	public void dropDown(WebElement e, String s) {
		Select o=new Select(e);
		o.selectByVisibleText(s);
	}
	public String getCurl() {
		String cUrl = driver.getCurrentUrl();
		return cUrl;
	}
	public void verifyUrl(String eUrl) {
		Assert.assertEquals("Wrong URL",eUrl,driver.getCurrentUrl());
	}
	public void verifyValue(List<WebElement> e, String value) {
		Assert.assertEquals("Wrong Value",value,e.get(0).getAttribute("value"));
	}
	public void waitFor(String id, int seconds) {
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
}