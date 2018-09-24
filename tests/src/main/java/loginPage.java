import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginPage {

//    System.setProperty("webdriver.chrome.driver",
//            new File("webdrivers/chromedriver.exe").getAbsolutePath());

    public static String url = "https://multiplex.ua";


    public static void openUrl() {
        WebDriver driver = new FirefoxDriver();

        driver.get(url);

        System.out.println("Successfully opened the website "+ url);

        driver.quit();
    }
}
