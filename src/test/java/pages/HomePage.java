package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By brands = By.cssSelector("[title=' Sve marke']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

   // WebElement brands = driver.findElement(By.cssSelector("[title=' Sve marke']"));


    public void selectBrand (String brands){
        driver.findElement(this.brands).sendKeys("askdjhs");
    }

}
