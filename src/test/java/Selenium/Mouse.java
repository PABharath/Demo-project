package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		
		button.sendKeys("welcome");
		
		WebElement double1=driver.findElement(By.xpath("/html/body/form/input[3]"));
		
		Actions act=new Actions(driver);
		act.doubleClick(double1).perform();
		
//		WebElement button=driver.findElement(By.xpath("//*[@id=\"min-range\"]"));
//		System.out.println(button.getLocation());	
//		System.out.println(button.getSize());
//		Actions act=new Actions(driver);
//		act.dragAndDropBy(button, 200, 0).perform();
//		
//		WebElement button1=driver.findElement(By.xpath("//*[@id=\"max-range\"]"));
//
//		Actions act1=new Actions(driver);
//		act1.dragAndDropBy(button1, -100, 0).perform();
//		driver.get("file:///C:/Users/bhara/OneDrive/Desktop/JavaScript/var.html");
//		WebElement Tittle1=driver.findElement(By.xpath("//*[@id=\"title1\"]"));
//		WebElement box=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
//		
//		Actions act=new Actions(driver);
//		act.dragAndDrop(Tittle1, box).perform();
		
//		driver.get("https://demo.opencart.com/");
//		WebElement item1=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]"));
//		
//		WebElement item2=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(item1).moveToElement(item2).click().perform();
		
		
		
		
	}

}
