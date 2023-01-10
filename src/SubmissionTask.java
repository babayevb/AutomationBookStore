import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SubmissionTask {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demowebshop.tricentis.com");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class=\"item-box\"]"));
        System.out.println("Number of avalibale items: " + elements.size());
        driver.quit();
    }
}
