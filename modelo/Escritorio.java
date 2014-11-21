package modelo;

import java.util.List;


public interface Escritorio {
	public void adicionarCliente(Cliente cliente);
	public void adicionarProcesso(Processo processo);
	public void adicionarFuncionario(Funcionario funcionario);
	public void removerCliente(Cliente cliente);
	public List<Cliente> getClientes();
	public List<Cliente> getClientePorNome(String nome);
	public List<Cliente> getClientePorProcesso(String numeroProcesso);
	public List<Cliente> getClientePorCpf(String cpf);
	public List<Processo> getProcessos();
	public List<Processo> getProcessoPorNumero(String numero);
	public Funcionario getFuncionarioPorLogin(String login);

}
