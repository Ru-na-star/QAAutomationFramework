import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage {

    WebDriver driver;
    String amazonUrl=("https://www.amazon.com/ ");

    @BeforeMethod
    public void setup() {

        String browseDriverPath="BrowseDriver/ChromeBrowser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",browseDriverPath) ;
        driver=new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(28, TimeUnit.SECONDS);


    }



    @Test( enabled = false)
    public void chekHomePageTitle() throws InterruptedException {

        driver.get(amazonUrl);
        String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle= driver.getTitle();
        //Validated title
        Assert.assertEquals(actualTitle,expectedTitle," Test Faied Title does not match");
        Thread.sleep(5000);
    }

@Test(enabled = true)
    public void SearchBox1() throws InterruptedException {

        //Open Browser and nevagate to amazon url
driver.get(amazonUrl);
//enter handsanitizer in search box wenedit field
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hand sanitizer");
//for wait only
   Thread.sleep(5000);
//Click on search button
    driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
Thread.sleep(7000);
//Validated
String expectedResult="\"hand sanitizer\"";
String actualResult=driver.findElement(By.cssSelector("#search > span > div > span > h1 > div > div.sg-col-14-of-20.sg-col-26-of-32.sg-col-18-of-24.sg-col.sg-col-22-of-28.s-breadcrumb.sg-col-10-of-16.sg-col-30-of-36.sg-col-6-of-12 > div > div > span.a-color-state.a-text-bold")).getText();
  //String actualResult=driver.findElement(By.xpath("// span[@class='a-color-state a-text-bold']")).getText();
   // String actualResult=driver.findElement(By.xpath("// span[@class='a-color-state a-text-bold']")).getText();

Assert.assertEquals(actualResult,expectedResult,"Test Fail: Search Keyword does not match ");


    }

    @Test(enabled = true)
    public void SearchBox2() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);
//enter handsanitizer in search box wenedit field
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(  "mask");
//for wait only
        Thread.sleep(5000);
//Click on search button
        driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
        Thread.sleep(7000);
//Validated
        String expectedResult= "\"mask\"";
//String actualResult=driver.findElement(By.cssSelector("#search > span > div > span > h1 > div > div.sg-col-14-of-20.sg-col-26-of-32.sg-col-18-of-24.sg-col.sg-col-22-of-28.s-breadcrumb.sg-col-10-of-16.sg-col-30-of-36.sg-col-6-of-12 > div > div > span.a-color-state.a-text-bold")).getText();
        //String actualResult=driver.findElement(By.xpath("// span[@class='a-color-state a-text-bold']")).getText();
      String actualResult=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();

        Assert.assertEquals(actualResult,expectedResult,"Test Fail: Search Keyword does not match ");


    }

    @Test(enabled = true)
    public void SearchBox3() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);
//enter handsanitizer in search box wenedit field
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rolex");
//for wait only
        Thread.sleep(5000);
//Click on search button
        driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
        Thread.sleep(7000);
//Validated
        String expectedResult="\"rolex\"";
String actualResult=driver.findElement(By.cssSelector("#search > span > div > span > h1 > div > div.sg-col-14-of-20.sg-col-26-of-32.sg-col-18-of-24.sg-col.sg-col-22-of-28.s-breadcrumb.sg-col-10-of-16.sg-col-30-of-36.sg-col-6-of-12 > div > div > span.a-color-state.a-text-bold")).getText();
        //String actualResult=driver.findElement(By.xpath("// span[@class='a-color-state a-text-bold']")).getText();
        //String actualResult=driver.findElement(By.xpath("// span[@class='a-color-state a-text-bold']")).getText();

        Assert.assertEquals(actualResult,expectedResult,"Test Fail: Search Keyword does not match ");


    }

    @Test(enabled = true)
    public void SearchBox4() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);
//enter handsanitizer in search box wenedit field
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
//for wait only
        Thread.sleep(5000);
//Click on search button
        driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
        Thread.sleep(7000);
//Validated
        String expectedResult="\"toys\"";
//String actualResult=driver.findElement(By.cssSelector("#search > span > div > span > h1 > div > div.sg-col-14-of-20.sg-col-26-of-32.sg-col-18-of-24.sg-col.sg-col-22-of-28.s-breadcrumb.sg-col-10-of-16.sg-col-30-of-36.sg-col-6-of-12 > div > div > span.a-color-state.a-text-bold")).getText();
        //String actualResult=driver.findElement(By.xpath("// span[@class='a-color-state a-text-bold']")).getText();
        String actualResult=driver.findElement(By.xpath("// span[@class='a-color-state a-text-bold']")).getText();

        Assert.assertEquals(actualResult,expectedResult,"Test Fail: Search Keyword does not match ");


    }




    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
