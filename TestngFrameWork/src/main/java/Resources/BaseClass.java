package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	public void InitilizeDriver() throws IOException {
		
		//to read the data
		//FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TestngFrameWork\\src\\main\\java\\Resources\\data.properties");
		
		//this will help to read data if we give it to another user or common path across all the system  / this is code system.getProperty("user.dir")
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\Resources\\\\data.properties");
		
		
		//Properties prop = new Properties();// this is locally declared so we have to declare it globally to launch url
	    prop = new Properties();
		prop.load(fs);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			 driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge")) {
			 driver = new EdgeDriver();
		}
		else {
			System.out.println("please choose proper driver");
		}
		
	}
	
	@BeforeMethod
	public void LaunchBrowserAndUrl() throws IOException {
		
        InitilizeDriver();
	//  driver.get("https://login.salesforce.com/"); this is also visible so we have to put this url in data properties file andd then we have to acces in base class
        driver.get(prop.getProperty("URL"));
		
	}
}
