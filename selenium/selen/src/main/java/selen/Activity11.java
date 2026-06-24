package selen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
	    // Open the browser
	    driver.get("https://training-support.net/webelements/keyboard-events");
	    
	    //get title
	    System.out.println("Title -> " + driver.getTitle());
	    
	    Actions builder = new Actions(driver);
	    
	    builder.sendKeys("Sample String").build().perform();
	    	    
	    System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h1")).getText());

	    System.out.println("\n\n");
	  
	    driver.close();
	   
		}

}


