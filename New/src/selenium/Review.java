package selenium;

//import methodChaining.WebDriver;

import org.openqa.selenium.WebDriver;

public class Review {
	
	public static void main(String[] args) {
		
		WebDriver driver = SeleniumStore.Open();
		driver.get("");
	}

}
