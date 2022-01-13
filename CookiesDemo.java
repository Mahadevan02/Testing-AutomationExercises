package automation;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//PRE REQUISITES
//Dynamic Bynding - Binding reference of an Interface to its implementing class
//Set interface - Set of Unique Objects
//Generics - Java 1.5 - <>
//for each loop

public class CookiesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.payilagam.com");
		Set<Cookie> cookies=driver.manage().getCookies();
		
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie);
		}
		//to delete all the cookies
		driver.manage().deleteAllCookies();

	}

}
