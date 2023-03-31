package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class StepDef {
	public WebDriver driver;
	public LoginPage login;
	@Given("I am on the OpenCart  login page")
	public void i_am_on_the_open_cart_login_page( String url) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		login=new LoginPage(driver);
		driver.get(url);
	}

	@Given("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password(String username,String password) {
		login.enterEmail(username);
		login.enterPassword(password);
		String title = driver.getTitle();
		System.out.println(title);
	   
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    login.clickOnLoginButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	    login.clickOnLogoutButton();
	}

}
