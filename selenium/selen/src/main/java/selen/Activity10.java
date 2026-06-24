package selen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
	    // Open the browser
	    driver.get("https://training-support.net/webelements/mouse-events");
	    
	    //get title
	    System.out.println("Title -> " + driver.getTitle());
	    
	    Actions builder = new Actions(driver);
	    
	    WebElement cargo_lock = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[1]"));
	    
	    builder.click(cargo_lock).build().perform();
	    
	    System.out.println("Element 1 clicked");
	    
	    //driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/p")).getText();
	    
	    //String res_text = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/p")).getText();
	    
	    System.out.println(driver.findElement(By.id("result")).getText());
	    
	    System.out.println("\n\n");
	    
	    WebElement cargo_toml = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[2]"));
	    
	    builder.moveToElement(cargo_toml).build().perform();
	    
	    System.out.println("Cursor moved to Cargo_toml");
	    
	    builder.click().build().perform();
	    
	    System.out.println(driver.findElement(By.id("result")).getText());
	    
	    System.out.println("\n\n");
	    
	    WebElement src = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[3]"));
	    
	    WebElement target = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[4]"));
	    
	    builder.doubleClick(src).build().perform();
	    
	    System.out.println(driver.findElement(By.id("result")).getText());

	    System.out.println("\n\n");

	    builder.contextClick(target).build().perform();
	    
	    builder.click(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[2]/div/ul/li[1]/button"))).pause(5000).build().perform();
	    
	    System.out.println(driver.findElement(By.id("result")).getText());

	    System.out.println("\n\n");
	  
	    driver.close();
	   
		}

}


