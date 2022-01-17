package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver driver = null;

	By txt_Username = By.id("txtUsername");

	By txt_password = By.id("txtPassword");

	By btn_Login = By.id("btnLogin");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void EnterTextInUser(String text) {

		driver.findElement(txt_Username).sendKeys(text);

	}

	public void EnterTextInPass(String text1) {

		driver.findElement(txt_password).sendKeys(text1);
	}

	public void ClickOnLogin() {
		driver.findElement(btn_Login).sendKeys(Keys.RETURN);

	}

	

}
