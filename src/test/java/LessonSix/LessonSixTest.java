package LessonSix;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import javax.naming.InitialContext;
import java.util.concurrent.TimeUnit;

public class LessonSixTest {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void Setup() {
        System.out.println("test start");
    }


    @AfterTest
    public void Finish() {
        System.out.println("test finish");
        driver.quit();
    }

    @Test
    void test1() {
        try {
            LessonSixPage lessonSixPage = new LessonSixPage(driver, LessonSixPage.class);
            lessonSixPage.open2();
            lessonSixPage.getStarted2();
//          driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void test2() throws InterruptedException {
        LessonSixPage lessonSixPage = new LessonSixPage(driver, LessonSixPage.class);
        lessonSixPage.open();
        lessonSixPage.getStarted();
        Thread.sleep(1000);


    }
}



