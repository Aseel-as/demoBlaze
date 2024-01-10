package org.example;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class LogInTest extends BaseClass {
    @Test
    public void Login_Test () throws InterruptedException{
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        WebElement loginbox=driver.findElement(By.id("login2"));
        loginbox.click();
        Thread.sleep(2000);
        WebElement usrname=driver.findElement(By.id("loginusername"));
        usrname.sendKeys(username);
        Thread.sleep(1000);
        WebElement pssword=driver.findElement(By.id("loginpassword"));
        pssword.sendKeys(password);
        Thread.sleep(2000);
        WebElement loginbutn=driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        loginbutn.click();


}}
