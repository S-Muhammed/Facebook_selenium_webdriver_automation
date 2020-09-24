package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInTest {
    private WebDriver driver;
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testingpreneur@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ibidapo123");
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
        Thread.sleep(10000);
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        SignInTest test = new SignInTest();
        test.setUp();

    }


}
