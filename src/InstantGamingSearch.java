import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstantGamingSearch {
   public static void main(String[] args) {
      // Configurar el sistema para usar el controlador de Chrome
      System.setProperty("webdriver.chrome.driver","driver/chromedriver");

      // Crear una instancia del controlador de Chrome
      WebDriver driver = new ChromeDriver();

      // Navegar a la página de Instant Gaming en español
      driver.get("https://www.instant-gaming.com/es/");

      // Encontrar el campo de búsqueda y escribir el nombre del producto
      WebElement searchBox = driver.findElement(By.name("q"));
      searchBox.sendKeys("Nombre del producto");

      // Encontrar el botón de búsqueda y hacer clic en él
      WebElement searchButton = driver.findElement(By.cssSelector("button.searchbar-btn"));
      searchButton.click();

      // Esperar a que la página de resultados de búsqueda se cargue completamente
      // Esto puede variar según la velocidad de la conexión a Internet y el rendimiento del sitio web
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // Cerrar el controlador de Chrome
      driver.quit();
   }
}
