package br.com.mambo.transporte.repository;

import java.util.List;

import br.com.mambo.transporte.model.Veiculo;

public interface VeiculoRepository {
	
	public Veiculo save();
	public Veiculo findByPlaca(String placa);
	public List<Veiculo> findAll();
	public List<Veiculo> findByTipo(String tipoDoVeiculo);
}
