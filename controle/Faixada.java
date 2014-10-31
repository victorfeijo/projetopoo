package controle;
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
	
	public static Funcionario getUsuarioAtual(){
		return usuarioAtual;
	}
	
	
	

}
