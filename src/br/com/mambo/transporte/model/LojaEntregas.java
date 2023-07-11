package br.com.mambo.transporte.model;

import java.time.LocalDate;

public class LojaEntregas {
	
	private String id;
	
	private Loja loja;
	
	private String quantidadeDePalletFlv;
	
	private String quantidadeDePalletMercearia;
	
	private String quantidadeDePalletFriozem;
	
	private LocalDate data = LocalDate.now();

	public LojaEntregas(Loja loja, String quantidadeDePalletFlv, String quantidadeDePalletMercearia,
			String quantidadeDePalletFriozem) {
		super();
		this.loja = loja;
		this.quantidadeDePalletFlv = quantidadeDePalletFlv;
		this.quantidadeDePalletMercearia = quantidadeDePalletMercearia;
		this.quantidadeDePalletFriozem = quantidadeDePalletFriozem;
	}
	
	
}
