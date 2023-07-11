package br.com.mambo.transporte.model;

import java.time.LocalDate;

public class Horarios {
	
	private LocalDate data;
	
	private String saidaCD;
	
	private String chegadaLoja;
	
	private String inicioDescarregamento;
	
	private String fimDoCarregamento;
	
	private String saidaLoja;
	
	private String chegadaCD;

	public void setData () {
		this.data = LocalDate.now();
	}

	
	
	

}
