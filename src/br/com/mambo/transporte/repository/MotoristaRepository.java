package br.com.mambo.transporte.repository;

import br.com.mambo.transporte.model.Motorista;

public interface MotoristaRepository {

	public Motorista save(Motorista salvarNovoMotorista);
	public Motorista findByName(String nome);
	public Motorista findAll();


	
}
