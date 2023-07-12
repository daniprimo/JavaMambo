package br.com.mambo.transporte.repository;

import java.util.List;

import br.com.mambo.transporte.model.EntregaSaida;

public interface EntregasRepositroy {

	public EntregaSaida save(EntregaSaida entregaSaida);
	public EntregaSaida findByName(String nomeLoja);
	public List<EntregaSaida> findAll(); 
	
}
