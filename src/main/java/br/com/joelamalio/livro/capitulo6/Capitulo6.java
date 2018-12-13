package br.com.joelamalio.livro.capitulo6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.joelamalio.livro.capitulo2.Usuario;

public class Capitulo6 {
	
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("Pedro", 140);
		Usuario usuario2 = new Usuario("Roberta", 120);
		Usuario usuario3 = new Usuario("Gabriel", 110);
		Usuario usuario4 = new Usuario("Zoraide", 20);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
		System.out.println("Ordenando por nome:");
		usuarios.sort(Comparator.comparing(Usuario::getNome));
		usuarios.forEach(u -> System.out.println(u.getNome()));

		System.out.println("\nOrdenando por pontos:");
		usuarios.sort(Comparator.comparingInt(Usuario::getPontos));
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
	}

}
