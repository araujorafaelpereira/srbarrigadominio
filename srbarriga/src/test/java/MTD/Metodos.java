package MTD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	WebDriver driver;
	public void abrirNavegador(String appUrl) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	
	
	}
	
	public void inseriDados(By elemento, String Texto) {
		driver.findElement(elemento).sendKeys(Texto);
		
	}
	public void clicar(By elemento) {
	  driver.findElement(elemento).click();
		
		
	}
	
	public void fecharNavegador() {
		
		driver.quit();
	}
	
	
	
	
	
}
