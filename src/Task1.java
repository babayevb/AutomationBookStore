import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Do not ever use your own personal data or any legit information while creating test data
        String email = "gmuiykp379@uptoupmail.com";
        String pwd = "YollAcademyCohort7";

        /* Navigate to the website */
        driver.navigate().to("http://demo.guru99.com/test/newtours/");

        /* Click on Register */
        driver.findElement(By.linkText("REGISTER")).click();

        /* fill out First Name text box */
        /* another way of -- driver.findElement(By.name("firstName")).sendKeys("Elvin"); */
        WebElement firstnameTextBox = driver.findElement(By.name("firstName"));
        firstnameTextBox.sendKeys("Elvin");

        /* fill out Last Name text box */
        WebElement lastNameTextBox = driver.findElement(By.name("lastName"));
        lastNameTextBox.sendKeys("Mustafayev");
        /* fill out Phone text box */
        WebElement phoneTextBox = driver.findElement(By.name("phone"));
        phoneTextBox.sendKeys("555 555 65 55");
        /* fill out Email text box */
        driver.findElement(By.id("userName")).sendKeys(email);
        /* fill out Address text box */
        driver.findElement(By.name("address1")).sendKeys("1475 Western Ave");
        /* fill out City text box */
        driver.findElement(By.name("city")).sendKeys("Albany");
        /* fill out State/Province text box */
        driver.findElement(By.name("state")).sendKeys("NY");
        /* fill out Postal Code text box */
        driver.findElement(By.name("postalCode")).sendKeys("12203");
        /* fill out User Name text box */
        driver.findElement(By.id("email")).sendKeys(email);
        /* fill out Password text box */
        driver.findElement(By.name("password")).sendKeys(pwd);
        /* fill out Confirm Pawssword text box */
        driver.findElement(By.name("confirmPassword")).sendKeys(pwd);

        /* click submit button */
        driver.findElement(By.name("submit")).click();

        Thread.sleep(5000); // pausing the execution

        driver.close();
    }
}