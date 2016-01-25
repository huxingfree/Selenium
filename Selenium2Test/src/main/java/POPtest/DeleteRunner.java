package POPtest;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteRunner 
{
	public static void delete(WebDriver driver)
	{
		for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
		
		driver.navigate().to("http://popcontroller.duapp.com/monitor");
		System.out.println("Page title is: " + driver.getTitle());
		
		WebElement element = null;
		
		//element = driver.findElement(By.className("btn btn-default release"));
		while(true)
		{
			try
			{
				List<WebElement> el = driver.findElements(By.xpath("//tr/td[6]/button"));
				for(WebElement e:el)
				{
					if(e.getText().equals("release"))
					{
						e.click();
					}
				}
			}catch(StaleElementReferenceException e)
			{
				continue;
			}
			break;
		}
		driver.navigate().back();
		
		for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
	}
}
