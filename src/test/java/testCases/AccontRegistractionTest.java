package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class AccontRegistractionTest extends BaseClass{

	@Test(groups="Sanity")
	public void verify_account_registraction() {
		try {
			
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccout link...");
		hp.clickRegister();
		logger.info("clicked on Register link...");

		AccountRegistrationPage ac = new AccountRegistrationPage(driver);
		String password = randomAlphaNumeric();
		logger.info("providing customer details...");

		ac.setFirstName(randomString().toUpperCase());
		ac.setlastName(randomString().toUpperCase());
		ac.setMail(randomString()+"@gmail.com");
		ac.setTelephone(randomNumbers());
		ac.setPassword(password);
		ac.setConfirmPassword(password);
		ac.setPrivacyPolicy();
		ac.clickContinue();
		String confirmmsg = ac.getConfirmationMsg();
		
		Assert.assertEquals(confirmmsg, "Your Account Has Been Created!"); 
		}catch(Exception e)
		{
			logger.error("Test failed");
			logger.debug("Debug logs");
			Assert.fail();
		}
		
		logger.info("Finished Test cases......");
	}
	
}
