package automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriver -Browser, which is an Interface
		 * ChromeDriver, GeckoDriver, IEDriver
		 * JDK - Collections - Set, List,
		 * JDK - Selenium JAR files
		 * Selenium WebDriver - Implementing Classes
		 * Key -unique, Value -duplicate
		 */
		System.setProperty("webdriver.gecko.driver","L:\\PrgrmngLang\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//Dynamic Binding
		WebDriver driver=new FirefoxDriver();
		//Method - Abstract, Static, return data type, arguments, Class, Usage
		
		driver.get("https://www.payilagam.com"); // URL type, enter
		String url = driver.getCurrentUrl();
		String pageSource = driver.getPageSource(); // Locators - ID,Name,tagname
		String pageTitle = driver.getTitle(); // Title of web page
		String windowHandle = driver.getWindowHandle(); // current window ID, Each page has unique Alphanumeric ID 
		Set window = driver.getWindowHandles(); //for multiple windows
		
		System.out.println("URL is"+url);
		System.out.println("PageSource is"+pageSource);
		System.out.println("PageTitle is"+pageTitle);
		System.out.println("WindowHandle is"+windowHandle);
		System.out.println("Window is"+window);
		driver.close();
		//driver.quit();
		

	}

}
