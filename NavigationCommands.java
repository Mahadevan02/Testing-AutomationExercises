package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","L:\\PrgrmngLang\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); //Dynamic Binding
		driver.get("https://www.payilagam.com");
		System.out.println(driver.getTitle());  //Payilagam - Best
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());  //SE
		
		driver.navigate().back();
		System.out.println("After Back "+ driver.getTitle());
		driver.navigate().forward();
		System.out.println("After Forward "+ driver.getTitle());
		driver.navigate().to("https://en.wikipedia.org");
		
		driver.navigate().refresh();
		System.out.println("After Refresh "+ driver.getTitle());

	}

}
