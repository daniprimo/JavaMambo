package br.com.mambo.transporte;

import br.com.mambo.transporte.dao.MotoristaDAO;
import br.com.mambo.transporte.model.Motorista;
import br.com.mambo.transporte.service.MotoristaService;

public class Principal {
	public static void main(String[] args) {
		Motorista motorista = new Motorista("Daniel", "Daniel Lopes", "11 98878-4548");
		Motorista motorista2 = new Motorista("Valderim", "Valderim Carvalho", "11 98878-4548");

		MotoristaDAO dao = new MotoristaService();
		System.out.println(dao.addMotorista(motorista));
		System.out.println(dao.addMotorista(motorista2));
		
		System.out.println(dao.buscarPorNome("Valderim"));
		System.out.println("--------");
		System.out.println(dao.buscarTodos());
		
		
		
	}
}
