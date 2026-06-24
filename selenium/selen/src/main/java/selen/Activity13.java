package selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver = new FirefoxDriver();
		
	    // Open the browser
	    driver.get("https://training-support.net/webelements/tables");
	    
	    List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr"));
	    
	    List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
	    
	    System.out.println("Size of table -> "+ elements.size() + "," + cols.size());
	    	    
	    System.out.println("Third Row -> " + driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
	    
	    System.out.println("Second Row Second column -> " + driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
	    
	    driver.quit();
	}

}
