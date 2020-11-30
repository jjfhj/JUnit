package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleCalcTests {

    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void test1() {
        driver.get("https://www.google.ru/");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        //(
        driver.findElement(By.cssSelector("div[aria-label=\"открывающая скобка\"]")).click();
        //1
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"N10B9\"]")).click();
        //+
        driver.findElement(By.cssSelector("div[aria-label=\"сложение\"]")).click();
        //2
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"lVjWed\"]")).click();
        //)
        driver.findElement(By.cssSelector("div[aria-label=\"закрывающая скобка\"]")).click();
        //*
        driver.findElement(By.cssSelector("div[aria-label=\"умножение\"]")).click();
        //3
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"KN1kY\"]")).click();
        //-
        driver.findElement(By.cssSelector("div[aria-label=\"вычитание\"]")).click();
        //4
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"xAP7E\"]")).click();
        //0
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"bkEvMb\"]")).click();
        //:
        driver.findElement(By.cssSelector("div[aria-label=\"деление\"]")).click();
        //5
        driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"Ax5wH\"]")).click();
        //=
        driver.findElement(By.cssSelector("div[aria-label=\"равно\"]")).click();
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =",driver.findElement(By.cssSelector("div [jsname=\"VkJw6\"] span")).getText());
        assertEquals("1",driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] span")).getText());


    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}