package modelo;

import java.util.ArrayList;
import java.util.List;

public class EscritorioDeAdvocacia implements Escritorio {

	public EscritorioDeAdvocacia() {
		this.clientes = new ArrayList<Cliente>();
		this.processos = new ArrayList<Processo>();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	@Override
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	@Override
	public void adicionarProcesso(Processo processo) {
		processos.add(processo);

	}

	@Override
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);

	}

	@Override
	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente);

	}

	@Override
	public List<Cliente> getClientes() {
		return new ArrayList<Cliente>(this.clientes);
	}

	@Override
	public List<Cliente> getClientePorNome(String nome) {

		List<Cliente> clientesPorNome = new ArrayList<Cliente>();
		int tamanhoDoNome = nome.length();

		for (Cliente cliente : clientes) {
			if (cliente.getNome().substring(0, tamanhoDoNome)
					.equalsIgnoreCase(nome))
				clientesPorNome.add(cliente);
		}
		return clientesPorNome;
	}

	@Override
	public List<Cliente> getClientePorProcesso(String numeroProcesso) {

		List<Cliente> clientesPorProcesso = new ArrayList<Cliente>();
		int tamanhoDoProcesso = numeroProcesso.length();

		for (Cliente cliente : clientes) {
			for (Processo processo : cliente.getProcessos()) {
				if (processo.getNumero().substring(0, tamanhoDoProcesso).equals(numeroProcesso)){
					System.out.println("Encontrei");
					clientesPorProcesso.add(cliente);
				}
			}
		}
		return clientesPorProcesso;
	}

	@Override
	public List<Cliente> getClientePorCpf(String cpf) {

		List<Cliente> clientesPorCpf = new ArrayList<Cliente>();
		int tamanhoDoCpf = cpf.length();

		for (Cliente cliente : clientes) {
			if (cliente.getCpf().substring(0, tamanhoDoCpf).equals(cpf))
				clientesPorCpf.add(cliente);
		}
		return clientesPorCpf;

	}
	
	public Cliente getClientePorCpfCompleto(String cpf){
		
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf))
				return cliente;
		}
		
		return null;
	}

	@Override
	public List<Processo> getProcessos() {
		return processos;
	}

	@Override
	public List<Processo> getProcessoPorNumero(String numero) {

		List<Processo> processoPorNumero = new ArrayList<Processo>();
		int tamanhoDoProcesso = numero.length();

		for (Processo processo : processos) {
			if (processo.getNumero().substring(0, tamanhoDoProcesso)
					.equals(numero))
				processoPorNumero.add(processo);
		}
		return processoPorNumero;
	}

	@Override
	public Funcionario getFuncionarioPorLogin(String login) {

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getLogin().equals(login)) {
				return funcionario;
			}
		}
		return null;
	}

	private List<Cliente> clientes;
	private List<Processo> processos;
	private List<Funcionario> funcionarios;

}
