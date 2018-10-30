package br.com.joelamalio.lab03.methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploColecao {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Professor");
		lista.add("Cantor");
		lista.add("Cirugião");
		lista.add("Programador");
		lista.add("Diretor");
		lista.add("Enfermeira");
		
		lista.sort(Comparator.comparing(String::length));
		
		lista.forEach(System.out::println);
	}

}