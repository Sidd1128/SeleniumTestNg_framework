package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.Constants;


public class SignupTestCases extends BaseClass{
	@Test
	public void verifySignUP() throws IOException, InterruptedException {
		/*InitilizeDriver();
		
	//	driver.get("https://login.salesforce.com/");*/ //isko hum base class me declare karenge and also same for login page
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.ClickTryforFree().click();
		
		SignUpPageObject spo = new SignUpPageObject(driver);
		
		Thread.sleep(3000);
		spo.EnterFirstName().sendKeys(Constants.FirstName);
		
		spo.EnterLastName().sendKeys(Constants.LastName);
		
		spo.EnterJobTitle().sendKeys(Constants.JobTitle);
		
		spo.NxtButton().click();
		
		WebElement a = spo.Employees();
		Select s = new Select(a);
		s.selectByIndex(1);
		
		spo.selectcompany().sendKeys("TCS");
		
		WebElement b = spo.Countries();
		Select s1 =new Select(b);
		s1.selectByVisibleText("Germany");
		
		spo.NxtButton1().click();
		
		Thread.sleep(3000);
		
		spo.phno().sendKeys("9876543210");
		
		spo.mailid().sendKeys("siddhantawathare08@gmail.com");
		
		spo.checkbox().click();
		
		spo.checkbox2().click();
	}
}
