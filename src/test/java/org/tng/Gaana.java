package org.tng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngularOptions;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class Gaana extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		ngdriver= new NgWebDriver(js);
		launchUrl("https://upplftstaging.com/authentication/login/candidate");
		ngdriver.waitForAngularRequestsToFinish();
		WebElement email = driver.findElement(By.id("mat-input-0"));
		email.sendKeys("afir4u@gmail.com");
       WebElement pass = driver.findElement(By.id("mat-input-1"));
       pass.sendKeys("Rifaudeen@123");
       WebElement log = driver.findElement(By.xpath("//button[text()=' Log In ']"));
       log.click();
       Thread.sleep(2000);
   
        WebElement set= driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[4]"));
       set.click();
       Thread.sleep(10000);
       
       
      WebElement change = driver.findElement(ByAngularOptions.xpath("//div[@class='accordian-style mb-2']"));
       change.click();
       
       WebElement cur = driver.findElement(ByAngularOptions.xpath("//input[@formcontrolname='currentpassword']"));
       cur.sendKeys("Rifaudeen@123");
       
       Thread.sleep(1000);
       
       WebElement newpass = driver.findElement(ByAngularOptions.xpath("//input[@formcontrolname='password']"));
       newpass.sendKeys("Rifaudeen@1234");
       
       WebElement confirmPass = driver.findElement(ByAngularOptions.xpath("//input[@formcontrolname='confirmPassword']"));
        confirmPass.sendKeys("Rifaudeen@1234");	
         
        
        WebElement confrim = driver.findElement(ByAngularOptions.xpath("//button[@class='mat-focus-indicator search-btn mat-raised-button mat-button-base']"));
        confrim.click();
        
	
	}

}
