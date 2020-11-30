package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleCalcTests {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ru/");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[aria-label=\"открывающая скобка\"]")).click();
        //1
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"N10B9\"]")).click();
        driver.findElement(By.cssSelector("div[aria-label=\"сложение\"]")).click();
        //2
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"lVjWed\"]")).click();
        driver.findElement(By.cssSelector("div[aria-label=\"закрывающая скобка\"]")).click();
        driver.findElement(By.cssSelector("div[aria-label=\"умножение\"]")).click();
        //3
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"KN1kY\"]")).click();
        driver.findElement(By.cssSelector("div[aria-label=\"вычитание\"]")).click();
        //4
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"xAP7E\"]")).click();
        //0
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"bkEvMb\"]")).click();
        driver.findElement(By.cssSelector("div[aria-label=\"деление\"]")).click();
        //5
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"Ax5wH\"]")).click();
        driver.findElement(By.cssSelector("div[aria-label=\"равно\"]")).click();
        assertEquals("1", driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] [jsname=\"VssY5c\"]")).getText());
        driver.quit();

    }
}