package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class ContactUsTest extends BaseClass {
    @Test
    public void contactus() throws InterruptedException {
        WebElement contactusbtn = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
        contactusbtn.click();
        Thread.sleep(1000);
        WebElement emailfield = driver.findElement(By.id("recipient-email"));
        WebElement namefield = driver.findElement(By.id("recipient-name"));
        WebElement messagefield = driver.findElement(By.id("message-text"));
        WebElement sendmessagebtn = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"));
        emailfield.sendKeys(email);
        Thread.sleep(2000);
        namefield.sendKeys(name);
        Thread.sleep(2000);
        messagefield.sendKeys(message);
        Thread.sleep(1000);
        sendmessagebtn.click();

    }
}
