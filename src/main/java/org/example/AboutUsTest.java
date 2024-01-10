package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AboutUsTest extends BaseClass {
    @Test
    public void aboutuspage() throws InterruptedException {
        Thread.sleep(1000);
        WebElement about = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));
        Thread.sleep(2000);
        about.click();
        Thread.sleep(2000);
        WebElement video = driver.findElement(By.xpath("//*[@id=\"example-video\"]/div[1]"));
        video.click();
        Thread.sleep(5000);
        WebElement closebtn = driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button"));
        closebtn.click();
    }
}
