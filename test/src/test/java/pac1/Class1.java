package pac1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class1 {
	WebDriver driver;
	@Test
	public void firsdrivt()
	{
System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

}
