import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mary/Downloads/chromedriver");
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("https://dev6.nymbus.com/frontoffice/#/crm/login");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website https://dev6.nymbus.com");

        //Wait for 5 Sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // Close the driver
        driver.quit();
    }
}
