package br.com.joelamalio.lab02.interfacefuncional;

import java.util.ArrayList;
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
		
		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		lista.forEach(s -> System.out.println(s));
	}

}