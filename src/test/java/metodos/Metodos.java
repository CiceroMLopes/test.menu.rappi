package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.Drivers;

public class Metodos extends Drivers{
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void evidencia(String nomeEvidencia) throws IOException {
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/"+nomeEvidencia+".png");
		FileUtils.copyFile(scrFile, destFile);
	}

}
