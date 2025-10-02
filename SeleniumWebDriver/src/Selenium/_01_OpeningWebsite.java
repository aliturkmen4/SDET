package Selenium;

import Selenium.Utilities.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite { //psvm + enter --> public static void main kısayolu
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //driver objesi oluşturdum.
        driver.get("https://www.selenium.dev/");
        MyFunctions.Bekle(5); // yazdığım fonksiyonla beraber bunun kapanmadan 5 sn beklemesini sağladım.
        driver.quit(); //aktif olan, olmayan bütün tarayıcıları kapatır.
        //driver.close(); --> sadece bu browser'ı kapatır.
    }
}
