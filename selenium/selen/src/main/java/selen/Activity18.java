package selen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.messages.types.Duration;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//WebDriverWait wait = new WebDriverWait (driver, null);
		
		driver.get("https://training-support.net/webelements/alerts");
		
	    System.out.println("Title -> " + driver.getTitle());
	    
	    WebElement Simple = driver.findElement(By.xpath("//div/div[2]/button[1]"));
	    
	    Simple.click();
	    
	    System.out.println("Simple Button Clicked!!");
	    
	    //wait.until(ExpectedConditions.alertIsPresent());
	    
	    Alert alert = driver.switchTo().alert();
	    
	    System.out.println("Switched to Alert Box");
	    
	    System.out.println("Alert Box Message -> " + alert.getText());
	    
	    driver.switchTo().alert();
	    
	    alert.accept();
	    
	    System.out.println("Alert Message Accepted");
	    
	    driver.quit();
	    
	}

}
