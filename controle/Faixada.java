package controle;
import modelo.*;
import view.*;
import javax.swing.JOptionPane;

import exception.*;

public final class Faixada {

	private static final EscritorioDeAdvocacia escritorio = new EscritorioDeAdvocacia();
	private static Funcionario usuarioAtual = null;
	private static Cliente clienteAtual = null;
	
	public static void autentica(String login, String senha) throws SenhaInvalidaEX{
		
		Funcionario funcionario = escritorio.getFuncionarioPorLogin(login);
			if(funcionario == null){
				throw new SenhaInvalidaEX("Login Inválido");
			}
			if(funcionario.getAutenticavel(senha)){
				usuarioAtual = funcionario;
				GerenciadorDeJanelas.telaPrincipal();
			}
			else{
				throw new SenhaInvalidaEX("Senha Inválida");
			}
				
	}
	
	public static void cadastrarFuncionario(String nome, String login, String senha, String senhaAdm) throws SenhaInvalidaEX{
		
		Funcionario funcionario = null;
		
		if(Criptografia.criptografar(senhaAdm).equals("80177534A0C99A7E3645B52F2027A48B")){
			funcionario = new FuncionarioComum(nome, login, senha);
			escritorio.adicionarFuncionario(funcionario);
		}
		else{
			throw new SenhaInvalidaEX("Senha do Adm inválida");
		}
	}
	
	public static void cadastrarCliente(String nome, String cpf, String rg, String telefone, String endereco, String email) throws CampoVazioEX {
		
		if(nome.length() == 0)
			throw new CampoVazioEX("Preencher o campo Nome");
		if(cpf.length() == 0)
			throw new CampoVazioEX("Preencher o campo CPF/CNPJ");
		if(rg.length() == 0)
			throw new CampoVazioEX("Preencher o campo RG");
		if(telefone.length() == 0)
			throw new CampoVazioEX("Preencher o campo Telefone");
		if(endereco.length() == 0)
			throw new CampoVazioEX("Preencher o campo Endereço");
		if(email.length() == 0)
			throw new CampoVazioEX("Preencher o campo Email");
		else{
		Cliente cliente = new ClienteDeAdvocacia(nome, telefone, cpf, rg, endereco, email);
		escritorio.adicionarCliente(cliente);
		clienteAtual = cliente;
		}
	}
	
	public static void cadastrarProcesso(String numero, String comarca,  String tipoDaAcao,
			String valorDaCausa, String vara, boolean foiPago, double valorTotalPago,
			String parcelamento, String dataAjuizamento, String dataAudiencia, String nome,
			String cpf, String endereco, String obs) throws CampoVazioEX{
		
		Processo processo = new ProcessoDeAdvocacia(numero, comarca, vara, tipoDaAcao, valorDaCausa, obs,
				new Datas(dataAjuizamento,dataAudiencia), new PagamentoDeProcesso(foiPago, valorTotalPago, parcelamento),
				new ParteContraria(nome, cpf, endereco));
		escritorio.adicionarProcesso(processo);
	}

	public static Funcionario getUsuarioAtual(){
		return usuarioAtual;
	}
	
	
	

}
