package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;
import utils.Driver;

public class GoogleTest extends TestBase {

@Test
    public void openGoogleAndVerifyTitle(){


        GooglePage gp = new GooglePage();

        gp.searchBox.sendKeys("Test" + Keys.ENTER);

        Assert.assertEquals(Driver.getDriver().getTitle(), "Test - Google Search");

    }
}
