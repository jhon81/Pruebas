package principal;
import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Prueba {

	private WebDriver driver;
	private WebElement completo;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		
		driver.findElement(By.linkText("Empleos")).click();
		WebElement search_keywords = driver.findElement(By.name("search_keywords"));
		search_keywords.sendKeys("automatizador");
		WebElement search_location = driver.findElement(By.name("search_location"));
		search_location.sendKeys("Bogota");
		driver.findElement(By.xpath("//div[@id='content']/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li[2]/a/div/div/span")).click();
		driver.findElement(By.xpath("//div[2]/input")).click();
	   	driver.findElement(By.xpath("//article[@id='post-10723']/div/div[2]/div[2]/input")).click();
	   	WebElement nombrecompleto = driver.findElement(By.id("nombre-completo"));
		search_keywords.sendKeys("JUAN SANCHEZ");
		WebElement correoelectronico = driver.findElement(By.id("correo-electronico"));
		search_keywords.sendKeys("JUAN@GMAIL.COM");
		WebElement celulartelefonocontacto = driver.findElement(By.id("celular-o-telefono-de-contacto"));
		search_keywords.sendKeys("3154821160");
		WebElement estudiosformales = driver.findElement(By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente"));
		search_keywords.sendKeys("Profesional");
		WebElement experiencia = driver.findElement(By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica"));
		search_keywords.sendKeys("2 años");
		WebElement automatizacion = driver.findElement(By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica"));
		search_keywords.sendKeys("Basico me gutaria aprender");
		WebElement salario = driver.findElement(By.id("\"cual-es-tu-aspiracion-salarial\""));
		search_keywords.sendKeys("10.000.000");
		WebElement TiempoIngreso = driver.findElement(By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias"));
		search_keywords.sendKeys("1 semana");
		WebElement mensajeadiciona = driver.findElement(By.id("mensaje-adiciona"));
		search_keywords.sendKeys("");
		driver.findElement(By.cssSelector(".application_button")).click();
		
		
	}

}
