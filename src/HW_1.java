import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        driver.get("https://yoll.io/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.tesla.com/en_CA/");
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println("4th website title is: " + title);
        driver.navigate().back();
        Thread.sleep(3000);
        String title3 = driver.getTitle();
        System.out.println("3rd website title is: " + title3);
        driver.navigate().back();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        System.out.println("2nd website URL is :" + url);
        driver.navigate().back();
        Thread.sleep(3000);
        String title1 = driver.getTitle();
        System.out.println("1st website title is: " + title1) ;

        driver.quit();


    }
}
