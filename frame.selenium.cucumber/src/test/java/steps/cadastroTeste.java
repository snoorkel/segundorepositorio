package steps;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.Executa;

public class cadastroTeste {
Metodos metodos= new Metodos();
Elementos elemento = new Elementos();	
@Dado("que esteja na tela de cadastro")
	public void queEstejaNaTelaDeCadastro() {
    Executa.abrirnavegador();
	}

	@Dado("preencha dados pessoais validos")
	public void preenchaDadosPessoaisValidos() {
    metodos.preencher(elemento.nomeCompleto, "Felawi", "preenchendo o campo nome");
	metodos.preencher(elemento.cpf, "19788734090", "preenchendo o campo cpf");
	metodos.preencher(elemento.email, "Felawi2034@gmail.com", "preenchendo o campo email");
	metodos.preencher(elemento.whatsapp, "11961726325", "preenchendo o campo whatsapp");
	}

	@Dado("preencha endereco valido")
	public void preenchaEnderecoValido() {
metodos.preencher(elemento.cep,"06544300","preenchendo o cep");
metodos.preencher(elemento.numero, "45", "preenchendo o campo numero");
metodos.preencher(elemento.complemento, "1302", "preenchendo o complemento");
metodos.clicar(elemento.btnBuscarcep, "clicando no botao para buscar o cep");	
	}

	@Dado("selecione tipo de veiculo")
	public void selecioneTipoDeVeiculo() {
   metodos.clicar(elemento.moto,"escolhendo o tipo moto");
	
	}

	@Quando("envie a foto da cnh valida")
	public void envieAFotoDaCnhValida()  {
metodos.clicar(elemento.anexarCnh, "abrindo a opcao para buscar a cnh");
	metodos.uploadArquivo("anexando um jpg da cnh");
	}

	@Entao("clicar em cadastre-se para fazer entregas")
	public void clicarEmCadastreSeParaFazerEntregas() {
metodos.clicar(elemento.btnConfirmacaoCadastro, "clicando no botao para confirmar o cadastro");
	}

	@Entao("valido cadastro realizado com sucesso")
	public void validoCadastroRealizadoComSucesso() {
metodos.validarTexto(elemento.msgConfirDadosRec,"Recebemos os seus dados","validando o texto de confirmação");
	metodos.fecharNavegador();
	}

	@Quando("eu clicar em cadastra-se para entrega de bicicleta")
	public void euClicarEmCadastraSeParaEntregaDeBicicleta() {

	}

	@Entao("eu valido as informacoes")
	public void euValidoAsInformacoes() {

	}

	@Quando("eu clicar em cadastra-se para entrega de van")
	public void euClicarEmCadastraSeParaEntregaDeVan() {

	}

	@Dado("escolher mais de um metodo de entrega")
	public void escolherMaisDeUmMetodoDeEntrega() {

	}

	@Quando("clico em cadastra-se")
	public void clicoEmCadastraSe() {

	}

	@Entao("eu valido mensagem de erro sobre a obrigatoriedade do metodo de entrega")
	public void euValidoMensagemDeErroSobreAObrigatoriedadeDoMetodoDeEntrega() {

	}

	@Dado("nao informo nenhum dado obrigatorio")
	public void naoInformoNenhumDadoObrigatorio() {

	}

	@Quando("cliclo em cadastra-se")
	public void clicloEmCadastraSe() {

	}

	@Entao("valido mensagens nos campos indicando obrigatoriedade do preenchimento")
	public void validoMensagensNosCamposIndicandoObrigatoriedadeDoPreenchimento() {

	}

	@Dado("informo dado obrigatorios invalidos")
	public void informoDadoObrigatoriosInvalidos() {

	}

	@Entao("valido mensagens nos campos indicando dados invalidos")
	public void validoMensagensNosCamposIndicandoDadosInvalidos() {

	}

	@Dado("preencho os campos obrigatorios")
	public void preenchoOsCamposObrigatorios() {
		
	}

	@Dado("nao anexo a cnh")
	public void naoAnexoACnh() {
		
	}

	@Entao("valido mensagem de erro sobre a obrigatoriedade do anexo")
	public void validoMensagemDeErroSobreAObrigatoriedadeDoAnexo() {
metodos.validarTexto(elemento.msgSemAnexo, "Adicione uma foto da sua CNH","Validando mensagem de erro sobre o anexo");
	}

	@Dado("nao informo nenhum metodo de entrega")
	public void naoInformoNenhumMetodoDeEntrega() {

	}

	@Entao("valido mensagens de erro sobre a obrigatoriedade de um metodo")
	public void validoMensagensDeErroSobreAObrigatoriedadeDeUmMetodo() {

	}

	@Dado("nao preencho o campo nome")
	public void naoPreenchoOCampoNome() {

	}

	@Entao("valido a mensagem campo nome obrigatorio")
	public void validoAMensagemCampoNomeObrigatorio() {

	}

}
