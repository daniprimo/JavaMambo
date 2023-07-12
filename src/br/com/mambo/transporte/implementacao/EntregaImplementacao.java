package br.com.mambo.transporte.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.mambo.transporte.model.EntregaSaida;
import br.com.mambo.transporte.repository.EntregasRepositroy;

public class EntregaImplementacao implements EntregasRepositroy {
	
	
	private EntregaSaida entrega;
	private static List<EntregaSaida> discoArmazenamento = new ArrayList<>();
	
	
	@Override
	public EntregaSaida save(EntregaSaida entregaSaida) {
		int id = discoArmazenamento.size() + 1;
		entregaSaida.setId(id);
		discoArmazenamento.add(entregaSaida);
		return entregaSaida;
	}

	@Override
	public EntregaSaida findByName(String nomeLoja) {
		for (EntregaSaida entregaSaida : discoArmazenamento) {
			for (String nomeDaLojaDaEntrega : entregaSaida.getLojas()) {
				if (nomeDaLojaDaEntrega.equals(nomeLoja)) {
					entrega = entregaSaida;
				}
			}
		}
		return entrega;
	}

	@Override
	public List<EntregaSaida> findAll() {
		return discoArmazenamento;
	}

}
