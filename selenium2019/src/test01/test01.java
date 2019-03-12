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
  @Before //ע��Junit
  public void setUp() throws Exception {
	  //���������
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe" );
    //������ַ
    baseUrl = "file:///E:/software%20testinglenium/index.html";
   // ȫ�ֵȴ�
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test //��������������
  public void testUntitled() throws Exception {
	  //�򿪱�����ַ
	driver.get(baseUrl);
    driver.findElement(By.id("user")).clear();
    driver.findElement(By.id("user")).sendKeys("������������");
    new Select(driver.findElement(By.id("moreSelect"))).selectByVisibleText("meizu");
    driver.findElement(By.xpath("(//input[@name='identity'])[2]")).click();
    driver.findElement(By.name("checkbox1")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    
    }
  }

