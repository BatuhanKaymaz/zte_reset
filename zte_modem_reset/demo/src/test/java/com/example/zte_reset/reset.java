package com.example.zte_reset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reset {
    
  public static void main(String[] args) throws InterruptedException {

    //seleenium settings for program and enter url
    System.getProperty("webdriver.chrome.driver","/DRİVER/chromedriveer");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.get("http://192.168.1.1"); 

    //enter username,password and press buton
    WebElement username = driver.findElement(By.id("Frm_Username"));
    username.click();
    username.sendKeys("admin");
    Thread.sleep(1000);

    WebElement password = driver.findElement(By.id("Frm_Password"));
    password.click();
    password.sendKeys("superonline");
    Thread.sleep(1000);

    WebElement logIn = driver.findElement(By.id("LoginId"));
    logIn.click();
    Thread.sleep(1000);
    
    // get manage page and modem reset
    WebElement managePage = driver.findElement(By.xpath("//*[@id=\"mn_li\"]/ul/li[5]"));
    managePage.click();
    Thread.sleep(1000);
    
    WebElement systemManage = driver.findElement(By.id("mmManagDevice"));
    systemManage.click();
    Thread.sleep(1000);

    WebElement reset = driver.findElement(By.id("Btn_restart"));
    reset.click();
    
  }

}
