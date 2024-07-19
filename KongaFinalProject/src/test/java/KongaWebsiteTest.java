import net.bytebuddy.implementation.bytecode.Throw;
//import org.graalvm.compiler.nodes.memory.address.AddressNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;


public class KongaWebsiteTest {
    //import selenium webDriver
    private WebDriver driver;


    @BeforeTest
    public void setup() throws InterruptedException {
        //locate the chrome driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //open the Chrome browser
        driver = new ChromeDriver();
        //maximise the browser window
        driver.manage().window().maximize();
       // driver.get("https://www.konga.com/");
    }

    @Test(priority = 0)
    public void openKonga() throws InterruptedException {
                // verify the opening of konga website
        driver.get("https://www.konga.com/");
        if (driver.getCurrentUrl().contains("https://www.konga.com/")) {
            //fail
            System.out.println("wrong webpage");

        }else {
                //pass
                System.out.println("correct webpage");
            }
        }

        @Test(priority = 1)
        private void successfulSignIn() throws InterruptedException {
        // verify successful signIn
                Thread.sleep(5000);
                // Click on the Login/SignIn button
                driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();

                Thread.sleep(5000);
                // Locate enter email address field and enter email
                driver.findElement(By.xpath( "//*[@id=\"username\"]")).sendKeys("grace4tru@gmail.com");
                //Locate password field and enter password
                driver.findElement(By.xpath( "//*[@id=\"password\"]")).sendKeys("Arike1980");
            //locate login button and click to signin
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
            //wait for home page to load
            Thread.sleep(10000);
            //verify home page has loaded by locating my account button
            WebElement myaccountButton = driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/a/span"));
            Thread.sleep(5000);
            }
//
//
       @Test(priority = 2)
          public void addToCat() throws InterruptedException {
        Thread.sleep(10000);
            // Test a successful product add to cart
            // Click on Computer and Accessories from categories
                driver.findElement(By.xpath( "//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
                Thread.sleep(5000);
                // Locate Browse categories and click on Laptop
                        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/label/span")).click();
                                  Thread.sleep(5000);
                        // Find and click on Apple MacBook
                driver.findElement(By.xpath( "//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/ul/li[1]/a/label/span")).click();
                Thread.sleep(5000);
                // Locate Apple MacBook(M2 Pro chip with 12core CPU )
                //driver.findElement(By.xpath( "//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[3]/div/div/div[3]/a/div[1]/h3")).click();
                // Locate Apple MacBook Pro M2 Max chip with 12core CPU and 30core GPU 1TB SSD Space Grey 14 inch)
                driver.findElement(By.xpath( "//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[6]/div/div/div[3]/a/div[1]/h3")).click();
                        Thread.sleep(5000);
                //add to cart
           driver.findElement(By.xpath( "//*[@id=\"mainContent\"]/div[4]/div[3]/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div[5]/div[1]/button")).click();
           Thread.sleep(5000);

           // verify that product is in the cart
                WebElement cartitem = driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]/span[1]"));

                cartitem.click();
                System.out.println(cartitem.getText());

           }

            @Test(priority = 3)
                public void checkOut() throws InterruptedException {
                //successful product checkout
//                Thread.sleep(5000);
//                driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]")).click();
                Thread.sleep(5000);
                // Locate checkout button and click
                driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[4]/div/div[6]/div/a")).click();
                Thread.sleep(10000);
                System.out.println("Checkout");

            }

            @Test(priority = 4)
    public void addAddress() throws InterruptedException {
        // Locate and click on the add address button
                driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
                Thread.sleep(5000);
                // Locate the first name field and type in first name
                driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Mfon");
                // Locate and type in last name
                driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Etim");
                Thread.sleep(5000);
                // Locate the phone number field and type in phone number
                driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("09071055101");
                // Locate street address field and type in street name
                driver.findElement(By.xpath("//*[@id=\"street\"]")).sendKeys("10 Adedoyin street");
                Thread.sleep(10000);
                // Locate city field and type in city
                driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Ogba");
                // Locate state field and select state on the dropdown
                Thread.sleep(8000);
                driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[6]/div/div/select")).click();
                // Locate state field and type in state
                driver.findElement(By.name("regionId")).sendKeys("Lagos");
                Thread.sleep(8000);
                driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[7]/div/div/select")).click();
                Thread.sleep(10000);
                // Locate local government field and type in LGA
                driver.findElement(By.name("areaId")).sendKeys("Ikeja");
                Thread.sleep(10000);
                // Locate the save change button and click
                driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[8]/div[1]/button")).click();
                //Select to use address
                //WebElement AddAddress = driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[1]/div/a"));
                Thread.sleep(10000);
                driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[2]/div/form/button")).click();
                //addAddress.click();
                Thread.sleep(10000);

                // Verify address was successfully added
                WebElement Address = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/p[1]"));
                System.out.println("AddAddress");
                Thread.sleep(10000);
                //use address
                driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
            }

            @Test(priority = 5)
        public void SelectCardMethod() throws InterruptedException {
                Thread.sleep(5000);
                // Locate pay now and click
                driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
                // Locate continue to payment
                driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
                Thread.sleep(10000);
                // Switch to iframe for payment
                WebElement iframe = driver.findElement(By.xpath("//*[@id=\"kpg-frame-component\"]"));
                driver.switchTo().frame(iframe);
                Thread.sleep(5000);
                // Locate card payment method and select
                driver.findElement(By.className("Card")).click();
                System.out.println("select card method");
            }

            @Test(priority = 6)
    public void InputInvalidCardDetails() throws InterruptedException {
                Thread.sleep(5000);
                // Locate card details field and enter invalid card number
                driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("5678 9123 4567 8");
                // Locate card date field and enter invalid card expiring date
                driver.findElement(By.xpath("//*[@id=\"expiry\"]")).sendKeys("0824");
                Thread.sleep(5000);
                // Locate cvv field and type in invalid cvv
                driver.findElement(By.xpath("//*[@id=\"cvv\"]")).sendKeys("567");
                // Locate card pin field and enter invalid pin
                driver.findElement(By.xpath("//*[@id=\"card-pin-new\"]")).sendKeys("3030");
                Thread.sleep(10000);
                // Locate button 1 on the password keypad and click
                driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[1]")).click();
                Thread.sleep(5000);
                // Locate button 2 on the password keypad and click
                driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[2]")).click();
                // Locate button 3 on the password keypad and click
                driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[3]")).click();
                Thread.sleep(5000);
                // Locate button 4 on the password keypad and click
                driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[4]")).click();
                driver.findElement(By.xpath("//*[id=\"validGateCardForm\"]")).click();
                Thread.sleep(5000);
                System.out.println("input card pin");
            }

                @Test(priority = 7)
                public void ErrorMessage() throws InterruptedException {

                    // Print out invalid card as error message
                    WebElement ErrorMessage = driver.findElement(By.xpath("//*@id=\"card-number\"]"));
                    System.out.println(ErrorMessage.getText());
                    Thread.sleep(5000);
                }
////
////
              @Test(priority = 8)
    public void closePaymentMedal() throws InterruptedException {
                  // Locate x button on payment modal and click to close the modal
                  driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
                  Thread.sleep(5000);
                  System.out.println("close payment method");
              }

              @Test(priority = 9)
    public void ReturnToDefaultFrame() throws InterruptedException {
                  //Switch back to default frame
                  driver.switchTo().defaultContent();
                  System.out.println("Close Iframe");
              }

              @AfterTest
    public void tearDown() {
        // Quit browser
          if (driver != null) {
              driver.quit();
          }
          }

           }































