import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KuehneNagel_Login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);

        driver.navigate().to("https://demoqa.com");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement bookStore = driver.findElement(By.xpath("(//div[contains(@class,'top-card')])[6]"));
        Thread.sleep(2000);
        act.moveToElement(bookStore);
        act.perform();
        bookStore.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div//button[@id='login']")).click();
        Thread.sleep(2000);

        WebElement scrollToElem = driver.findElement(By.xpath("(//div[@class='element-group'])[6]"));

        act.moveToElement(scrollToElem);
        act.perform();

        String UN = "test123";
        String PW = "Test@123";
        driver.findElement(By.id("userName")).sendKeys(UN);
        driver.findElement(By.id("password")).sendKeys(PW);
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//div//button[@id='login']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement scroll = driver.findElement(By.xpath("(//div[@role='row'])[11]"));
        act.moveToElement(scroll);
        act.perform();
        WebElement clickProfile = driver.findElement(By.xpath("(//li[@id='item-3'])[5]"));
        clickProfile.click();
        Thread.sleep(2000);

        WebElement scrollDown = driver.findElement(By.xpath("(//li[@id='item-3'])[5]"));
        act.moveToElement(scrollDown);
        act.perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='gotoStore']")).click();
        Thread.sleep(2000);

        act.moveToElement(scrollDown);
        act.perform();
        Thread.sleep(2000);

        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
        Thread.sleep(2000);

        WebElement scrollToAdd = driver.findElement(By.xpath("(//li[@id='item-4'])[5]"));
        act.moveToElement(scrollToAdd);
        act.perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='text-right fullButton']//button")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        act.moveToElement(scrollToAdd);
        act.perform();
        Thread.sleep(2000);

        WebElement clickProfilee = driver.findElement(By.xpath("(//li[@id='item-3'])[5]"));
        clickProfilee.click();
        Thread.sleep(2000);

        act.moveToElement(scrollToAdd);
        act.perform();
        Thread.sleep(2000);

        driver.findElement(By.id("delete-record-undefined")).click();
        Thread.sleep(2000);



        WebElement okButton = driver.findElement(By.xpath("//div[@class = \"modal-footer\"]/button[1]"));

        Thread.sleep(1000);
        okButton.click();

        driver.switchTo().defaultContent();

        Thread.sleep(2000);

        alert.accept();
        Thread.sleep(2000);

        driver.quit();

    }
}