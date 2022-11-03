package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot{
	
	
public static WebDriver Teju(String url) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejashri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	
	a.navigate().to(url);
	return a;
	
	
	
}
	

}
