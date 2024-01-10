package org.example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpTest extends BaseClass {
    @Test
    public void SignUp_Test() throws InterruptedException {

        WebElement signup = driver.findElement(By.id("signin2"));
        signup.click();
        Thread.sleep(2000);
        WebElement usrname = driver.findElement(By.id("sign-username"));
        Thread.sleep(1000);
        usrname.sendKeys(username);
        Thread.sleep(2000);
        WebElement pssword = driver.findElement(By.id("sign-password"));
        Thread.sleep(1000);
        pssword.sendKeys(password);
        Thread.sleep(2000);
        WebElement signupbtn = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
        signupbtn.click();
        Thread.sleep(1000);

    }
}
