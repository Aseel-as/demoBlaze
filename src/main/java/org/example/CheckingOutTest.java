package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckingOutTest extends BaseClass {
    @Test
    public void checkingout() throws InterruptedException {
        Thread.sleep(1000);
        WebElement cartbtn = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
        Thread.sleep(1000);
        cartbtn.click();
        WebElement placeorderbtn = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
        Thread.sleep(2000);
        placeorderbtn.click();
        WebElement namefield = driver.findElement(By.id("name"));
        WebElement countryfield = driver.findElement(By.id("country"));
        WebElement cityfield = driver.findElement(By.id("city"));
        WebElement creditcardfield = driver.findElement(By.id("card"));
        WebElement monthfield = driver.findElement(By.id("month"));
        WebElement yearfield = driver.findElement(By.id("year"));
        WebElement purchasebtn = driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
        Thread.sleep(2000);
        namefield.sendKeys(Name);
        Thread.sleep(1000);
        countryfield.sendKeys(Country);
        Thread.sleep(2000);
        cityfield.sendKeys(City);
        Thread.sleep(2000);
        creditcardfield.sendKeys(CreditCard);
        Thread.sleep(2000);
        monthfield.sendKeys(Month);
        Thread.sleep(2000);
        yearfield.sendKeys(Year);
        Thread.sleep(2000);
        purchasebtn.click();

    }
}
