package br.com.joelamalio.livro.capitulo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.joelamalio.livro.capitulo2.Usuario;

public class Capitulo5 {
	
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("Pedro", 140);
		Usuario usuario2 = new Usuario("Roberta", 120);
		Usuario usuario3 = new Usuario("Gabriel", 180);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		System.out.println("Ordenando por nome:");
		usuarios.sort(Comparator.comparing(u -> u.getNome()));
		usuarios.forEach(u -> System.out.println(u.getNome()));

		System.out.println("\nOrdenando por pontos:");
		usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		System.out.println("\nOrdenando por ordem natural:");
		List<String> nomes = Arrays.asList("Pedro", "José", "Amanda", "Bruno", "Zoraide", "Rafaela");
		nomes.sort(Comparator.naturalOrder());
		nomes.forEach(nome -> System.out.println(nome));

		System.out.println("\nOrdenando por ordem reversa:");
		nomes.sort(Comparator.reverseOrder());
		nomes.forEach(nome -> System.out.println(nome));
	}

}
