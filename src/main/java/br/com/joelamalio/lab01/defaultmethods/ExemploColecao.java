package br.com.joelamalio.lab01.defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExemploColecao {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Professor");
		lista.add("Cantor");
		lista.add("Cirugi�o");
		lista.add("Programador");
		lista.add("Diretor");
		lista.add("Enfermeira");
		
		OrdenacaoPorTamanho ordenacaoPorTamanho = new OrdenacaoPorTamanho();
		lista.sort(ordenacaoPorTamanho);
		
		ImprimirLinhaNoConsole imprimirLinhaNoConsole = new ImprimirLinhaNoConsole();
		lista.forEach(imprimirLinhaNoConsole);
	}

}

class OrdenacaoPorTamanho implements Comparator<String> {
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
}

class ImprimirLinhaNoConsole implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s);
	}
}