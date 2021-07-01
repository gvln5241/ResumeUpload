package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {

	WebDriver ldriver;
	//static PropertiesFile prop;

	@FindBy(xpath="//*[@class='rghtSec fr menu logged']/li[2]")
	@CacheLookup
	WebElement link_MyNaukri;

	@FindBy(xpath="//*[@class='subMenu c2']//*[text()='Edit Profile']")
	@CacheLookup
	WebElement link_EditProfile;

	public homePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void openEditProfile() throws InterruptedException {

		WebDriverWait wait20=new WebDriverWait(ldriver, 20);

		wait20.until(ExpectedConditions.visibilityOf(link_MyNaukri));
		Actions action= new Actions(ldriver);
		action.moveToElement(link_MyNaukri).perform();

		link_EditProfile.click();
	}


}
