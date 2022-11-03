package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {
	
	
	public static WebDriver Teju(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejashri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		return driver;
		
		
		
		
	}

	}
