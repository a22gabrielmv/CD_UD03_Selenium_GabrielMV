import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App2 {
    @Test
    public void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");  
    WebDriver driver = new ChromeDriver(); 

    try {

        Thread.sleep(3000);

        driver.get("https://www.instant-gaming.com/es/");
        WebElement cajaBusqueda =  driver.findElement(By.id("ig-header-search-box-input"));
        cajaBusqueda.sendKeys("Selenium");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("ig-header-search-box-input")).click();

        cajaBusqueda = driver.findElement(By.id("ig-header-search-box-input"));

        cajaBusqueda.sendKeys("Among us");
        cajaBusqueda.sendKeys(Keys.ENTER);

        assertEquals("Among us", cajaBusqueda);

        Thread.sleep(3000);
        
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    driver.quit();
}
   

}