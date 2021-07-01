package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class profilePage {

	WebDriver ldriver;
	//static PropertiesFile prop;

	@FindBy(xpath="//*[@id='attachCV']")
	@CacheLookup
	WebElement btn_UploadResume;

		public profilePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void uploadResumeInProfilePage() throws InterruptedException {

		WebDriverWait wait20=new WebDriverWait(ldriver, 20);
		wait20.until(ExpectedConditions.visibilityOf(btn_UploadResume));
		
		btn_UploadResume.click();
	}


}
