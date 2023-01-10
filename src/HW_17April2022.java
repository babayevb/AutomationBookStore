import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

public class HW_17April2022 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//        HW-1
        driver.get("http://automationpractice.com/index.php");
        String UN = "ystudent@email.com";
        String PW = "secret";
        driver.findElement(By.xpath("//*[contains(text(), 'Sign in')]")).click();
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(UN);
        driver.findElement(By.xpath("//input[@name = 'passwd']")).sendKeys(PW);
        driver.findElement(By.id("SubmitLogin")).click();
        String title = driver.getTitle();
        System.out.println("The title is: " + title);
        driver.close();
//            HW -2
//        Go to https://testautomationpractice.blogspot.com/
//
//        driver.navigate().to("https://testautomationpractice.blogspot.com/");
//
//        String author1 = "//*[@name = 'BookTable']/..//*[text()='Amit']/..//*[text() = 'Selenium']/..//td[2]";
//        String getAuthor1 = driver.findElement(By.xpath(author1)).getText();
//        System.out.println(getAuthor1);
//
//        String author2 = "//*[@name = 'BookTable']/..//*[text()='Mukesh']/..//*[text() = 'Java']/..//td[2]";
//        String getAuthor2 = driver.findElement(By.xpath(author2)).getText();
//        System.out.println(getAuthor2);
//
//        String author3 = "//*[@name = 'BookTable']/..//*[text()='Animesh']";
//        String getAuthor3 = driver.findElement(By.xpath(author3)).getText();
//        System.out.println(getAuthor3);
//
//        String author4 = "//*[@name = 'BookTable']/..//*[text()='Mukesh']/..//*[text() = 'Selenium']/..//td[2]";
//        String getAuthor4 = driver.findElement(By.xpath(author4)).getText();
//        System.out.println(getAuthor4);
//
//        String author5 = "//*[@name = 'BookTable']/..//*[text()='Amod']";
//        String getAuthor5 = driver.findElement(By.xpath(author5)).getText();
//        System.out.println(getAuthor5);
//
//        String author6 = "//*[@name = 'BookTable']/..//*[text()='Amit']/..//*[text() = 'Javascript']/..//td[2]";
//        String getAuthor6 = driver.findElement(By.xpath(author6)).getText();
//        System.out.println(getAuthor6);
//        driver.close()


//        driver.navigate().to("http://dev-hrm.yoll.io/");
//        driver.manage().window().maximize();
//        String User = "yoll-student";
//        String Pwd =  "Bootcamp5#";
//        driver.findElement(By.id("txtUsername")).sendKeys(User);
//        driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
//        driver.findElement(By.id("btnLogin")).click();
//        Boolean isDisplayed = driver.findElement(By.xpath("//*[@id  = 'Subscriber_link']")).isDisplayed();
//        System.out.println(isDisplayed);

//        1st Part
//
//        driver.navigate().to("http://dev-hrm.yoll.io/");
//        driver.manage().window().maximize();
//        String User = "yoll-student";
//        String Pwd =  "Bootcamp5#";
//        driver.findElement(By.id("txtUsername")).sendKeys(User);
//        driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
//        driver.findElement(By.id("btnLogin")).click();
//        Boolean isDisplayed = driver.findElement(By.xpath("//*[@id  = 'Subscriber_link']")).isDisplayed();
//        System.out.println(isDisplayed);
//
//
//
//        2nd Part
//        driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
//        String url = driver.findElement(By.xpath("//input[@type = 'text' and @placeholder]")).getAttribute("Search store");
//        System.out.println("Values for ‘placeholder’ attribute: " + url);
//        driver.quit();

//        1st Part
//Navigate to https://haltersweb.github.io/Accessibility/submit-disabling.html
//Locate ‘Submit’ button and print on console that button is disabled (use getAttribute() method)
//Enter some text on first name free text field
//Enter some text on last name free text field
//Click anywhere on the page through automation to make submit button enabled
//Locate ‘Submit’ button and print on console that button is enabled (use getAttribute() method)
//
//2nd Part
//  1. Navigate to https://html.com/attributes/button-disabled/
//  2. Locate button that says ‘You can’t click me.’ and print on console that it has ‘disabled’ attribute

//        driver.navigate().to("https://haltersweb.github.io/Accessibility/submit-disabling.html");
//        String str = driver.findElement(By.xpath("//*[@type = 'submit']")).getAttribute("aria-disabled");
//        str = "true";
//        System.out.println(Boolean.valueOf(str));
//
//        String str1 = driver.findElement(By.xpath("//*[@type = 'submit']")).getAttribute("aria-disabled");
//        str1 = "false";
//        System.out.println(Boolean.valueOf(str1));
//
//        driver.quit();


                driver.navigate().to("https://html.com/attributes/button-disabled/");
                String button = driver.findElement(By.xpath("//*[@id=\"post-76\"]/div/div[2]/button")).getAttribute("disabled");
                System.out.println(button.equals("disabled"));
                driver.quit();





    }
}