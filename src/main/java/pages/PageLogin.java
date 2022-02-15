package pages;



import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {

	WebDriver driver;
	
	@FindBy(id="user-name")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;
	
	@FindBy(xpath="//h3[@data-test='error']")
	public WebElement error;
	
	public void openBrowser() {
		 String firefoxPath = null;
		Properties prop =new Properties();
		
			try {
				FileInputStream fis=new FileInputStream("C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\Selenium_Workspace\\TestNGMavenWorkingPOM\\src\\main\\java\\data\\config.properties");
				prop.load(fis);
				firefoxPath=prop.getProperty("path");	
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		System.setProperty("webdriver.gecko.driver",firefoxPath);
		 driver=new FirefoxDriver(); 
		 PageFactory.initElements(driver, this);
	}
	public void opnLoginPage() {
		
		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void invalidLogin(String un,String pwd) throws InterruptedException {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		Thread.sleep(3000);
	}
	public void closeBrowser() {
		//driver.quit();
	}
	public String readError() {
		String errors=error.getText();
		return errors;
		
		
	}
	
}
