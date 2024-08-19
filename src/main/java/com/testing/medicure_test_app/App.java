package com.testing.medicure_test_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
	

    public static void main( String[] args ) throws InterruptedException
    {
//initialize the chrome driver
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	
	 	WebDriver driver = new ChromeDriver(options);
	 	
	 	//open the web application
        driver.get("http://54.242.160.54:8082/contact.html");
        
        
        String title = driver.getTitle();
        System.out.println(title);
        
        //1. Locate and Enter Name
        WebElement name = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        name.sendKeys("Narayanareddy");
        
        //String printName = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input")).getText();
        
        System.out.println(name);
        
        //2. Locate and Enter Contact
        WebElement number = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        number.sendKeys("2345678910");
        System.out.println(number);
        
        //3. Locate Email and Enter Email
        WebElement mail = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        mail.sendKeys("tnreddy@tn.com");
        System.out.println(mail);
        
        //4. Locate Message and Enter Message
        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        message.sendKeys("Hello, How are you ?");
        System.out.println(message);
        
        Thread.sleep(2000);
        
        //5. Locate Send Button and click to send the message.
        WebElement sendButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        sendButton.click();
        Thread.sleep(2000);
        
        String response = driver.findElement(By.id("message")).getText();
        System.out.println(response);
        
        
        driver.quit();

        
    }
}
