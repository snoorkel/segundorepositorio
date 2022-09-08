package elementos;

import org.openqa.selenium.By;

public class Elementos {
//***** Dados Pessoas*****
	public By nomeCompleto= By.name("name");
	public By cpf=By.name("cpf");
	public By email=By.name("email");
	public By whatsapp=By.name("whatsapp");



//*****Dados de endereço******

public By cep= By.name("postalcode");
public By btnBuscarcep= By.xpath("//input[@value='Buscar CEP']");
public By numero = By.name("address-number");
public By complemento= By.name("address-details");


//***** Metodos de entrega******

public By moto = By.xpath("//span[text()='Moto']");
public By vanCarro = By.xpath("//span[text()='Van/Carro']");
public By bicicleta = By.xpath("//span[text()='bicicleta']");



//***** Anexar CNH*****
public By anexarCnh = By.xpath("//*[text()='Foto da sua CNH']");


// ***** Confirmacao cadastro******
public By btnConfirmacaoCadastro = By.xpath("//*[text()='Cadastre-se para fazer entregas']");

//*****Mensagens
public By msgConfirDadosRec= By.id("swal12-html-contains");
public By msgSemAnexo= By.xpath("//span[text()'Adicione uma foto da sua CNH']");
}



