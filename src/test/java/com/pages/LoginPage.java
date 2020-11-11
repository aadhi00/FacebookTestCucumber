package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private List<WebElement> lstUsername;
	@FindBy(id = "pass")
	private List<WebElement> lstPassword;
	@FindBy(id = "loginbutton")
	private List<WebElement> lstBtnLogin;

	public List<WebElement> getLstUsername() {
		return lstUsername;
	}

	public List<WebElement> getLstPassword() {
		return lstPassword;
	}

	public List<WebElement> getLstBtnLogin() {
		return lstBtnLogin;
	}
}
