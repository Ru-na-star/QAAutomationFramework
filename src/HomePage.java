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
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);

    }



    @Test( enabled = true)
    public void chekHomePageTitle() throws InterruptedException {

        //driver.get(amazonUrl);
        String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle= driver.getTitle();
        //Validated title
        Assert.assertEquals(actualTitle,expectedTitle," Test Faied Title does not match");
        Thread.sleep(5000);
    }

@Test(enabled = true)
    public void SearchBox1() throws InterruptedException {

        //Open Browser and nevagate to amazon url
//driver.get(amazonUrl);
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

    @Test(enabled =true)
    public void SearchBox2() throws InterruptedException {

        //Open Browser and nevagate to amazon url
       // driver.get(amazonUrl);
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
        //driver.get(amazonUrl);
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
       // driver.get(amazonUrl);
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
    @Test( enabled = true)

 public  void loginWithValid1() throws InterruptedException {
     //Open Browser and nevagate to amazon url
    // driver.get(amazonUrl);
     //Click on orders bar on amazon
     driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).click();
Thread.sleep(5000);
driver.quit();

 }
    @Test( enabled =true)

    public  void loginWithValid2() throws InterruptedException {
        //Open Browser and nevagate to amazon url
       // driver.get(amazonUrl);
        //Click on try prime
        driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test( enabled = true)

    public  void loginWithValid3() throws InterruptedException {
        //Open Browser and nevagate to amazon url
       // driver.get(amazonUrl);
        //Click on Cart logo
        driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
        Thread.sleep(5000);
        driver.quit();
    }


    @Test( enabled = true)

    public  void loginWithValid4() throws InterruptedException {
        //Open Browser and nevagate to amazon url
       // driver.get(amazonUrl);
        //Click on dropdown on amazon
        driver.findElement(By.xpath("//*[@id=\"nav-search-dropdown-card\"]/div")).click();
        Thread.sleep(5000);
        driver.quit();

    }

    @Test(enabled =true)
    public void SearchToys() throws InterruptedException {

        //Open Browser and nevagate to amazon url
      //  driver.get(amazonUrl);

        //Click on search button
        driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
        Thread.sleep(7000);


//enter toys  in search box wenedit field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("toys");
//for wait only
        Thread.sleep(5000);

    }


    @Test(enabled = true)
    public void checkCreateAccount() throws InterruptedException {
        //Open Browser and nevagate to amazon url
        // driver.get(amazonUrl);

        Thread.sleep(5000);
        //click sign in button
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]" )).click();


    driver.quit();
    }

    @Test(enabled = true)
    public void amazonLogo() throws InterruptedException {

        //Open Browser and nevagate to amazon url
      driver.get(amazonUrl);

//for wait only
        Thread.sleep(5000);
//click amazon left corner logo
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a ")).click();

    }

    @Test(enabled = true)
    public void Selectaddress() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        //driver.get(amazonUrl);

//for wait only
        Thread.sleep(5000);
      //click on hello select your address
     driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")) .click();
     //enter a valid us zip code
     driver.findElement(By.xpath("//*[@id=\"GLUXSignInButton\"]/span/input")).click();


        //ente valied email id
       driver.findElement(By.xpath("//*[@id=\"ap_email\"] ")) .sendKeys(" ofm.fahim@Yahoo.com");

    }

    @Test(enabled = true)
    public void vaildHmicon() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        //driver.get(amazonUrl);

//for wait only
        Thread.sleep(5000);
//click hm icon
    driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i ")).click();
//click prime video inside shop by category
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(2) > a ")).click();
    }


    @Test(enabled =true)
    public void Searchwomenfashion() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        //  driver.get(amazonUrl);

        //Click on search button
        driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();

//enter toys  in search box wenedit field
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("women's fashion");
        Thread.sleep(7000);
    }

    @Test(enabled =true)
    public void Searchbox1() throws InterruptedException {

        //Open Browser and nevagate to amazon url
  driver.get(amazonUrl);

//enter toys  in search box wenedit field

//search women's fashion in search box
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("women's fashion");
        //Click on search button
        driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
        Thread.sleep(7000);
        String expectedResult="\"women's fashion\"";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualResult,expectedResult,"test failed");

    }


    @Test(enabled =true)
    public void Searchbox2() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);

//enter toys  in search box wenedit field

//search computer desk" in search box
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys( "computer desk");
        //Click on search button


    }


    @Test(enabled =true)
    public void Searchbox3() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);

//enter toys  in search box wenedit field

//search computer desk" in search box
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys( "computer desk");
        //Click on search button


    }



    @Test(enabled =true)
    public void Searchbox4() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);

//enter toys  in search box wenedit field

//search "jewelry" in search box
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys( "jewelry");
        //Click on search button


    }

    @Test(enabled =true)
    public void Searchbox5() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);

//enter toys  in search box wenedit field

//search  "airpods"in search box
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(  "airpods");
        //Click on search button


    }


    @Test(enabled =true)
    public void Searchbox6() throws InterruptedException {

        //Open Browser and nevagate to amazon url
        driver.get(amazonUrl);

//enter "hairstylist aprons for women"in search box wenedit field

//search  "airpods"in search box
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(  "hairstylist aprons for women");
        //Click on search button

    }


    @AfterMethod
        public void tearDown () {
            driver.quit();


        }

    }
