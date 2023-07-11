package br.com.mambo.transporte.dao;

import java.util.List;

import br.com.mambo.transporte.model.Motorista;

public interface MotoristaDAO extends TransporteDAO {

	public Motorista addMotorista(Motorista motorista);

	public Motorista buscarPorNome(String name);

	public List<Motorista> buscarTodos();

}
