package Selenium;

import Selenium.Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindById {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/252758803850969");
        driver.manage().window().maximize();
        WebElement name=driver.findElement(By.id("first_3"));
        name.sendKeys("Ali");
        WebElement surname=driver.findElement(By.id("last_3"));
        surname.sendKeys("Türkmen");
        WebElement zipcode=driver.findElement(By.id("input_13_area"));
        zipcode.sendKeys("+90");
        WebElement phonenumber=driver.findElement(By.id("input_13_phone"));
        phonenumber.sendKeys("5555555555");
        WebElement address=driver.findElement(By.id("input_14_addr_line1"));
        address.sendKeys("xyz mahallesi yzt sokak no 14");
        WebElement city=driver.findElement(By.id("input_14_state"));
        city.sendKeys("Antalya");
        MyFunctions.Bekle(3);
        driver.quit();
    }
}
