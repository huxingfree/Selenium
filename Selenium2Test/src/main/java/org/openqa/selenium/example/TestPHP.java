package org.openqa.selenium.example;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPHP 
{	
	public static void main(String[] args) {
        // 如果你的 FireFox 没有安装在默认目录，那么必须在程序中设置
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        // 创建一个 FireFox 的浏览器实例
        WebDriver driver = new FirefoxDriver();
 
        // 让浏览器访问 Baidu
        driver.get("http://poprogramming.com");
        // 用下面代码也可以实现
        // driver.navigate().to("http://www.baidu.com");
 
        // 获取 网页的 title
        System.out.println("1 Page title is: " + driver.getTitle());
 
        // 通过 id 找到 input 的 DOM
        WebElement element = driver.findElement(By.linkText("立即体验"));
 
        // 输入关键字
        element.click();;
 
         
        // 通过判断 title 内容等待搜索页面加载完毕，间隔10秒
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("与百度连接");
            }
        });
        
        element = driver.findElement(By.id("TANGRAM_3__userName"));
        element.sendKeys("masspoptest");
        
        element = driver.findElement(By.id("TANGRAM_3__password"));
        element.sendKeys("seforge520");
        element.submit();
        
        element = driver.findElement(By.id("TANGRAM_3__verifyCode"));
        String verifyCode = new Scanner(System.in).nextLine();
        element.sendKeys(verifyCode);
        element.submit();
        // 显示搜索结果页面的 title
        System.out.println("2 Page title is: " + driver.getTitle());
        
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("用户中心");
            }
        });
        
        System.out.println("3 Page title is: " + driver.getTitle());
        
        element = driver.findElement(By.cssSelector("img[alt=\"php\"]"));
        element.click();
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        System.out.println("4 Page title is: " + driver.getTitle());
        
        element = driver.findElement(By.id("button-1005-btnEl"));
        element.click();
        
        element = driver.findElement(By.cssSelector("img.x-tree-elbow-end-plus.x-tree-expander"));
        element.click();
        
        List<WebElement> elementlist = driver.findElements(By.className("x-grid-cell-inner "));
        for(WebElement e:elementlist)
        {
        	System.out.println(e.getText());
        }
        element = elementlist.get(2);
        element.click();
        element.isSelected();
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        element = driver.findElement(By.id("button-1020-btnEl"));
        element.click();
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        element = driver.findElement(By.linkText("已生成网址：点击查看"));
        element.click();
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        System.out.println("5 Page title is: " + driver.getTitle());
        element = driver.findElement(By.cssSelector("html"));
        System.out.println(element.getText());
        driver.quit();
    }
}
