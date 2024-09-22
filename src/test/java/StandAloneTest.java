import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StandAloneTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.wix.com/blog/what-makes-a-good-website");

        driver.findElement(By.xpath("//span[text()='WEBSITE ESSENTIALS']")).click();
        driver.wait(20000);

    }
}
