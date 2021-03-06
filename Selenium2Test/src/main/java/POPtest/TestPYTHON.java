package POPtest;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPYTHON 
{	
	public static void test(WebDriver driver) 
	{
		for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
		
		WebElement element = driver.findElement(By.cssSelector("a[data-appname=\"pythontest\"]"));
        element.click();
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        System.out.println("Page title is: " + driver.getTitle());
        element = driver.findElement(By.id("_easyui_tree_1"));
        element.click();   
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        element = driver.findElement(By.id("RunButton"));
        element.click();
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        element = driver.findElement(By.partialLinkText("http://"));
        element.click();
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        System.out.println("Page title is: " + driver.getTitle());
        
        element = driver.findElement(By.cssSelector("html"));
        System.out.println("java result:" + element.getText());
        
        driver.close();
    }
}