import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class seleniumTest {
    @Test
    public void firstTest() throws InterruptedException {

        //1. WebDriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate webapp
        driver.get("https://www.w3schools.com/");

        //   Ensure State
        WebDriverWait wait = new WebDriverWait(driver, 3);

        //3. Click Login Button
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\"w3loginbtn\"]").click();

        //4. Click And Input Email (Perform Action)

        WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("modalusername")));
        userName.sendKeys("sandikurniaaa@gmail.com");

        //5. Click And Input Password
        WebElement pass = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("current-password")));
        pass.sendKeys("Aku120396@");

        //6. Click Login Button

        ((ChromeDriver) driver).findElementByXPath("//div[@class=\"LoginModal_cta_bottom_box__wU1AF\"]/child::node()").click();



        //7. Assertion/Validation

        assertTrue(userName.isDisplayed());

        Thread.sleep(3000);
        driver.quit();
    }

}
