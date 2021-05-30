package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.DetailsPage;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calc {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static DetailsPage detailsPage;

    @BeforeAll
    public static void init (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        detailsPage = new DetailsPage(driver);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
        searchPage.search("калькулятор");
    }
    @Test
    public void test11() {

        searchPage.opensk.click();
        searchPage.one.click();
        searchPage.plus.click();
        searchPage.two.click();
        searchPage.closesk.click();
        searchPage.mult.click();
        searchPage.three.click();
        searchPage.minus.click();
        searchPage.four.click();
        searchPage.zero.click();
        searchPage.divi.click();
        searchPage.five.click();
        searchPage.eq.click();
assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage.getnumbers());
assertEquals("1", searchPage.getresult());

    }

    @Test
    public void test12 () {
        searchPage.six.click();
        searchPage.divi.click();
        searchPage.zero.click();
        searchPage.eq.click();
        assertEquals("6 ÷ 0 =", searchPage.getnumbers());
        assertEquals("Infinity", searchPage.getresult());
    }
}
