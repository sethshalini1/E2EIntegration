package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Tc_001 {
	@Test
	public void testcase1() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElementById("email").sendKeys("hello");
	driver.findElementById("pass").sendKeys("hello");
	driver.quit();
	
	
}

}