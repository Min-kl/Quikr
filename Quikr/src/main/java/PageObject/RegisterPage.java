package PageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegisterPage {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}

	public void homepage() {
		System.setProperty("webdriver.chrome.driver","./driver\\\\chromedriver.exe" );
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver = new ChromeDriver(options);
		driver.get("https://www.quikr.com/lucknow");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void login() {
		   driver.findElement(By.className("user-name")).click();
	}
	
	public void Regis() throws IOException,  InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"newLoginSignUpModal\"]/div/div/div/div/form/div[1]/div/input")).sendKeys("9532135950");
	      driver.findElement(By.xpath("//*[@id=\"newLoginSignUpModal\"]/div/div/div/div/form/div[2]/button")).click();
	      driver.findElement(By.xpath(" /html/body/div[3]/div[1]/div[1]/div/div/div/div/form/div[1]/div[2]/input")).sendKeys("Neha");
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div/div/div/form/div[1]/div[3]/input")).sendKeys("953213595nd@gmail.com");
	  driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div/div/div/form/div[1]/div[4]/input")).sendKeys("neha@1234567");
	  String s=   driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div/div/div/form/div[1]/div[4]/input")).getText();
	  if(s.length()<6 ||s.length()>16)
		  System.out.print("");
	  
	  driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div/div/div/form/div[2]/button")).click();
	     
	  
	}




}
