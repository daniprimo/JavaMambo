package br.com.mambo.transporte.dao;

import java.util.List;

import br.com.mambo.transporte.model.EntregaSaida;

public interface EntregaSaidaDAO {
	public EntregaSaida addMotorista(EntregaSaida entregaSaida);

	public EntregaSaida buscarPorNome(String name);

	public List<EntregaSaida> buscarTodos();

}
