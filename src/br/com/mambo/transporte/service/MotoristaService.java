package br.com.mambo.transporte.service;

import br.com.mambo.transporte.dao.MotoristaDAO;
import br.com.mambo.transporte.implementacao.SalvarMotoristaImplementacao;
import br.com.mambo.transporte.model.Motorista;
import br.com.mambo.transporte.repository.SalvarNoArquivo;

public class MotoristaService implements MotoristaDAO {

	private SalvarNoArquivo arquivo;

	@Override
	public Motorista addMotorista(Motorista motorista) {
		arquivo = new SalvarMotoristaImplementacao();
		validarCamposDoMotorista(motorista);
		return arquivo.salvar(motorista.salvarNovoMotorista());
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
