import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement radioButton1 = driver.findElement(By.id("checkbox-1"));
        radioButton1.click();

        WebElement radioButton2 = driver.findElement(By.id("checkbox-2"));
        radioButton2.click();

        WebElement radioButton3 = driver.findElement(By.id("checkbox-3"));
        radioButton3.click();

        driver.quit();
    }
}
