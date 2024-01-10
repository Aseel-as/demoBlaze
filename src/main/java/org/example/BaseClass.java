package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;

public class BaseClass {

    String username = "Anijssswssdsasa";
    String password = "malak67";
    String email = "ABC@Email.com";
    String name = "Test";
    String message = "Hello Test!";
    String Name = "Test1";
    String Country = "Test2";
    String City = "Test3";
    String CreditCard = "Test4";
    String Month = "Test5";
    String Year = "Test6";
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");

    public static WebDriver driver = null;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        extent.attachReporter(spark);

    }

    @AfterTest
    public void Exit() throws IOException {
        extent.setSystemInfo("App URL", "www.extentreports.com");
        extent.setSystemInfo("Java version", System.getProperty("java.version"));
        extent.createTest("Register", "The user will be registered on portal").assignAuthor("Aseel").assignCategory("Register_Test").assignDevice("chrome").pass("SignUp is done successfully ");
        extent.createTest("LogIn", "The user will be logged in ").assignAuthor("Aseel").assignCategory("LogIn_Test").assignDevice("chrome").pass("LogIn is done successfully ");
        extent.createTest("AboutUs", "The user will be able to run the video").assignAuthor("Aseel").assignCategory("About_Us_Test").assignDevice("chrome").pass("The video is played Successfully");
        extent.createTest("ContactUs", "The user will be able to send a message").assignAuthor("Aseel").assignCategory("Contact_Us_Item_Test").assignDevice("chrome").pass("The message sent successfully");
        extent.createTest("AddThreeRandomItems", "The user will add three random items").assignAuthor("Aseel").assignCategory("Adding_Random_Items_Test").assignDevice("chrome").pass("Adding random items passed");
        extent.createTest("CheckingOut", "The user will be able to place the order").assignAuthor("Aseel").assignCategory("CheckOut_Test").assignDevice("chrome").pass("CheckingOut is passed");
        extent.flush();
        Desktop.getDesktop().browse(new File("ExtentReport.html").toURI());
        driver.quit();
    }
}
