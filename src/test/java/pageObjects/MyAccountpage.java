package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountpage extends BasePage {

	public MyAccountpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement msgHeading;

	@FindBy(xpath = "//a[normalize-space()='Change your password']")
	WebElement linkchangepassword;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement message;

	public boolean isMyAccountPageExists() {
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return false;

		}
	}

	public void ChangePassword() {
		linkchangepassword.click();
	}

	public boolean isPasswordChanged() {
		try {
			String Successmessage = message.getText();
			if (Successmessage.equals("Success: Your password has been successfully updated.")) 
			{
				System.out.println(Successmessage);
				return true;
			}
		} catch (Exception e) {
			return false;

		}
		return false;
	}
}
