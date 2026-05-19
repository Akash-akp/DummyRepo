package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
//    public static String getName(){
//        return new String("Hello World");
//    }

    public static void main( String[] args ) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/apple/Downloads/Your%20Store.html");
        driver.manage().window().maximize();
        //driver.findElement(By.name("search")).sendKeys("Mac");
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("Mac");
       //linktext and partialLinkText
        //driver.findElement(By.linkText("Tablets")).click();

//        String name = getName();

        //name
        boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoDisplayStatus);
        driver.quit();
    }
}
