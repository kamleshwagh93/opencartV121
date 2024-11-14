package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;

public class LoginTest extends BaseClass {

	@Test(groups="Regression")
	public void verifylogin() {
		logger.info("******* Starting Test case 2 **********");
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

		} catch (Exception e) {
			Assert.fail();
		}
		
		logger.info("********** Test case 2 Completed ***********");
	}
}
