package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchPage {
	WebDriver driver;
	
	public void lauch() {
		String my_title=driver.getTitle();
		System.out.println("Title is : "+my_title);
		
	}

	   
	public void allindia() 
	{   
		   
		 {
			 
		      WebElement element = driver.findElement(By.id("hSelectCity"));
		    
		  Actions builder = new Actions(driver);
		     
		 builder.moveToElement(element).perform();
		    }
		  
		 

		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		    
		  Actions builder = new Actions(driver);
		    
		  builder.moveToElement(element, 0, 0).perform();
		    }
		 
		
		 
		   {
		      WebElement element = driver.findElement(By.cssSelector(".icon-arrow:nth-child(3)"));
		    
		  Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		   
		 
		 
		    driver.findElement(By.cssSelector(".icon-arrow:nth-child(3)")).click();
		    
		
		  
		  {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		   
		   builder.moveToElement(element, 0, 0).perform();
		    }
		   
		
		    driver.findElement(By.linkText("Bangalore")).click();}

	public void allcategory() 
	{
		
		{
		      WebElement element = driver.findElement(By.id("searchedCat"));
		  
		    Actions builder = new Actions(driver);
		   
		   builder.moveToElement(element).perform();
		    }
		  
		  {
		      WebElement element = driver.findElement(By.tagName("body"));
		    
		  Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		  
		  {
		      WebElement element = driver.findElement(By.cssSelector("#searchedCat > .icon-arrow"));
		    
		  Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		   
		 driver.findElement(By.cssSelector("#searchedCat > .icon-arrow")).click();
		 
		   {
		      WebElement element = driver.findElement(By.tagName("body"));
		  
		    Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		  
		  driver.findElement(By.linkText("Cars & Bikes")).click();
		 
		  }
public void textbox() {
		 {
		      WebElement element = driver.findElement(By.id("searchedCat"));

		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		 
		   driver.findElement(By.id("query")).click();
		   
		 driver.findElement(By.id("query")).sendKeys("cars");
		 
		 
		  
	}

     public void click() {
		  driver.findElement(By.cssSelector(".icon-search")).click();
		  }
    public void blank() 
	{
		driver.findElement(By.id("query")).sendKeys("");	
		
	}


	public void allavailable() {
		// TODO Auto-generated method stub
		
	}


	public void warning() {
		// TODO Auto-generated method stub
		
	}
    


}
