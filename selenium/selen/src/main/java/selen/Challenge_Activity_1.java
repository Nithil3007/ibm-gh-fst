package selen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge_Activity_1 {
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://google.com");

    // driver.get("https://nithil3007.github.io/portfolio/desktop.html");
    
    // Perform testing and assertions
    System.out.print(driver.getTitle() + "\n");
    
    WebElement heading = driver.findElement(By.className("gLFyf"));
    System.out.println("ID: " + heading.getDomAttribute("id"));
    
    System.out.println("Name: " + heading.getDomAttribute("name"));
    
    System.out.println("Maxlength: " + heading.getDomAttribute("maxlength"));

    //System.out.println("URL: " + driver.getCurrentUrl());
    //System.out.println("Title: " + driver.getTitle());
    
    //WebElement element = driver.findElement(By.id("certifications"));
    //System.out.println("Element: " + element.getText());

    
    
    // Close the browser
    // Feel free to comment out the line below
    // so it doesn't close too quickly
    driver.quit();
  }
}