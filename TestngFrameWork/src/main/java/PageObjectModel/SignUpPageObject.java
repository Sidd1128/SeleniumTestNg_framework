package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver;// this driver dont have scope
	
	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath("//input[@name='UserLastName']");
	private By jobtitle = By.xpath("//input[@name='UserTitle']");
	private By nextbutton = By.xpath("//span[contains(text(),'Next')]");
	private By selectemployees = By.xpath("//select[@name='CompanyEmployees']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By selectCountry = By.xpath("//select[@name='CompanyCountry']");
	private By Nextbutton = By.xpath("//span[contains(text(),'Next')]");
	private By phone = By.xpath("//input[@name='UserPhone']");
	private By Email = By.xpath("//input[@name='UserEmail']");
	private By checkbox1 = By.xpath("(//div[@class='checkbox-ui'])[1]");
	private By checkbox2 = By.xpath("(//div[@class='checkbox-ui'])[2]");
	
	public SignUpPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement EnterFirstName() {
	       return driver.findElement(firstname);
	}
	
	public WebElement EnterLastName() {
	       return driver.findElement(lastname);
	}
	
	public WebElement EnterJobTitle() {
	       return driver.findElement(jobtitle);
	}
	
	public WebElement NxtButton() {
		return driver.findElement(nextbutton);
	}
	
	public WebElement Employees() {
		return driver.findElement(selectemployees);
	}
	
	public WebElement selectcompany() {
		return driver.findElement(company);
		
	}
	
	public WebElement Countries() {
		return driver.findElement(selectCountry);
	}
	
	public WebElement NxtButton1() {
		return driver.findElement(Nextbutton);
		
	}
	public WebElement phno() {
		return driver.findElement(phone);
	}
	public WebElement mailid() {
		return driver.findElement(Email);
	}
	public WebElement checkbox() {
		return driver.findElement(checkbox1);
	}
	public WebElement checkbox2() {
		return driver.findElement(checkbox2);
	}
	

}
