package com.ata.cpsat.tests.boilerplate;

import com.ata.cpsat.boilerplate.DriverFactory;
import com.ata.cpsat.enums.Browser;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CPSatBoilerplateTests {
    private DriverFactory driverFactory;

    @BeforeClass(alwaysRun = true)
    public void initDriver() {
        this.driverFactory = new DriverFactory();
        this.driverFactory.initBrowser(Browser.Chrome);
    }

    @Test
    public void theInternetLoginTest() {
        this.driverFactory.getDriver().get("https://the-internet.herokuapp.com/login");

        // enter username
        this.driverFactory.getDriver().findElement(By.id("username")).sendKeys("tomsmith");
        //enter password
        this.driverFactory.getDriver().findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        // click login
        this.driverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // get the text
        String greetingsMessage = this.driverFactory.getDriver().findElement(By.id("flash")).getText();
        assertThat(greetingsMessage).contains("You logged into a secure area!");
    }

    @AfterClass
    public void tearDown() {
        this.driverFactory.closeBrowser();
    }
}
