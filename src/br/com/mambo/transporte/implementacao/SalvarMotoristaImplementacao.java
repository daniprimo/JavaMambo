package br.com.mambo.transporte.implementacao;

import br.com.mambo.transporte.model.Motorista;
import br.com.mambo.transporte.repository.SalvarNoArquivo;

public class SalvarMotoristaImplementacao implements SalvarNoArquivo{

	@Override
	public Motorista salvar(Motorista salvarNovoMotorista) {
			System.out.println("Salvo");
		return salvarNovoMotorista;
	}

}
