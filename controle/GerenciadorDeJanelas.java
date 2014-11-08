package controle;
import view.*;

public final class GerenciadorDeJanelas {
	
	public static void telaDeLogin(){
		Login2 application = new Login2();
		application.setVisible(true);
	}
	
	public static void telaCadastroFuncionario(){
		CriarUsuario2 application = new CriarUsuario2();
		application.setVisible(true);
	}
	
	public static void telaPrincipal(){
		Principal2 application = new Principal2();
		application.setVisible(true);
	}
	
	public static void telaCadastroDeCliente(){
		CadastrarCliente2 application = new CadastrarCliente2();
		application.setVisible(true);
	}
	
	public static void telaCadastroDeProcesso(){
		CadastrarProcesso2 application = new CadastrarProcesso2();
		application.setVisible(true);
	}
	

}
