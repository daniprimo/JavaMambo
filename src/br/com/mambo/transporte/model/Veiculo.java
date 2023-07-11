package br.com.mambo.transporte.model;



public class Veiculo {

	private String placa;
	
	private String tipoVeiculo;
	
	private int limiteDePallets;

	public Veiculo(String placa, String tipoVeiculo, int limiteDePallets) {
		super();
		this.placa = placa;
		this.tipoVeiculo = tipoVeiculo;
		this.limiteDePallets = limiteDePallets;
	}

	public String getPlaca() {
		return placa;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public int getLimiteDePallets() {
		return limiteDePallets;
	}
	
	
	
	
}
