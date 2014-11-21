package modelo;

import java.util.List;

public interface Cliente {
	public List<Processo> getProcessos();
	public void receberProcesso( Processo processo );
	public String getNome();
	public String getTelefone();
	public String getCpf();
	public String getRg();
	public String getEndereco();
	public String getEmail();
	
}
