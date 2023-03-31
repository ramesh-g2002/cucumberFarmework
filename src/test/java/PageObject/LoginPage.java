package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}
@FindBy(name = "email")
WebElement email;
@FindBy(id = "input-password")
WebElement pwd;
@FindBy(xpath = "//input[@value='Login']")
WebElement LoginBtn;
@FindBy(linkText = "Logout")
WebElement Logout;
public void enterEmail(String username)
{
	email.sendKeys(username);
}
public void enterPassword(String password)
{
	pwd.sendKeys(password);
}
public void clickOnLoginButton()
{
	LoginBtn.click();
}
public void clickOnLogoutButton()
{
	Logout.click();
}
}
