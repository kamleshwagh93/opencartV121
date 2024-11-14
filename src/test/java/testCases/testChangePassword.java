package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import pageObjects.ChangePasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;

public class testChangePassword extends BaseClass {

@Test
public void verifyChangePassword() {
		logger.info("********** Test case 3 started ***********");
		try {
			HomePage hp = new HomePage(driver);

			hp.clickMyAccount();
			hp.clicklogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("EmailId"));
			lp.setPassword(p.getProperty("Password"));
			lp.clickLoginbutton();

			MyAccountpage mac = new MyAccountpage(driver);
			boolean targetpage = mac.isMyAccountPageExists();
			Assert.assertTrue(targetpage);

			mac.ChangePassword();

			ChangePasswordPage pg = new ChangePasswordPage(driver);
			pg.setChangePassword("changePassword");
			pg.setConfirmPassword("changePassword");
			pg.clickContinue();

			boolean tarmessage = mac.isPasswordChanged();
			Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("********** Test case 3 Completed ***********");
	}
}