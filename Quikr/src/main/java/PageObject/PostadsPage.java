package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostadsPage {
	
	WebDriver driver;
	
	private By post_free_ad_click= By.xpath("//a[@id='postAdBtn']");
	private By  select_category= By.xpath("//div[text()='Cars & Bikes']");
	private By select_subcategory=By.xpath("/html/body/div[2]/div[8]/div[5]/div[2]/div/ul/li[1]/a");
    private By brand_name=By.xpath("html/body/section[4]/div/div[1]/form/div[1]/div[1]/div/input[1]");
	private By model_name= By.xpath("//input[@name='Model']");
	private By year= By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[2]");
	private By kms_driven= By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[3]");
	private By city= By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[4]");
	private By price=By.xpath("//*[@id=\"papForm\"]/div[2]/div[1]/div/input");
	private By name= By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/input[1]");
	private By mobile_number=By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/div[3]/input");
	private By email= By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/input[2]");
	private By post_ad_submit= By.xpath("//a[@class='submitBtn btn btn-style-normal posted']");
	
	public void post_free_ad_click() throws InterruptedException
	 {
		 driver.findElement(post_free_ad_click).click();
		 Thread.sleep(1000);
	 }
	 public void select_category() throws InterruptedException
	 {
		  driver.findElement(select_category).click();
		  Thread.sleep(2000);
	 }
	 public void select_subcategory() throws InterruptedException
	 {
		WebElement subcat= driver.findElement(select_subcategory);
		subcat.click();
		Thread.sleep(2000);
	 }
	
public void brand() throws InterruptedException
	 {
           
	 }
	 public void model() throws InterruptedException
	 {
		 Select model= new Select (driver.findElement(model_name));
		 model.selectByValue("Jupiter");
		 Thread.sleep(2000);
	 }
	 public void yearofRegistration()
	 {
		 Select yearofRegister= new Select(driver.findElement(year));
		 yearofRegister.selectByValue("2019");
	 }
	 public void valid_KMS_driven()
	 {
		 driver.findElement(kms_driven).sendKeys("1200");
	 }
	 public void valid_city()
	 {
		Select citypreference= new Select(driver.findElement(city));
		citypreference.selectByValue("Indore");
	 }
	 public void price()
	 {
		 driver.findElement(price).sendKeys("40000");
	 }
	 public void name()
	 {
		 driver.findElement(name).sendKeys("ABSC");
	 }
	 public void valid_mob_number() {
		 driver.findElement(mobile_number).sendKeys("7415404487");
	 }
	 public void valid_email()
	 {
		 driver.findElement(email).sendKeys("sh@gmail.com"); 
	 }
	 public void Type_of_ad()
	 {

	 }
	 public void post_ad_submit()
	 {
		 driver.findElement(post_ad_submit).click();
	 }

	 public String doesnot_enter_KMS()
     {
   	  WebElement kms=driver.findElement(kms_driven);
   	  kms.sendKeys("");
   	  String warning = kms.getText();
   	  return warning;
   	 }
     
     public void doesnot_enter_price()
     {
   	  System.out.println("user entered nothing in price field");
   	  
     }
    public void doesnot_enter_name()
    {
   	  System.out.println("user entered nothing in Name field"); 
    }
   public String doesnot_enter_mobile()
   {
   	WebElement mobile=driver.findElement(mobile_number);
 	  mobile.sendKeys("");
 	String warning = mobile.getText();
 	  return warning;
   }
   public String doesnot_enter_email()
   {
   	WebElement email_id=driver.findElement(email);
 	  email_id.sendKeys("");
 	String warning =email_id.getText();
 	  return warning;
   }
public String invalid_kms()
   {
   	WebElement kms=driver.findElement(kms_driven);
 	  kms.sendKeys(".0998");
 	String warning = kms.getText();
 	  return warning;
   }
   public String invalid_mobile()
   {
   	WebElement mobile=driver.findElement(mobile_number);
 	 mobile.sendKeys("0088832");
 	String warning = mobile.getText();
 	  return warning;
   }
   public String invalid_email()
   {
   	WebElement email_id=driver.findElement(email);
 	  email_id.sendKeys("fdsh@");
 	String warning = email_id.getText();
 	  return warning;
   }
  



	


}
