package modelo;

public class ProcessoDeAdvocacia implements Processo {

	public ProcessoDeAdvocacia(String numero, String comarca, String vara,
			String tipoDaAcao, String valorDaCausa, String observacoes,
			Datas datasDoProcesso, Pagamento pagamentoDeProcesso, ParteContraria parteContraria) {
		
		this.numero = numero;
		this.comarca = comarca;
		this.vara = vara;
		this.tipoDaAcao = tipoDaAcao;
		this.valorDaCausa = valorDaCausa;
		this.observacoes = observacoes;
		this.datasDoProcesso = datasDoProcesso;
		this.pagamentoDeProcesso = pagamentoDeProcesso;
		this.parteContraria = parteContraria;

	}

	@Override
	public String getNumero() {
		return numero;
	}
	@Override
	public Datas getDatasDoProcesso() {
		return datasDoProcesso;
	}
	@Override
	public ParteContraria getParteContraria() {
		return parteContraria;
	}
	@Override
	public String getTipoDaAcao() {
		return tipoDaAcao;
	}
	@Override
	public String getVara() {
		return vara;
	}
	@Override
	public String getComarca() {
		return comarca;
	}
	@Override
	public String getValorDaCausa() {
		return valorDaCausa;
	}
	@Override
	public Pagamento getPagamento() {
		return pagamentoDeProcesso;
	}
	@Override
	public String getObservacoes() {
		return observacoes;
	}
	@Override
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	private String numero;
	private String comarca;
	private String vara;
	private String tipoDaAcao;
	private String valorDaCausa;
	private String observacoes;
	private Datas datasDoProcesso;
	private Pagamento pagamentoDeProcesso;
	private ParteContraria parteContraria;

}
