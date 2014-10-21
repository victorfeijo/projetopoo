package controle;
import modelo.*;
import view.*;
import javax.swing.JOptionPane;

import exception.SenhaInvalidaEX;

public final class Faixada {

	private static final EscritorioDeAdvocacia escritorio = new EscritorioDeAdvocacia();
	private static String usuarioAtual = "Nenhum Usuário";
	
	public static void autentica(String login, String senha) throws SenhaInvalidaEX{
		
		Funcionario funcionario = escritorio.getFuncionarioPorLogin(login);
			if(funcionario == null){
				throw new SenhaInvalidaEX("Login Inválido");
			}
			if(funcionario.getAutenticavel(senha)){
				usuarioAtual = funcionario.getNome();
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
	
	public static String getUsuarioAtual(){
		return usuarioAtual;
	}
	
	
	

}
