package steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import driver.Drivers;
import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class ValidarMenuTeste extends Drivers {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void iniciar() {
		Executa.abrirNavegador();

	}

	@After
	public void fim() {
	Executa.fecharNavegador();
	}

	@Given("que eu acesso o site da Rappi")
	public void queEuAcessoOSiteDaRappi() throws InterruptedException, IOException {
		String title = driver.getTitle();
		assertEquals("Delivery de Comida e Mercado em Minutos na sua Casa | Rappi Brasil", title);
		Thread.sleep(2000);
		metodo.evidencia("CT01 Validar acesso ao site Rappi");

	}

	@When("clico no icone do menu representado por tres riscos na horizontal")
	public void clicoNoIconeDoMenuRepresentadoPorTresRiscosNaHorizontal() throws InterruptedException, IOException {

		metodo.clicar(el.btnMenu);
		Thread.sleep(2000);
		metodo.evidencia("CT02 Validar barra de Menu");
	

	}

	@When("clico no botao Conheca nossos descontos")
	public void clicoNoBotaoConhecaNossosDescontos() throws InterruptedException {
		
		metodo.clicar(el.btnDescontos);
		Thread.sleep(2000);
		

	}
	
	@Then("valido a pagina de promocoes")
	public void validoAPaginaDePromocoes() throws IOException {
		
		String pgDesconto = driver.findElement(By.xpath("//h1[text()='Descontos e Ofertas']")).getText();
        assertEquals("Descontos e Ofertas", pgDesconto);
        
        metodo.evidencia("CT03 Validar pagina de desconto");

		
	}

}
