package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver = new FirefoxDriver();
		
	    // Open the browser
	    driver.get("https://training-support.net/webelements/dynamic-attributes");
	    
	    System.out.println("Title -> " + driver.getTitle());
	    
	    WebElement fullName = driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]"));
	    
	    WebElement emailAdd = driver.findElement(By.xpath("//input[contains(@id, '-email')]"));
	    
	    WebElement whenIsYourEvent = driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
	    
	    WebElement addDetails = driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]"));
	    
	    fullName.sendKeys("Nithil");
	    
	    emailAdd.sendKeys("123@gmail.com");
	    
	    whenIsYourEvent.sendKeys("2025-06-26");
	    
	    addDetails.sendKeys("Mango Juice");
	    
	    driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/div[3]/form/button")).click();
	    
	    System.out.println("Final Message -> " + driver.findElement(By.id("action-confirmation")).getText());
	    
	    driver.quit();
	}

}
