package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import naukri.PropertiesFile;

public class loginPage {

	WebDriver ldriver;
	//static PropertiesFile prop;
	
	@FindBy(xpath="//*[@id=\"usernameField\"]")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(xpath="//*[@id=\"passwordField\"]")
	@CacheLookup
	WebElement txt_pwd;
	
	@FindBy(xpath="//*[@data-ga-track=\"spa-event|login|login|Save\"]")
	@CacheLookup
	WebElement btn_login;
	
	public loginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void setUsername() {
		txt_username.sendKeys(PropertiesFile.getValue("Naukri_Username"));
	}
	public void setPasword() {
		txt_pwd.sendKeys(PropertiesFile.getValue("Naukri_Password"));
	}
	public void clickLogin() {
		btn_login.click();
	}


}
