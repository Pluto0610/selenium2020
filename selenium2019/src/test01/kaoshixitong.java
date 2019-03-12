package test01;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class kaoshixitong {
  private static WebDriver driver;
  private static String Url;
  @BeforeClass
  public  static void setUp() throws Exception {
	 // System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe" );
     // driver = new ChromeDriver();
	  DesiredCapabilities a=DesiredCapabilities.chrome();
		 driver=new RemoteWebDriver(new URL("http://192.168.63.1:2323/wd/hub/"),a);
     Url = "http://localhost:8080/examsys/index.thtml";
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
@Test
  public void testUntitled() throws Exception {
    driver.get(Url);
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    driver.findElement(By.name("userpass")).clear();
    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
    driver.findElement(By.name("usercode")).clear();
  WebElement  s=driver.findElement(By.name("usertype"));
    Select s1=new Select(s);
    s1.selectByIndex(2);
    driver.findElement(By.name("usercode"));
    Thread.sleep(10000);
     driver.findElement(By.className("tm_btn")).click();
     driver.switchTo().frame("main");
  String shuchu=  driver.findElement(By.xpath("/html/body/div/div[1]/ul/li")).getText();
    System.out.println(shuchu);
    if(shuchu!=null) {
    	System.out.println("登录成功");
    	 }
    	 else {
    		System.out.println("登录失败");
    		
    	}
    
     
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | menu | ]]
    driver.switchTo().parentFrame();
    driver.switchTo().frame("menu");
      driver.findElement(By.linkText("题库管理")).click();
    driver.findElement(By.linkText("新增题库")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("main");
       driver.findElement(By.name("d_name")).clear();
        
        driver.findElement(By.name("d_name")).sendKeys("MySQL");
        new Select(driver.findElement(By.name("d_status"))).selectByVisibleText("关闭");
        driver.findElement(By.name("d_remark")).clear();
        driver.findElement(By.name("d_remark")).sendKeys("mysql二级考试");
        driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
      }
        
      

  

 @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
    
    }
  }
 
  
