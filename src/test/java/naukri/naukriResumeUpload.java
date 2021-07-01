package naukri;


import org.testng.annotations.Test;

import pages.homePage;
import pages.loginPage;
import pages.profilePage;
import setUP.browserSettings;

public class naukriResumeUpload extends browserSettings {
	
	@Test
	public void uploadResumeInNaukri() throws InterruptedException {
		loginPage lp= new loginPage(driver);
		homePage hp=new homePage(driver);
		profilePage pp=new profilePage(driver);
		
		driver.get("https://login.naukri.com/nLogin/Login.php");
		
		lp.setUsername();
		lp.setPasword();
		lp.clickLogin();
		
		System.out.println("----login sucessfull----");
		
		hp.openEditProfile();
		
		System.out.println("----User in Profile page----");
		pp.uploadResumeInProfilePage();

	}



}
