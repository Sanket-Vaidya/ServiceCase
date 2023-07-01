package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement inputEmail;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement nextBtn;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement enterPassword; 
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement signIn;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement yesBtn;
	
	
	
	
	
	public void inputEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void clickNxtBtn() {
		nextBtn.click();
	}
	
	public void enterPassword(String pwd) {
		enterPassword.sendKeys(pwd);
	}
	
	public void signIn() {
		signIn.click();
	}
	
	public void clickYesBtn() {
		yesBtn.click();
	}
	

}
