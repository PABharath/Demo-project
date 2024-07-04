package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Day1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		WebElement country = driver.findElement(By.name("Country"));
		selectdropdown(country , "India");
		WebElement employe = driver.findElement(By.name("NoOfEmployees"));
		selectdropdown(employe , "16 - 20");
				
				
	}
	
	public static void selectdropdown(WebElement ele, String value) {
		
		Select drp=new Select(ele);
		List<WebElement> all=drp.getOptions();
		for(WebElement options:all) {
			if(options.getText().equals(value)) {
				options.click();
				break;
			}
			
		}
		
	}

}
