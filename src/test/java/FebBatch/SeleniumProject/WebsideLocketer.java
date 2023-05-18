package FebBatch.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsideLocketer {

	 
	public static void main(String[] args) {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.get("https://www.ayanaapartments.com/");
		
	    
	}

}
