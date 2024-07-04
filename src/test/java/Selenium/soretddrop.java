package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class soretddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.twoplugs.com/");
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[2]/a")).click();
       
      WebElement all= driver.findElement(By.name("category_id"));
      Select options=new Select(all);
      List<WebElement> opt=options.getOptions();
      
      ArrayList org=new ArrayList();
      ArrayList temp=new ArrayList();
      
      for(WebElement alloptions:opt) {
    	  
       org.add(alloptions.getText());
       temp.add(alloptions.getText());
    	  
      	
      }
      System.out.println("Before orginal" + org);
      System.out.println("Before temp" + temp);
      Collections.sort(temp);
      
      System.out.println("Before orginal" + org);
      System.out.println("After temp" + temp);
	}
    
}
