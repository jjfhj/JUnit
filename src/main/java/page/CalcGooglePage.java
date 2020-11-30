package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcGooglePage {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement searchInput;

    @FindBy(css = "div[aria-label=\"открывающая скобка\"]")
    public WebElement openBracket;

    @FindBy(css = "div[aria-label=\"закрывающая скобка\"]")
    public WebElement closingBracket;

    @FindBy(css = "div[aria-label=\"сложение\"]")
    public WebElement plus;

    @FindBy(css = "div[aria-label=\"вычитание\"]")
    public WebElement minus;

    @FindBy(css = "div[aria-label=\"умножение\"]")
    public WebElement multiply;

    @FindBy(css = "div[aria-label=\"деление\"]")
    public WebElement division;

    @FindBy(css = "div[aria-label=\"равно\"]")
    public WebElement equally;

    @FindBy(css = "div [class=\"PaQdxb A2W7l\"")
    public WebElement one;

    @FindBy(css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"lVjWed\"]")
    public WebElement two;

    @FindBy(css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"KN1kY\"]")
    public WebElement three;

    @FindBy(css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"xAP7E\"]")
    public WebElement four;

    @FindBy(css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"Ax5wH\"]")
    public WebElement five;

    @FindBy(css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"abcgof\"]")
    public WebElement six;

    @FindBy(css = "div[aria-label=\"синус\"]")
    public WebElement sin;


    public CalcGooglePage(WebDriver driver) {
        initElements(driver,     this);
    }
}


//        driver.findElement(By.cssSelector("div[aria-label=\"открывающая скобка\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"синус\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"деление\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"умножение\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"Вычитание\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"сложение\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"равно\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"закрывающая скобка\"]")).click();
//                driver.findElement(By.cssSelector("div[aria-label=\"открывающая скобка\"]")).click();
//                //0
//                driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"bkEvMb\"]")).click();
//                //1
//                driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"N10B9\"]")).click();
//                //2
//                driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"lVjWed\"]")).click();
//                //3
//                driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"KN1kY\"]")).click();
//                //4
//                driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"xAP7E\"]")).click();
//                //5
//                driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"Ax5wH\"]")).click();
//                //6
//                driver.findElement(By.cssSelector("div [class=\"PaQdxb A2W7l\"] [jsname=\"abcgof\"]")).click();