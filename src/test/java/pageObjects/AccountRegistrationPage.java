package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_FirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_confirmPswd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement check_PrivacyPolicy;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_Continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String fistname)
	{
		txt_FirstName.sendKeys(fistname);
	}
	
	public void setlastName(String lastname)
	{
		txt_lastName.sendKeys(lastname);
	}
	
	public void setMail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		txt_telephone.sendKeys(telephone);
	}
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	
	public void setConfirmPassword(String password)
	{
		txt_confirmPswd.sendKeys(password);
	}
	
	public void setPrivacyPolicy()
	{
		check_PrivacyPolicy.click();
	}
	
	public void clickContinue()
	{
		btn_Continue.click();
		
		//btn_Continue.submit();
		
		
		//Actions act = new Actions(driver);
		//act.moveToElement(btn_Continue).click().perform();
		
	}
	
	
	public String getConfirmationMsg()
	{
		try {
			return (msgConfirmation.getText());
		}catch (Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
}
