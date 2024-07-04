package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("C:\\Users\\bhara\\OneDrive\\Desktop\\JavaScript\\var.html");

//driver.findElement(By.xpath("/html/body/div/label[1]/input")).click();


List<WebElement> day=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value, 'day')]"));
System.out.println(day.size());

for(WebElement days:day) {
	String alldays=days.getAttribute("value");
	if(alldays.equals("monday") || alldays.equals("friday")) {
		days.click();
	}
}
	
	}

}
