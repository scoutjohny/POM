package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePagePF;

public class PolovniAutomobili extends BaseTest{
    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser) throws Exception {
        init(browser);
    }

    @AfterMethod
    @Parameters({"quit"})
    public void tearDown(String quit){
        if(quit.equalsIgnoreCase("Yes")) {
            quit();
        }
    }

    @Test
    @Parameters({"env","wait"})
    public void test1() throws Exception {
        openApp("PROD");
        HomePagePF homePagePF = new HomePagePF(driver);
        homePagePF.searchVehicles("Alfa Romeo","145",30);
    }
}
