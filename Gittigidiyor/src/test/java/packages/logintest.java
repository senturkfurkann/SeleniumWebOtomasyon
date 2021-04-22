package packages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class logintest {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/senturkfurkann/Desktop/Selenium/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
        driver.navigate().to("https://www.gittigidiyor.com/uye-girisi");

        driver.findElement(By.xpath("//*[@id='L-UserNameField']")).sendKeys("deneme.1161@outlook.com");
        driver.findElement(By.xpath("//*[@id='L-PasswordField']")).sendKeys("deneme123");
        driver.findElement(By.xpath("//*[@id='gg-login-enter']")).click();
        Thread.sleep(2000L);


        WebElement userCheck = driver.findElement(By.xpath("//span[contains(text(),'denemetest928501')]"));
        if (userCheck.getText().contains("denemetest928501")) {
            System.out.println("Login İşlemi Başarılı!");


        }else {
            System.out.println("Login İşlemi BAŞARISIZ!!");
        }
    }
}