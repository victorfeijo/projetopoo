package modelo;

public interface Processo {
	
	public String getNumero();
	public Datas getDatasDoProcesso();         // - Data de Ajuizamento e Audiencias
	public ParteContraria getParteContraria(); // - nome -cpf -endereço
	public String getTipoDaAcao();
	public String getVara();
	public String getComarca();
	public String getValorDaCausa();
	public Pagamento getPagamento();          //- Parcelas - setPago, getPagamentoTotal, observacoes
	public String getObservacoes();
	public void setObservacoes(String observacoes);
	

}
