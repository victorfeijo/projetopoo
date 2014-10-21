package controle;
import view.*;

public final class GerenciadorDeJanelas {
	
	public static void telaDeLogin(){
		Login2 application = new Login2();
		application.setVisible(true);
	}
	
	public static void telaCadastroFuncionario(){
		CriarUsuario application = new CriarUsuario();
		application.setVisible(true);
	}
	

}
