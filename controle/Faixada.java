package controle;
import java.util.List;

import modelo.*;
import view.*;
import javax.swing.JOptionPane;

import exception.CampoVazioEX;
import exception.SenhaInvalidaEX;

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
	
	public static void cadastrarCliente(String nome, String cpf, String rg, String telefone, String endereco, String email) throws CampoVazioEX{
		
		if(nome.length() == 0)
			throw new CampoVazioEX("Completo o campo Nome corretamente");
		if(cpf.length() == 0)
			throw new CampoVazioEX("Completo o campo CPF/CNPJ corretamente");
		if(cpf.length() != 11)
			throw new CampoVazioEX("Completo o campo CPF/CNPJ corretamente");
		if(!escritorio.getClientePorCpf(cpf).isEmpty())
			throw new CampoVazioEX("O CPF/CNPJ " + cpf + " já está cadastrado");
		if(rg.length() == 0)
			throw new CampoVazioEX("Completo o campo RG corretamente");
		if(telefone.length() == 0)
			throw new CampoVazioEX("Completo o campo Telefone corretamente");
		if(endereco.length() == 0)
			throw new CampoVazioEX("Completo o campo Endereço corretamente");
		if(email.length() == 0)
			throw new CampoVazioEX("Completo o campo Email corretamente");
		else{
		Cliente cliente = new ClienteDeAdvocacia(nome, telefone, cpf, rg, endereco, email);
		escritorio.adicionarCliente(cliente);
		clienteAtual = cliente;
		}
	}
	
	public static void cadastrarProcesso(String numero, String comarca,  String tipoDaAcao,
			String valorDaCausa, String vara, boolean foiPago, double valorTotalPago,
			String parcelamento, String dataAjuizamento, String dataAudiencia, String nome,
			String cpf, String endereco, String obs){
		
		Processo processo = new ProcessoDeAdvocacia(numero, comarca, vara, tipoDaAcao, valorDaCausa, obs,
				new Datas(dataAjuizamento,dataAudiencia), new PagamentoDeProcesso(foiPago, valorTotalPago, parcelamento),
				new ParteContraria(nome, cpf, endereco));
		escritorio.adicionarProcesso(processo);
		clienteAtual.receberProcesso(processo);
	}
	
	public static Funcionario getUsuarioAtual(){
		return usuarioAtual;
	}
	
	public static Cliente clienteCpfCompleto(String textField){
		return escritorio.getClientePorCpfCompleto(textField);
	}

	public static List<Cliente> procurarNome(String textField)  {
		return escritorio.getClientePorNome(textField);
		
	}
	public static List<Cliente> procurarCpf(String textField)  {
		return escritorio.getClientePorCpf(textField);

	}
	public static List<Cliente> procurarProcesso(String textField)  {
		return escritorio.getClientePorProcesso(textField);
		
	}
	public static void removerCliente(Cliente cliente){
		escritorio.removerCliente(cliente);
	}
	public static void setClienteAtual(Cliente cliente){
		clienteAtual = cliente;
	}
	public static Cliente getClienteAtual(){
		return clienteAtual;
	}
	
	

}
