package selen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
	    // Open the browser
	    driver.get(" https://training-support.net/webelements/drag-drop");
	    
	    //get title
	    System.out.println("Title -> " + driver.getTitle());
	    
	    Actions builder = new Actions(driver);
	    
	    WebElement ball = driver.findElement(By.xpath("//div/div/div/img"));
	    
	    WebElement dropzone1 = driver.findElement(By.xpath("//div[2]/div[1]"));
	    
	    String dropzone1_title = driver.findElement(By.xpath("//div[2]/div[1]/span")).getText();
	    
	    WebElement dropzone2 = driver.findElement(By.xpath("//div[2]/div[2]"));
	    
	    String dropzone2_title = driver.findElement(By.xpath("//div[2]/div[2]/span")).getText();
	    
	    System.out.println("Before drag and drop -> "+ dropzone1_title);
	    
	    builder.dragAndDrop(ball, dropzone1).build().perform();
	    
	    dropzone1_title = driver.findElement(By.xpath("//div[2]/div[1]/span")).getText();
	    
	    System.out.println("After drag and drop -> "+ dropzone1_title);
	    	    
	    System.out.println("\n\n");
	    
	    System.out.println("Before drag and drop -> "+ dropzone2_title);
	    
	    builder.dragAndDrop(ball, dropzone2).build().perform();
	    
	    dropzone2_title = driver.findElement(By.xpath("//div[2]/div[2]/span")).getText();
	    
	    System.out.println("After drag and drop -> "+ dropzone2_title);
	    
	    System.out.println("\n\n");
	  
	    driver.close();
	   
		}

}


