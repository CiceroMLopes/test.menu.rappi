package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = "steps", tags = "@descontos", dryRun = false, monochrome = false, plugin = {
		"pretty", "html:target/report-cucumber.html" }, snippets = SnippetType.CAMELCASE)
public class Executa extends Drivers {

	public static void abrirNavegador() {

		boolean headless = false;

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		if (headless) {
			chromeOptions.addArguments("--headless");
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.rappi.com.br");

	}
	
	public static void fecharNavegador() {
		driver.quit();
		
	}

}
