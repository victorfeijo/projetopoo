package modelo;

public class PagamentoDeProcesso implements Pagamento {

	public PagamentoDeProcesso(boolean foiPago, double valorTotalPago,
			String parcelamento ) {
		
		this.foiPago = foiPago;
		this.valorTotalPago = valorTotalPago;
		this.parcelamento = parcelamento;

	}

	@Override
	public boolean getFoiPago() {
		return foiPago;
	}

	@Override
	public void setValorPago(double valor) {
		valorTotalPago += valor;
	}

	@Override
	public double getValorTotalPago() {
		return valorTotalPago;
	}

	@Override
	public String getParcelamento() {
		// TODO Auto-generated method stub
		return null;
	}


	private boolean foiPago;
	private double valorTotalPago;
	public String parcelamento;

}
