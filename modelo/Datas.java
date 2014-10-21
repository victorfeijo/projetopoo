package modelo;

public class Datas {
	
	public Datas(String dataDeAjuizamento, String dataDeAudiencia){
		
		this.dataDeAjuizamento = dataDeAjuizamento;
		this.dataDeAudiencia = dataDeAudiencia;
		
	}
	
	public String getDataDeAudiencia() {
		return dataDeAudiencia;
	}
	public void setDataDeAudiencia(String dataDeAudiencia) {
		this.dataDeAudiencia = dataDeAudiencia;
	}
	public String getDataDeAjuizamento() {
		return dataDeAjuizamento;
	}

	private String dataDeAjuizamento;
	private String dataDeAudiencia;
	
}
