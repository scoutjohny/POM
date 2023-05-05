package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF extends BasePage{


    public HomePagePF(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="[title=' Sve marke']")
    WebElement brands;
    @FindBy(css="[title=' Svi modeli']")
    WebElement models;
    @FindBy(css="[name='submit_1']")
    WebElement searchButton;
    public void selectBrand (String brand) throws Exception {
        click(brands);
        click(driver.findElement(By.xpath("//label[text()='"+brand+"']"))," Car brand clicked: "+brand);
    }

    public void selectModel (String model) throws Exception {
        click(models);
        click(driver.findElement(By.xpath("//label[contains(text(),'"+model+"')]")),(" Car model clicked: "+model));
    }

    public void clickSearchButton() throws Exception {
        click(searchButton," Search button clicked!");
    }

    public void searchVehicles(String brand, String model) throws Exception {
        selectBrand(brand);
        selectModel(model);
        clickSearchButton();
    }
}
