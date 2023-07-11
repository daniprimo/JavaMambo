package br.com.mambo.transporte.service;

import java.util.List;

import br.com.mambo.transporte.dao.MotoristaDAO;
import br.com.mambo.transporte.implementacao.SalvarMotoristaImplementacao;
import br.com.mambo.transporte.model.Motorista;
import br.com.mambo.transporte.repository.MotoristaRepository;

public class MotoristaService implements MotoristaDAO {

	private MotoristaRepository arquivo;

	@Override
	public Motorista addMotorista(Motorista motorista) {
		arquivo = new SalvarMotoristaImplementacao();
		validarCamposDoMotorista(motorista);
		return arquivo.save(motorista.salvarNovoMotorista());
	}

	@Override
	public Motorista buscarPorNome(String name) {
		return arquivo.findByName(name);
	}

	@Override
	public List<Motorista> buscarTodos() {
		return arquivo.findAll();
	}
	
	private void validarCamposDoMotorista(Motorista motorista) {
		try {
			verificandoSeOsCamposEstaoNulos(motorista);
		} catch (IllegalArgumentException e) {
			System.out.println("LOG ERRO - "+ e.getMessage());
		}
	}

	private void verificandoSeOsCamposEstaoNulos(Motorista motorista) {
		if (motorista.getNome() == null) {
			throw new IllegalArgumentException("Campo 'nome' obrigatorio.");
		}
		
		if (motorista.getNomeCompleto() == null) {
			throw new IllegalArgumentException("Campo 'nome completo' obrigatorio.");
		} 

	}

	
		
	


}
