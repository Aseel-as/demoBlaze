package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class AddOneRandomItem extends BaseClass {
    @Test
    public void addrandomitem() throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        List<WebElement> itemslist = driver.findElements(By.cssSelector("#tbodyid a"));
        int allList = itemslist.size();
        Random rand = new Random();
        int randomitem = rand.nextInt(allList);
        Thread.sleep(3000);
        itemslist.get(randomitem).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn-success")).click();
        Thread.sleep(3000);
    }
}
