package modelo;

public class FuncionarioComum implements Funcionario {
	
	FuncionarioComum(String nome, String login, String senha){
		
		this.nome = nome;
		this.login = login;
		this.hashSenha = Criptografia.criptografar(senha);
		
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String getLogin() {
		return login;
	}
	@Override
	public boolean getAutenticavel(String senha) {
		return hashSenha.equals(Criptografia.criptografar(senha));
	}
	
	private String nome;
	private String login;
	private String hashSenha;
	

}
