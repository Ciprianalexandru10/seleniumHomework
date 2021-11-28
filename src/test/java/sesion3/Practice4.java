package sesion3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Practice4 {

    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPI\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void selectTest() throws InterruptedException {
        WebElement dropDown1 = driver.findElement(By.id("dropdowm-menu-1"));
        Select sel1 = new Select(dropDown1);
        sel1.selectByIndex(2);
        Thread.sleep(2000);

        WebElement dropDown2 = driver.findElement(By.id("dropdowm-menu-2"));
        Select sel2 = new Select(dropDown2);
        sel2.selectByValue("junit");
        Thread.sleep(2000);

        WebElement dropDown3 = driver.findElement(By.id("dropdowm-menu-3"));
        Select sel3 = new Select(dropDown3);
        sel3.selectByVisibleText("CSS");
        Thread.sleep(2000);

        List<WebElement> option3 = sel3.getOptions();
        for(WebElement o : option3){
            System.out.println(o.getAttribute("value")+ " ");
        }


    }
    @Test
    public void checkBoxTest(){

            WebElement option2 = driver.findElement(By.cssSelector("input[value='option-2']"));
        WebElement option3 = driver.findElement(By.xpath("//input[@value='option-3']"));

        assertTrue(option3.isSelected());

        option2.click();
        option3.click();

    }


    @Test
    public void radioButtonTest() throws InterruptedException {
        List<WebElement> radioGroup = driver.findElements(By.name("color"));
        System.out.println("Radio buttons list " + radioGroup.size());
        WebElement orange = driver.findElement(By.xpath("//input[@value='orange']"));


        assertTrue(!orange.isSelected());


        for(WebElement radio : radioGroup){
            if (radio.getAttribute("value").equals("orange")){
                radio.click();
            }
        }

        Thread.sleep(2000);

        assertTrue(orange.isSelected());
    }
}
