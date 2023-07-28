package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.Constants;

public class LoginTestCases extends BaseClass {

	@Test
	public void verifyLogin() throws IOException {
		
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys(Constants.username);
		
		lpo.enterPassword().sendKeys(Constants.password);
		
		lpo.LoginButton().click();
	}

}
