import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForTestinG {

 @Test
 public   void testTitle() throws InterruptedException {
     String amazonUrl=("https://www.amazon.com/ ");
     String browseDriverPath="BrowseDriver/ChromeBrowser/chromedriver.exe";
     System.setProperty("webdriver.chrome.driver",browseDriverPath) ;
     WebDriver driver=new ChromeDriver() ;
     driver.get(amazonUrl);
     //driver.close();

     String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
     String actualTitle= driver.getTitle();
     //Validated title

   Assert.assertEquals(actualTitle,expectedTitle," Test Faied Title does not match");
     Thread.sleep(5000);
     driver.quit();

 }

}
