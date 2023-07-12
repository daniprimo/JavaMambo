package br.com.mambo.transporte.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CadastrarViagemVisual extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton botaoAdicionar = new JButton();
	private JButton botaoLimpar = new JButton();
	
	private JLabel tituloCentral = new JLabel();
	private JLabel tituloHorario = new JLabel();
	private JLabel tituloLoja = new JLabel();
	private JLabel tituloOrigem = new JLabel();
	
	private JTextField inputMotorista = new JTextField();
	private JTextField inputOrigem = new JTextField();
	private JTextField inputLojas = new JTextField();
	private JTextField inputHorario = new JTextField();
	
	private JTable tabela =  new JTable();
	JScrollPane barraRolagem;
	
	public CadastrarViagemVisual () {
		
		setVisible(true);
		setSize(800, 500);
		setTitle("Programação de carregamento e saidas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(null);
		
		tituloCentral.setText("Veiculo: ");
		tituloCentral.setBounds(20 ,40,100,20);
		inputMotorista.setBounds(80,40,100,20);
		
		add(tituloCentral);
		add(inputMotorista);
		 

		tituloOrigem.setText("Origem: ");
		tituloOrigem.setBounds(20 ,70,100,20);
		inputOrigem.setBounds(80,70,100,20);
		
		add(tituloOrigem);
		add(inputOrigem);

		tituloLoja.setText("Loja: ");
		tituloLoja.setBounds(20 ,100,100,20);
		inputLojas.setBounds(80,100,100,20);
		
		add(tituloLoja);
		add(inputLojas);
		
		tituloHorario.setText("Horario: ");
		tituloHorario.setBounds(20 ,130,100,20);
		inputHorario.setBounds(80,130,100,20);
		
		add(tituloHorario);
		add(inputHorario);
		
		botaoAdicionar.setText("Programar");
		botaoAdicionar.setBounds(400, 150, 150, 50);
		botaoAdicionar.setFont(new Font("Arial", Font.BOLD, 20));
		botaoAdicionar.setForeground(new Color(10,10,10));
		botaoAdicionar.setBackground(new Color(224,224,224));

		botaoLimpar.setText("Cancelar");
		botaoLimpar.setBounds(600, 150, 150, 50);
		botaoLimpar.setFont(new Font("Arial", Font.BOLD, 20));
		botaoLimpar.setForeground(new Color(10,10,10));
		botaoLimpar.setBackground(new Color(224,224,224));
		
		add(botaoAdicionar);
		add(botaoLimpar);
		
		String [] colunas = {"Status" ,"Motorista", "Veiculo", "Origem", "Loja"};
		
		Object [] [] dados = {
				{"Em Carregamento","Adriano E", "FDC1A50", "CD MAMBO", "M2 - LEOPOLDINA"},
				{"Cancelada","AUGUSTINHO", "FNF5524", "CD MAMBO", "M3 - VL.ROMANA"},
				{"Em Transito - Loja","FABIO", "FDC5546", "CD MAMBO", "M5 - BROOKLIN"}
		};
		
		
		
		JTable tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(80, 220, 600, 100);
		add(barraRolagem);


		
	}
	
}
