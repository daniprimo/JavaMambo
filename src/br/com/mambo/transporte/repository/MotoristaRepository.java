package br.com.mambo.transporte.repository;

import java.util.List;

import br.com.mambo.transporte.model.Motorista;

public interface MotoristaRepository {

	public Motorista save(Motorista salvarNovoMotorista);
	public Motorista findByName(String nome);
	public List<Motorista> findAll();


	
}
