package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStore{
	
	public static WebDriver Open() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejashri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return null;
		
		
		
	}

}
