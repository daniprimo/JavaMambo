package br.com.mambo.transporte.model;

import java.util.List;

public class Viagem {
	
	private String id;
	
	private String status;
	
	private Motorista motorista;
	
	private Veiculo veiculo;
	
	private Origem origem;
	
	private Ajudante ajudante;
	
	private List<LojaEntregas> lojas;
	
	private Horarios horarios;
	
	
	public Viagem ProgramarViagem (String id, Motorista motorista, Origem origem, LojaEntregas lojas) {
		Viagem viagemProgramada = new Viagem();
		viagemProgramada.id = id;
		viagemProgramada.motorista = motorista;
		viagemProgramada.origem = origem;
		viagemProgramada.lojas.add(lojas);		
		viagemProgramada.horarios.setData();
		return viagemProgramada;
	}

	public Viagem ProgramarViagem (Motorista motorista, Origem origem, List<LojaEntregas> lojas) {
		Viagem viagemProgramada = new Viagem();
		viagemProgramada.motorista = motorista;
		viagemProgramada.origem = origem;
		viagemProgramada.lojas.addAll(lojas);
		viagemProgramada.horarios.setData();
		return viagemProgramada;
	}


}
