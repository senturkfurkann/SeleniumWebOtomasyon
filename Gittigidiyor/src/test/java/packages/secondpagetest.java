package packages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class secondpagetest{
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/senturkfurkann/Desktop/Selenium/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");


            driver.findElement(
                    By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input"))
                    .sendKeys("Bilgisayar");
            driver.findElement(
                    By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button/span")).click();


            ((JavascriptExecutor) driver).executeScript("scroll(0,9500)");
            driver.findElement(By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[7]/a")).click();


            if (driver.getCurrentUrl().contains("sf=2")) {
                System.out.println("2. Sayfaya Geçiş Başarılı!");  
                System.out.println("*********************************");
                

            } else {
                System.out.println("2. Sayfaya Geçiş Başarısız!");
                System.out.println("*********************************");
            }


    }


}
