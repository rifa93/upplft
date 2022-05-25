package org.tng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
public LoginPage() {
PageFactory.initElements(driver, this);
}

@FindBy(id="email")
private WebElement user;

@FindBy(id="pass")
private WebElement pword;

@FindBy(name="login")
private WebElement log;

public WebElement getUser() {
	return user;
}

public WebElement getPword() {
	return pword;
}

public WebElement getLog() {
	return log;
}



}
