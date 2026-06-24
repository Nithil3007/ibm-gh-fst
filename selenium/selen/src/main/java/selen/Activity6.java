package selen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title = " + driver.getTitle());
		boolean check_box_selected = driver.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).isSelected();
		driver.findElement(By.xpath("//button[text() = 'Toggle Checkbox']"));
		}

}
