import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class seleniumTCPLogin {
    @Test
    public void firstTest() throws InterruptedException {

        //1. WebDriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate webapp
                driver.get("https://stackoverflow.com/");

        //   Ensure State
                WebDriverWait wait = new WebDriverWait(driver, 3);

        //3. Click Login Button
                ((ChromeDriver) driver).findElementByXPath("/html/body/header/div/ol[2]/li[3]/a").click();

        //4. Click And Input Email (Perform Action)

               WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
                           userName.sendKeys("Icepanda1296@gmail.com");

        //5. Click And Input Password
              WebElement pass = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
                          pass.sendKeys("Testing123@");

        //6. Click Login Button

              ((ChromeDriver) driver).findElementByXPath("//button[@id=\"submit-button\"]").click();

        //7. Assert
        WebElement ogeh = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mainbar")));
        assertTrue(ogeh.isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }
@Test
public void testKedua() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //2. Navigate webapp
        driver.get("https://stackoverflow.com/");
        //   Ensure State
        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[4]/a")).click();

        driver.findElement(By.id("display-name")).sendKeys("Anton");

        WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        userName.sendKeys("Icepanda1296@gmail.com");

        driver.findElement(By.id("password")).sendKeys("Testing123");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/div/div[2]/label")).click();


        driver.findElement(By.id("submit-button")).click();
        WebElement tampil = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/p[@class = \"fs-caption fc-light mt4 mb4\"]")));
        assertTrue(tampil.isDisplayed());
            Thread.sleep(3000);
            driver.quit();

    }

}
