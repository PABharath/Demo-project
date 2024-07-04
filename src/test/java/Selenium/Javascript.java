package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javascript {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.nopcommerce.com/");
		driver.manage().window().maximize();
		
System.out.println(	"Web application :" + driver.getTitle());
	
		WebElement border=driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[2]/a/img"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='2px solid red'", border);
	
	TakesScreenshot sc=(TakesScreenshot)driver;
	File src=sc.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshorts\\border.png");
	FileUtils.copyFile(src, trg);
	
	
	
	WebElement button=driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[3]/div/ul[2]/li/span"));
	JavascriptExecutor jb=(JavascriptExecutor)driver;
	jb.executeScript("arguments[0].click()", button);
	
//	driver.findElement(By.xpath("https://www.nopcommerce.com/"));
////	JavascriptExecutor jt=(JavascriptExecutor)driver;
////	String Bharath=jt.executeScript("arguments[0].document.Tittle" , Tittle).toString();
////	System.out.println( Bharath);
//	System.out.println(driver.getTitle());
		
	}

}
