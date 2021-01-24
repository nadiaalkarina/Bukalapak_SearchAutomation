import Pages.SearchResult;
import Pages.dashboard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchByCategory {
    public static void main(String[] args) throws InterruptedException {
        // set driver
        System.setProperty("webdriver.chrome.driver", "D:/SekolahQA/Code/Java/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bukalapak.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        dashboard Dashboard = new dashboard(driver);
        Dashboard.sCategory();
        Dashboard.Category();

        SearchResult searchResult = new SearchResult(driver);
        searchResult.AssertCategory();

        driver.quit();
    }
}
