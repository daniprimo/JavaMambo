package br.com.mambo.transporte.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.mambo.transporte.model.Motorista;
import br.com.mambo.transporte.repository.MotoristaRepository;

public class SalvarMotoristaImplementacao implements MotoristaRepository{

	private static List<Motorista> discoArmazenamento = new ArrayList<>();
	
	@Override
	public Motorista save(Motorista salvarNovoMotorista) {
			discoArmazenamento.add(salvarNovoMotorista);
			System.out.println("Salvo");
		return salvarNovoMotorista;
	}

	@Override
	public Motorista findByName(String nome) {
		return retornaMotoristaPorNome(nome);
		
	}

	@Override
	public List<Motorista> findAll() {
		return discoArmazenamento;
	}
	
	
	private Motorista retornaMotoristaPorNome(String nome) {
		try {
			return buscandoNoArquivoPorNome(nome);
		} catch (final Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return null;
		
	}

	private Motorista buscandoNoArquivoPorNome(String nome) throws Exception {
		for (Motorista motorista : discoArmazenamento) {
			if (nome.equals(motorista.getNome())){
				return motorista;
			}
		}
		
		throw new Exception("LOG Motorista Implementacao Motorista não encontrato.");
	}


}
