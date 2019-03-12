package test01;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test01 {
  private WebDriver driver;
  private String baseUrl;
  @Before //注解Junit
  public void setUp() throws Exception {
	  //定义浏览器
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe" );
    //被测网址
    baseUrl = "file:///E:/software%20testinglenium/index.html";
   // 全局等待
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test //操作，测试用例
  public void testUntitled() throws Exception {
	  //打开被测网址
	driver.get(baseUrl);
    driver.findElement(By.id("user")).clear();
    driver.findElement(By.id("user")).sendKeys("玩玩乐乐若多");
    new Select(driver.findElement(By.id("moreSelect"))).selectByVisibleText("meizu");
    driver.findElement(By.xpath("(//input[@name='identity'])[2]")).click();
    driver.findElement(By.name("checkbox1")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    
    }
  }

