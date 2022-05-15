package Class01Review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertions {
    WebDriver driver;

    @BeforeMethod
    public void openbrower() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://alternativebrewing.com.au/blogs/coffee-guides/coffee-grinding-guide");
    }

    @Test
    public void testTitle() {
//        /get the title from the webPage and store in a string
        SoftAssert soft=new SoftAssert();
        String actualTitle = driver.findElement(By.xpath("//h1[@class='page__title heading h1']")).getText();
        String expectedTitle= "Coffee Grinding Guide";
       soft.assertEquals(actualTitle,expectedTitle);

        String title2 =driver.findElement(By.id("coffeefreshnessisfleetingHeader")).getText();
        String expectedTitle2 = "Coffee Freshness Is Fleeting";
        System.out.println("heelo");
       soft.assertEquals(title2,expectedTitle2);
        soft.assertAll();

    }
}