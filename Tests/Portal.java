import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Portal {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://selenium drivers//chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://https://portal.aait.edu.et/login");



        Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();

        WebElement username = driver.findElement(By.id("UserName"));
        username.sendKeys("ATE/5153/09");


        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("4147");

        WebElement login = driver.findElement(By.className("btn-success"));
        login.click();

        System.out.println(driver.getCurrentUrl());


        Thread.sleep(1500);
        driver.close();




    }
}
