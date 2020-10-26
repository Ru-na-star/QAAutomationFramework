package amazontesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageChecking {
WebDriver driver;
    String amazonUrl=("https://www.amazon.com/ ");
    String ebayUrl="https://www.ebay.com/";


    @BeforeMethod
   public void setup() {


       String browseDriverPath="BrowseDriver/ChromeBrowser/chromedriver.exe";
       System.setProperty("webdriver.chrome.driver",browseDriverPath) ;

      // String firefoxDriverPath="BrowseDriver/FireFoxBrowser/geckodriver.exe";
       //System.setProperty( "webdriver.gecko.driver",firefoxDriverPath) ;
       //Chrome driver
      driver=new ChromeDriver() ;


       //Firefox Browser

       // WebDriver driver1=new FirefoxDriver();
//     driver1.get("https://www.ebay.com/ ");
//driver1.get(ebayUrl);
//driver1.close();

   }

  @Test
   public void chekHomePageTitle() throws InterruptedException {



driver.get(amazonUrl);
       //driver.close();

       String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
       String actualTitle= driver.getTitle();
       //Validated title

     Assert.assertEquals(actualTitle,expectedTitle," Test Faied Title does not match");
       Thread.sleep(5000);

  }

    @AfterMethod
    public void tearDown(){
        //driver.close();
        driver.quit();
    }

}
