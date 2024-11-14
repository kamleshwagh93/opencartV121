package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtChangePassword;
	
	@FindBy(id="input-confirm")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	
	public void setChangePassword(String changepassword)
	{
		txtChangePassword.sendKeys(changepassword);
	}
	
	public void setConfirmPassword(String changepassword)
	{
		txtConfirmPassword.sendKeys(changepassword);
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	


	

}
