package controle;
import java.util.List;

import modelo.*;
import view.*;
import javax.swing.JOptionPane;

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
	
	public static void cadastrarCliente(String nome, String cpf, String rg, String telefone, String endereco, String email){
		
		Cliente cliente = new ClienteDeAdvocacia(nome, telefone, cpf, rg, endereco, email);
		escritorio.adicionarCliente(cliente);
		clienteAtual = cliente;
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
		Cliente cliente = escritorio.getClientePorCpfCompleto(textField);
		return cliente;
	}

	public static List<Cliente> procurarNome(String textField)  {
		List<Cliente> clientes = escritorio.getClientePorNome(textField);
		return clientes;
		
	}
	public static List<Cliente> procurarCpf(String textField)  {
		List<Cliente> clientes = escritorio.getClientePorCpf(textField);
		return clientes;

	}
	public static List<Cliente> procurarProcesso(String textField)  {
		List<Cliente> clientes = escritorio.getClientePorProcesso(textField);
		return clientes;
		
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
