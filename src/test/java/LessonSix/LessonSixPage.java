package LessonSix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LessonSixPage {

    private WebDriver driver = new ChromeDriver();

    public LessonSixPage(WebDriver driver, Class<LessonSixPage> lessonSixPageClass) {
        this.driver = driver;
    }

    private By locator = (By.xpath("//*[@id=\"body\"]/div[3]/div[3]/div[2]/header/div[1]/button"));
    private By locator2 = (By.xpath("//*[@id=\"body\"]/div[3]/div[2]/div/div[2]/nav/ul/li[15]/a"));

    private By locator3 = (By.cssSelector("[class=\"rubric-header__link\"]"));

    public void open() {
        driver.get("https://lenta.ru/");
    }

    public void getStarted() throws InterruptedException {
        driver.findElement(locator).click();
        Thread.sleep(1000);
        driver.findElement(locator2).click();
        Thread.sleep(1000);
        driver.findElement(locator3);
//        webElement3.click();



    }

    private By element = (By.id("draggable"));
    private By element2 = (By.id("droppable"));


    public void getStarted2 ()  {
        driver.findElement(element);
        driver.findElement(element2);
    }
    public void open2() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
    }
}
