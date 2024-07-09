// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class WrongPasswordTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void wrongPassword() {
    driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
    driver.manage().window().setSize(new Dimension(1050, 654));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("grace4tru@gmail.com");
    driver.findElement(By.cssSelector("div:nth-child(1) > .\\_1kbt")).click();
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).sendKeys("Martins");
    driver.findElement(By.id("loginbutton")).click();
    driver.close();
  }
}
