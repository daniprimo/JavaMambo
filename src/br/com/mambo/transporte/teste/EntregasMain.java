package br.com.mambo.transporte.teste;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.mambo.transporte.gui.CadastrarViagemVisual;
import br.com.mambo.transporte.model.EntregaSaida;
import br.com.mambo.transporte.service.EntregasLojaService;

public class EntregasMain {
	
	public static void main(String[] args) {
		EntregaSaida entrega1 = new EntregaSaida("Em carregamento",
				"Daniel",
				"FDC1A50",
				"CD MAMBO",
				"",
				new ArrayList<>(Arrays.asList("M2 LEOPOLDINA", "M3 - Vila Romana")),
				"12:00");
		
		CadastrarViagemVisual visual = new CadastrarViagemVisual();
		
		EntregasLojaService service = new EntregasLojaService();
		System.out.println(service.addMotorista(entrega1));
	}
	

}
