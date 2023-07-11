package br.com.mambo.transporte.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.mambo.transporte.model.Motorista;
import br.com.mambo.transporte.repository.MotoristaRepository;

public class SalvarMotoristaImplementacao implements MotoristaRepository{

	private List<Motorista> discoArmazenamento = new ArrayList<>();
	
	@Override
	public Motorista save(Motorista salvarNovoMotorista) {
			discoArmazenamento.add(salvarNovoMotorista);
			System.out.println("Salvo");
		return salvarNovoMotorista;
	}

	@Override
	public Motorista findByName(String nome) {
		return retornaMotoristaComNome(nome);
		
	}

	@Override
	public Motorista findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private Motorista retornaMotoristaComNome(String nome) {
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
