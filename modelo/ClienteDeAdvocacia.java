package modelo;

import java.util.List;

public class ClienteDeAdvocacia implements Cliente {

	public ClienteDeAdvocacia(String nome, String telefone, String cpf, String rg, String endereco, String email) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.email = email;
	}

	@Override
	public List<Processo> getProcessos() {
		return this.processos;
	}

	@Override
	public void receberProcesso(Processo processo) {
		this.processos.add(processo);

	}
	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getEmail() {
		return this.email;
	}

	private String nome;
	private String telefone;
	private String cpf;
	private String rg;
	private String endereco;
	private String email;
	private List<Processo> processos;

}
