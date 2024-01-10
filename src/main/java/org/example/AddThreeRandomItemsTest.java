package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class AddThreeRandomItemsTest extends BaseClass {
    @Test
    public void addrandomitems() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        driver.switchTo().alert().accept();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        for (int i = 0; i < 3; i++) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#tbodyid a")));
            List<WebElement> itemsList = driver.findElements(By.cssSelector("#tbodyid a"));
            int allList = itemsList.size();
            Random rand = new Random();
            int randomItemIndex = rand.nextInt(allList);
            itemsList.get(randomItemIndex).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-success")));
            driver.findElement(By.cssSelector(".btn-success")).click();
            driver.navigate().back();
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
            driver.navigate().back();
        }
    }
}


