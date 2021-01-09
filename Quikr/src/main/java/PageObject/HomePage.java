package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
	
	WebDriver driver;

	public void browser()
	{ 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }

	public void url()
	{
		driver.get("https://www.quikr.com/");
		
	}


}
