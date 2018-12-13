package br.com.joelamalio.livro.capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {
	
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Pedro", 140);
		Usuario usuario2 = new Usuario("Roberta", 120);
		Usuario usuario3 = new Usuario("Gabriel", 180);
		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);
		
		System.out.println("Execução do lambda com variável temporária:");
		Consumer<Usuario> mostrador = u -> System.out.println(u.getNome());
		usuarios.forEach(mostrador);
		
		System.out.println("Execução direta do lambda:");
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
	}

}
