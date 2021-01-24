package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboard {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public dashboard(WebDriver driver) {
        this.driver=driver;
    }

    //location search boax
    By search = By.id("v-omnisearch__input");
    //method fill search box
    public void sCategory(){
        driver.findElement(search).click();
    }
    public void Search(String fil){
        driver.findElement(search).sendKeys(fil);
    }

    //location search button
    By btnSearch = By.className("v-omnisearch__submit");
    //method click search button
    public void BtnSearch(){
        driver.findElement(btnSearch).click();
    }

    //locator category search
    By category = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/fragment-loader[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/img[1]");
    //method click by category
    public void Category(){
        driver.findElement(category).click();
    }
}
