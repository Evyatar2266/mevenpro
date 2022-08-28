package mevenp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class mevenc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("query")).sendKeys("Cucumber JVM: Junit");
        driver.findElement(By.xpath("//*[@id=\"search\"]/form/input[2]")).click();

    }
}
