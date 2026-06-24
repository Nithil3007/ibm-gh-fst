package selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		
	    System.out.println("Title -> " + driver.getTitle());
	    
	    Integer i;

	    WebElement dropdown = driver.findElement(By.xpath("//select"));

	  //Initialize Select object
	    Select list = new Select(dropdown);
	    
	    List<WebElement> allOptions = list.getOptions();
	    	    
	    list.selectByIndex(3);
	    
	    System.out.println(list.getFirstSelectedOption().getText());

	    
	    list.selectByValue("four");
	    
	    System.out.println(list.getFirstSelectedOption().getText());

	    list.selectByVisibleText("Two");
	    
	    System.out.println(list.getFirstSelectedOption().getText());

	    System.out.println("Options in the dropdown: ");
        for(i = 0; i < allOptions.size(); i++) {
            System.out.println(allOptions.get(i).getText());
        };
	    
	    
	    driver.quit();


	}

}
