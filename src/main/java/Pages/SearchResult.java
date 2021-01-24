package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResult {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public SearchResult(WebDriver driver) {
        this.driver=driver;
    }

    //Assert element search result
    public void AssertElement(){
        Assert.assertEquals("“samsung”",driver.findElement(By.xpath("//b[contains(text(),'“samsung”')]")).getText());
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'“samsung”')]")));
    }

    //Assert element search result
    public void AssertCategory(){
        Assert.assertEquals("Kategori Sepeda",driver.findElement(By.xpath("//h1[contains(text(),'Kategori Sepeda')]")).getText());
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Kategori Sepeda')]")));
    }
}
