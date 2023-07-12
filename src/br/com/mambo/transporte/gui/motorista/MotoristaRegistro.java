package br.com.mambo.transporte.gui.motorista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.mambo.transporte.model.Motorista;

public class MotoristaRegistro  extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextField inputNome = new JTextField();
	JTextField inputNomeCompleto = new JTextField();
	JTextField inputTelefone = new JTextField();
	
	JLabel labelNome = new JLabel();
	JLabel labelNomeCompleto = new JLabel();
	JLabel labelTelefone = new JLabel();
	
	public MotoristaRegistro() {
		setVisible(true);
		setSize(800,500);
		setTitle("Registra Motorista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JButton buttonAdicionar = new JButton("Adicionar");
		buttonAdicionar.setBounds(400, 300, 130, 60);
		buttonAdicionar.setFont(new Font("Arial", Font.BOLD, 20));
		buttonAdicionar.setForeground(new Color(10,10,10));
		buttonAdicionar.setBackground(new Color(224,224,224));

		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(600, 300, 130, 60);
		buttonCancelar.setFont(new Font("Arial", Font.BOLD, 20));
		buttonCancelar.setForeground(new Color(10,10,10));
		buttonCancelar.setBackground(new Color(224,224,224));

		add(buttonAdicionar);
		add(buttonCancelar);
		
		buttonAdicionar.addActionListener(this::adicionar);
		buttonCancelar.addActionListener(this::test);
		
		labelNome.setText("Nome: ");
		labelNome.setBounds(40,10,100,30);
		labelNome.setFont(new Font("Arial", Font.PLAIN, 18));
		inputNome.setBounds(100,10,400,30);
		inputNome.setFont(new Font("Arial", Font.PLAIN, 18));
		
		labelNomeCompleto.setText("Completo: ");
		labelNomeCompleto.setBounds(40,60,90	,30);
		labelNomeCompleto.setFont(new Font("Arial", Font.PLAIN, 18));
		inputNomeCompleto.setBounds(130,60,400,30);
		inputNomeCompleto.setFont(new Font("Arial", Font.PLAIN, 18));
		
		labelTelefone.setText("Telefone: ");
		labelTelefone.setBounds(40,120,100,30);
		labelTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		inputTelefone.setBounds(120,120,400,30);
		inputTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		
		add(labelNome);
		add(inputNome);
		add(labelNomeCompleto);
		add(inputNomeCompleto);
		add(labelTelefone);
		add(inputTelefone);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MotoristaRegistro registro = new MotoristaRegistro();
	}

	private void test(ActionEvent actionevent1) {
		
		JOptionPane.showMessageDialog(null, "Erro ao cancelar", "Teste JOoption", JOptionPane.ERROR_MESSAGE);
	}

	private void adicionar(ActionEvent actionevent1) {
		Motorista motorista = new Motorista(inputNome.getText(), inputNomeCompleto.getText(), inputTelefone.getText());
		
		JOptionPane.showMessageDialog(null, motorista, "Teste JOoption", JOptionPane.WARNING_MESSAGE);
		inputNome.setText("");
		inputNomeCompleto.setText("");
		inputTelefone.setText("");
	}

}
