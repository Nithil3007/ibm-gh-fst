package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		System.out.println("The title of the page is " + driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("password");
		
		// driver.findElement(By.linkText("Submit")).click();
		
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.findElement(By.className("svelte-1pdjkmx")).click();
		
		System.out.println("Submitted");
		
		driver.quit();
		
	}

}
