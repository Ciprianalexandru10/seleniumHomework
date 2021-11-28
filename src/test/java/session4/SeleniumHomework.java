package session4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class SeleniumHomework {

    WebDriver driver;
    JavascriptExecutor js ;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPI\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void temaFinala() throws InterruptedException {

        driver.get("http://practice.automationtesting.in/");

        WebElement func = driver.findElement(By.id("menu-item-40"));
        func.click();

        Thread.sleep(2000);

        func  = driver.findElement(By.linkText("Home"));
        func.click();

        Thread.sleep(2000);


        //5
        List<WebElement> imageList = driver.findElements(By.cssSelector(".attachment-shop_catalog.size-shop_catalog.wp-post-image"));
        System.out.println("Number of images " + imageList.size());

        Thread.sleep(2000);



        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        func = driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img"));
        func.click();

        Thread.sleep(2000);


        func = driver.findElement(By.cssSelector(".cart .single_add_to_cart_button"));
        func.click();

        Thread.sleep(2000);


        WebElement webElement = driver.findElement(By.cssSelector(".woocommerce-message .button.wc-forward"));
        assertTrue(webElement.isDisplayed());
        webElement.click();

        Thread.sleep(2000);



        String subtotalValue  = driver.findElement(By.cssSelector(".cart-collaterals td[data-title=\"Subtotal\"] .woocommerce-Price-amount")).getText().replace("₹", "");
        String totalValue  = driver.findElement(By.cssSelector(".cart-collaterals td[data-title=\"Total\"] .woocommerce-Price-amount")).getText().replace("₹", "");

        System.out.println(subtotalValue);
        System.out.println(totalValue);

        if (Double.parseDouble(subtotalValue) < Double.parseDouble(totalValue)) {
            System.out.println("Totalul este mai mare ca subtotalul");
        }

        func = driver.findElement(By.cssSelector(".wc-proceed-to-checkout .checkout-button "));
        func.click();

        Thread.sleep(2000);


        WebElement completeFields = driver.findElement(By.id("billing_first_name"));
        completeFields.sendKeys("Ciprian");
        Thread.sleep(1000);

        completeFields=driver.findElement(By.id("billing_last_name"));
        completeFields.sendKeys("Biban");
        Thread.sleep(1000);

        completeFields=driver.findElement(By.id("billing_email"));
        completeFields.sendKeys("bibanciprian@gmail.com");
        Thread.sleep(1000);

        completeFields=driver.findElement(By.id("billing_phone"));
        completeFields.sendKeys("0720559752");
        Thread.sleep(1000);

        completeFields=driver.findElement(By.cssSelector(".select2-container#s2id_billing_country"));
        completeFields.click();
        completeFields=driver.findElement(By.cssSelector("#s2id_autogen1_search.select2-input"));
        completeFields.sendKeys("Romania");
        completeFields=driver.findElement(By.cssSelector(".select2-results#select2-results-1"));
        completeFields.click();
        Thread.sleep(1000);

        completeFields=driver.findElement(By.cssSelector(".input-text#billing_address_1"));
        completeFields.sendKeys("Gh Sincai nr 12");
        Thread.sleep(1000);

        completeFields=driver.findElement(By.cssSelector(".input-text#billing_city"));
        completeFields.sendKeys("Pitesti");
        Thread.sleep(1000);

        completeFields=driver.findElement(By.cssSelector(".input-text#billing_postcode"));
        completeFields.sendKeys("110112");
        Thread.sleep(1000);

        WebElement radioBtn1 = driver.findElement(By.id("payment_method_cod"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn1);
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.cssSelector("#order_review #place_order"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);


//        WebElement test= func.findElement(By.cssSelector(".woocommerce-thankyou-order-details .method strong"));
//        assertTrue(test.isDisplayed());
//        assertTrue(test.getText().contains("Cash on Delivery"));
//        WebElement test2 = func.findElement(By.cssSelector(".shop_table.order_details tr:nth-child(1) td"));
//        assertTrue(test2.isDisplayed());
//        assertTrue(test2.getText().contains("Cash on Delivery"));
//
//        Thread.sleep(2000);


//        Aici la ultimul punct nu am reusit sa rezolv.. nu stiu ce mai exact trebuie facut...
    }


}
   /*



         12. Check if the Payment method is set to Cash on Delivery in both fields

    */
