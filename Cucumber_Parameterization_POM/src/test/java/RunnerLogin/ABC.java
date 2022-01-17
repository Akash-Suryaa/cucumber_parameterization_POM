package RunnerLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABC {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Akash\\eclipse-workspace\\Cucumber_Parameterization_POM\\Driver\\chromedriver.exe"
		 * );
		 */
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//*[text()='Login']")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("((//form)[2]/div/input)[1]")).sendKeys("amol");
		driver.findElement(By.xpath("((//form)[2]/div/input)[2]")).sendKeys("abcd");

	}
}
