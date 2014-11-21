package controle;
import modelo.Cliente;
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
	
	public static void telaDeEventos(){
		Eventos application = new Eventos();
		application.setVisible(true);
	}

	public static void telaDeProcura() {
		ProcurarCliente application = new ProcurarCliente();
		application.setVisible(true);
		
	}
	
<<<<<<< HEAD
	public static void telaDeDetalhes() {
		DetalhesCliente application = new DetalhesCliente();
=======
	public static void telaDeDetalhes(Cliente clientes) {
		DetalhesCliente application = new DetalhesCliente(clientes);
>>>>>>> 2ce48b1f41e53c6e458253161c2ab3c1388bf5ae
		application.setVisible(true);
	}

}
