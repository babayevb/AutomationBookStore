import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOne {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://dev-hrm.yoll.io/index.php/pim/viewEmployeeList");
        Thread.sleep(3000);
        driver.findElement(By.id("txtUsername")).sendKeys("yoll-student");  //sendKeys = type
        driver.findElement(By.id("txtPassword")).sendKeys("Bootcamp5#");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);

        driver.quit();
    }

}