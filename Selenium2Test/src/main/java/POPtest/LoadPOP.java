package POPtest;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadPOP 
{	
	public WebDriver driver;
	public LoadPOP() 
	{
        // 如果你的 FireFox 没有安装在默认目录，那么必须在程序中设置
        System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        // 创建一个 FireFox 的浏览器实例
        driver = new FirefoxDriver();
 
        // 让浏览器访问 Baidu
        driver.get("http://poprogramming.com");
        // 用下面代码也可以实现
        // driver.navigate().to("http://www.baidu.com");
 
        // 获取 网页的 title
        System.out.println("Page title is: " + driver.getTitle());
 
        // 通过 id 找到 input 的 DOM
        WebElement element = driver.findElement(By.linkText("立即体验"));
 
        // 输入关键字
        element.click();;
 
         
        // 通过判断 title 内容等待搜索页面加载完毕，间隔10秒
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("pop");
            }
        });
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("pkusei");
        
        element = driver.findElement(By.name("password"));
        element.sendKeys("123");
        element.submit();
        
        /*
        element = driver.findElement(By.id("TANGRAM_3__verifyCode"));
        String verifyCode = new Scanner(System.in).nextLine();
        element.sendKeys(verifyCode);
        element.submit();*/
        
        // 显示搜索结果页面的 title
        System.out.println("Page title is: " + driver.getTitle());
        
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("pop - 控制台");
            }
        });
        
        System.out.println("Page title is: " + driver.getTitle());
	}
	public void quit()
	{
		driver.quit();
	}
}