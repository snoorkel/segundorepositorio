package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class CucumberDemoQa {
	Metodos metodos= new Metodos();
	Elementos el= new Elementos();
String name = "Teste";
	@Before
	public void iniciarTeste() {
Executa.abrirNavegador();
	}
@After
	public void finalizarTeste() {
	Executa.fecharNavegador();
}
	
	@Given("que esteja no formulario")
	
	public void queEstejaNoFormulario() throws InterruptedException {
    metodos.scroll(0, 350);
		metodos.clicar(el.menuElements);
	metodos.clicar("span","Text Box");
	}

	@When("preencher as informacoes")
	public void preencherAsInformacoes() {
metodos.escrever(el.userName,this.name);
metodos.escrever(el.userEmail,"Teste@teste.com");	
metodos.escrever(el.currentAdress,"teste aaddress");
metodos.escrever(el.permanentAddress,"permanentAddress");	
metodos.scroll(0, 300);	
	metodos.clicar(el.btnsubmit);
	}

	@Then("formulario enviado")
	public void formularioEnviado() throws IOException {
metodos.validarTexto(el.resultName, this.name);
	metodos.screenShot("CT01 Confirmando Cadastro");
	}

}
