package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo_Steps {
	WebDriver driver = null;
	@Given("Open browser and launch the application")
	public void open_browser_and_launch_the_application() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\Cucumber_Parameterization_POM\\Driver");
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("^User enters valid (.*) and  (.*)$")  // for that Please read cucumber expressions
	public void user_enters_valid_username_and_password(String username,String password) throws Exception {
		
		LoginPage login = new LoginPage(driver);
		login.EnterTextInUser("Admin");
		login.EnterTextInPass("admin123");
		login.ClickOnLogin();
		
//		driver.findElement(By.id("txtUsername")).sendKeys("username");
//		driver.findElement(By.id("txtPassword")).sendKeys("password");
//		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
	}

	@Then("User should be able to navigate successfully")
	public void user_should_be_able_to_navigate_successfully() {
	    
		driver.close();
		System.out.println("The test completed successfully");
	}

	
	

}
