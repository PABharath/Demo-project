package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/bhara/OneDrive/Desktop/JavaScript/var.html");
		
		driver.findElement(By.id("openModalBtn")).click();

		
	WebElement js=	driver.findElement(By.xpath("//*[@id=\"file-input\"]"));
	
	JavascriptExecutor bs=(JavascriptExecutor)driver;
	bs.executeScript("arguments[0].click()", js);
	
	
	
	Robot rb=new Robot();
	rb.delay(2000);
	
	StringSelection ss=new StringSelection("file:///C:/Users/bhara/OneDrive/Desktop/Resume%20B1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
