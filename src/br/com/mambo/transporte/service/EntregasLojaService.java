package br.com.mambo.transporte.service;

import java.util.List;

import br.com.mambo.transporte.dao.EntregaSaidaDAO;
import br.com.mambo.transporte.implementacao.EntregaImplementacao;
import br.com.mambo.transporte.model.EntregaSaida;
import br.com.mambo.transporte.repository.EntregasRepositroy;

public class EntregasLojaService implements EntregaSaidaDAO {
	
	private EntregasRepositroy entregasRepositroy = new EntregaImplementacao();
	
	
	
	@Override
	public EntregaSaida addMotorista(EntregaSaida entregaSaida) {
		return entregasRepositroy.save(entregaSaida);
	}

	@Override
	public EntregaSaida buscarPorNome(String name) {
		return entregasRepositroy.findByName(name);
	}

	@Override
	public List<EntregaSaida> buscarTodos() {
		return entregasRepositroy.findAll();
	}
	
	

}
