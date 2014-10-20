package modelo;

public class ParteContraria {
	
	public ParteContraria(String nome, String cpf, String endereco){
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}


	private String nome;
	private String cpf;
	private String endereco;
	

}
