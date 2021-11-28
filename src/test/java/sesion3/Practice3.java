package sesion3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Practice3 {

    WebDriver  driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPI\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginFailWrongUsername(){
        driver.findElement(By.id("username")).sendKeys("test");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();

        assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());

        WebElement flash = driver.findElement(By.id("flash"));
        assertTrue(flash.isDisplayed());
        assertTrue(flash.getText().contains("Your username is invalid!"));
    }

    @Test
    public void loginFailWrongPass(){

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("test!");
        driver.findElement(By.tagName("button")).click();

        assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());

        WebElement flash = driver.findElement(By.id("flash"));
        assertTrue(flash.isDisplayed());
        assertTrue(flash.getText().contains("Your password is invalid!"));
    }

    @Test
    public void loginSucces(){
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();

        assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());

        WebElement flash = driver.findElement(By.id("flash"));
        assertTrue(flash.isDisplayed());
        assertTrue(flash.getText().contains("You logged into a secure area!"));
        assertTrue(driver.findElement(By.xpath("//i[contains(text(), 'Logout')]")).isDisplayed());

    }

}
