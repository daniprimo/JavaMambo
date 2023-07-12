package br.com.mambo.transporte.manipulacao.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MotoristaFile {
	
	public static void main(String[] args) throws IOException {
		Path diretorio = Paths.get("C:/Users/Daniel Lopes/Downloads/Documents"); 
		Path arquivo = Paths.get("C:/Users/Daniel Lopes/Downloads/Documents/Daniel-Lopes.pdf"); 

		
		if (Files.isDirectory(diretorio)) {
			System.out.println("Diretorio existe.");
		}else {
			System.out.println("Diretorio não existe.");
		}
		
		if (Files.exists(diretorio)) {
			System.out.println("Arquivo existe.");
		}else {
			System.out.println("Arquivo não existe.");
		}
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		for (String string : linhas) {
			System.out.println(string);
		}
	}
	
}
