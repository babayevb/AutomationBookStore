import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /* Go to google.com using navigate method */
        driver.navigate().to("https://www.google.com/");  //google

        Thread.sleep(5000);  // 5000 millis = 5 sec

        /* Go to uber.com */
        driver.get("https://www.uber.com/");  //uber

        Thread.sleep(5000);  // 5000 millis = 5 sec

        /* Print the title of the page */
        String title = driver.getTitle();
        System.out.println("Title is " + title);

        /* Go back to previous webpage */

        driver.navigate().back();

        Thread.sleep(5000);  // 5000 millis = 5 sec

        /* Print url of the page */

        String url = driver.getCurrentUrl();

        System.out.println("Url is " + url);

        /* Maximize the window */

        driver.manage().window().maximize();
        Thread.sleep(5000);  // 5000 millis = 5 sec

        /* Close the browser */
        driver.quit();

    }
}
