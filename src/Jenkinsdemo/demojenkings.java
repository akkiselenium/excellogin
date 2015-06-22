package Jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demojenkings {
	
	@Test
	public void  testjenkings() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/?ref=tn_tnmn");
		System.out.println("welcome");
driver.close();
		
	}

}
