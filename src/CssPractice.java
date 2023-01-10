import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String name = "Adam";
        String lastName = "Joseph";
        String address = "Canada, ON";
        String phoneNumber = "1010101011";
//        Navigate to http://demo.automationtesting.in/Register.html
        driver.navigate().to("http://de mo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
//        Locate the element for ‘FIRSTNAME’ and pass your first name using Keys.SHIFT
        WebElement firstNameTextBox = driver.findElement(By.cssSelector("[placeholder='First Name']"));
        firstNameTextBox.clear();
        firstNameTextBox.sendKeys(Keys.SHIFT, name);
        Thread.sleep(1000);
//        Locate the element for ‘LASTNAME’ and pass your first name using Keys.SHIFT
//        Type the address to the address textbox, without locating Address Text Box element (Use Keys.TAB)
//        Delete the entered text to Address box using the technique of CTRL + "a" + Backspace
        WebElement lastNameTextBox = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
        lastNameTextBox.clear();
        lastNameTextBox.sendKeys(Keys.SHIFT, lastName);
        Thread.sleep(1000);
        lastNameTextBox.sendKeys(Keys.TAB, address);
        Thread.sleep(1000);
        WebElement addressTextBox = driver.findElement(By.cssSelector("[ng-model='Adress']"));
        addressTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        Thread.sleep(1000);
//        Locate the address box, and fill with send keys
        addressTextBox.sendKeys(address);
        Thread.sleep(1000);
//        Locate the phone, and fill with send keys
        WebElement phoneTextBox = driver.findElement(By.cssSelector("[ng-model='Phone']"));
        phoneTextBox.sendKeys(phoneNumber);
        Thread.sleep(1000);
//        Select gender
        driver.findElement(By.cssSelector("[ng-model='radiovalue']")).click();
        Thread.sleep(1000);
//        select at least 2 hobbies
        driver.findElement(By.cssSelector("[id='checkbox2']")).click();
        driver.findElement(By.cssSelector("[id='checkbox3']")).click();
        Thread.sleep(1000);
//        Locate the Password box, and fill with send keys
        driver.findElement(By.cssSelector("[id='firstpassword']")).sendKeys("password");
        Thread.sleep(1000);
//        Locate the Confirm Password box, and fill with send keys
        driver.findElement(By.cssSelector("[id='secondpassword']")).sendKeys("password");
        Thread.sleep(1000);
//        Click Refresh button
        driver.findElement(By.cssSelector("[id='Button1']")).click();
        Thread.sleep(1000);
        driver.quit();




//        driver.navigate().to("http://automationpractice.com/index.php");
//        String womenBackGroundColor =
//                driver.findElement(By.cssSelector("a[title='Women']")).getCssValue("background-color");
//        System.out.println("The CSS value for background-color of Women button is:" + womenBackGroundColor);
//        driver.findElement(By.cssSelector("a[title='Women']")).click();
//        String backGroundColor =
//                driver.findElement(By.cssSelector("a[title='Women']")).getCssValue("background-color");
//        System.out.println("The CSS value for background of the button is: " + backGroundColor);
//        Thread.sleep(3000);
//        driver.quit();














//        driver.navigate().to("http://automationpractice.com/index.php");
//        driver.findElement(By.cssSelector("http://automationpractice.com/index.php")).getText()

//        driver.navigate().to("http://dev-hrm.yoll.io/");
//        driver.findElement(By.id("txtUsername")).sendKeys("yoll-student");
//        driver.findElement(By.id("txtPassword")).sendKeys("Bootcamp5#");
//        driver.findElement(By.id("btnLogin")).click();
//        String title = driver.getTitle();
//        System.out.println(title);
//        String dashboardElements1 = "[id = dashboard-quick-launch-panel-menu_holder] > table > tbody > tr > td:nth-child(1)";
//        String textElement1 = driver.findElement(By.cssSelector(dashboardElements1)).getText();
//        System.out.println(textElement1);
//        String dashboardElements2 = "[id = dashboard-quick-launch-panel-menu_holder] > table > tbody > tr > td:nth-child(2)";
//        String textElement2 = driver.findElement(By.cssSelector(dashboardElements2)).getText();
//        System.out.println(textElement2);
//        String dashboardElements3 = "[id = dashboard-quick-launch-panel-menu_holder] > table > tbody > tr > td:nth-child(3)";
//        String textElement3 = driver.findElement(By.cssSelector(dashboardElements3)).getText();
//        System.out.println(textElement3);
//        String dashboardElements4 = "[id = dashboard-quick-launch-panel-menu_holder] > table > tbody > tr > td:nth-child(4)";
//        String textElement4 = driver.findElement(By.cssSelector(dashboardElements4)).getText();
//        System.out.println(textElement4);
//        String dashboardElements5 = "[id = dashboard-quick-launch-panel-menu_holder] > table > tbody > tr > td:nth-child(5)";
//        String textElement5 = driver.findElement(By.cssSelector(dashboardElements5)).getText();
//        System.out.println(textElement5);
//        String dashboardElements6 = "[id = dashboard-quick-launch-panel-menu_holder] > table > tbody > tr > td:nth-child(6)";
//        String textElement6 = driver.findElement(By.cssSelector(dashboardElements6)).getText();
//        System.out.println(textElement6);
//        Thread.sleep(5000);
//        driver.quit();








//        driver.navigate().to("https://www.ohchr.org/en/ohchr_homepage");
//        System.out.println(driver.findElement(By.cssSelector(".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav")));
//        String element1 = ".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav>li:nth-child(1)";
//        String printElement1 =  driver.findElement(By.cssSelector(element1)).getText();
//        System.out.println(printElement1);
//        String element2 = ".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav>li:nth-child(2)";
//        String printElement2 =  driver.findElement(By.cssSelector(element2)).getText();
//        System.out.println(printElement2);
//        String element3 = ".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav>li:nth-child(3)";
//        String printElement3 =  driver.findElement(By.cssSelector(element3)).getText();
//        System.out.println(printElement3);
//        String element4 = ".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav>li:nth-child(4)";
//        String printElement4 =  driver.findElement(By.cssSelector(element4)).getText();
//        System.out.println(printElement4);
//        String element5 = ".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav>li:nth-child(5)";
//        String printElement5 =  driver.findElement(By.cssSelector(element5)).getText();
//        System.out.println(printElement5);
//        String element6 = ".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav>li:nth-child(6)";
//        String printElement6 =  driver.findElement(By.cssSelector(element6)).getText();
//        System.out.println(printElement6);
//
//        List<WebElement> navBar = driver.findElements(By.cssSelector(".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav>li"));
//        for(int i = 0; i< navBar.size(); i++){
//        }
//        System.out.println("Size is: " + navBar.size());
//        Part 2
//        String donateButton = ".btn.btn--small.btn--bg-blue.btn-donate";
//        String getDonateButton = driver.findElement(By.cssSelector(donateButton)).getText();
//        System.out.println("Donate button is: " + getDonateButton);
//        driver.quit();












//        driver.navigate().to("http://demo.automationtesting.in/Register.html");
//        WebElement firstNameTextBox = driver.findElement(By.cssSelector("[placeholder='First Name']"));
//        firstNameTextBox.clear();
//        firstNameTextBox.sendKeys(Keys.SHIFT, "Adam");
//
//        WebElement lastNameTextBox = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
//        lastNameTextBox.clear();
//        lastNameTextBox.sendKeys(Keys.TAB, "Sandler" );
//        Thread.sleep(5000);

//        driver.findElement(By.cssSelector("textarea[ng-model=\"Adress\"]"));
//        driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]"));
//        driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
//        driver.findElement(By.cssSelector(""))






    }
}
