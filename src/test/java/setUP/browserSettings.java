package setUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import naukri.PropertiesFile;

public class browserSettings {
	public static WebDriver driver;
	static String browser;
	
	@BeforeTest
	public void browserSetUP() {
		browser = PropertiesFile.getValue("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("--disable-gpu");
			options.addArguments("--start-maximized");
			//options.addArguments("--window-size=800,800");
			//options.addArguments("--headless");

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} 
		else if (browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		} 
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}

	@AfterTest
	public void browserClose() {
		//driver.quit();
	}
}
