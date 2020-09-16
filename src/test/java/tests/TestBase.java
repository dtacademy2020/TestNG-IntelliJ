package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {


    protected WebDriver driver;
    protected Actions actions;


    @BeforeMethod(alwaysRun = true)

    public void setUpMethod( ) {

        driver = Driver.getDriver();
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");


    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod() throws IOException {

     //   Driver.quit();
    }







}