package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datapicker {

	public static void main(String[] args) {
	   
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.com");
		
		driver.findElement(By.id("onward_cal")).click();
		
         String month="June";
         String year="2024";
         String date="10";
         
         while(true) {
          String monthyear=driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]")).getText();
          
        String arr[] =   monthyear.split(" ");
        String mon=arr[0];
        String yea=arr[1];
        if(mon.equalsIgnoreCase(month) && yea.equals(year)) {
        	break;
        }else {
        	driver.findElement(By.xpath("//*[@id=\"next\"]/svg")).click();
        }
         }
         
         List<WebElement> alldates=driver.findElements(By.xpath(""));
	}

}
