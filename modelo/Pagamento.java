package modelo;

public interface Pagamento {
	
	public boolean getFoiPago();
	public void setValorPago(double valor);
	public double getValorTotalPago();
	public String getParcelamento();

}
