package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
	WebDriver driver = null;

	@Given("Open Browser and launch Application")
	public void open_Browser_and_launch_Application() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Akash\\eclipse-workspace\\Cucumber_Parameterization_POM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {

		// LoginPage.demo1();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("User should navigate successfully")
	public void user_should_navigate_successfully() {
		driver.close();
	}

}
