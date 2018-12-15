package br.com.joelamalio.livro.capitulo7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import br.com.joelamalio.livro.capitulo2.Usuario;

public class Capitulo7 {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("Pedro", 140);
		Usuario usuario2 = new Usuario("Roberta", 120);
		Usuario usuario3 = new Usuario("Gabriel", 110);
		Usuario usuario4 = new Usuario("Zoraide", 20);
		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3, usuario4);
		usuarios.sort(Comparator.comparingInt(Usuario::getPontos).reversed());
		
		usuarios.subList(0, 2).forEach(Usuario::tornarModerador);
		
		List<Usuario> moderadores = usuarios
			.stream()
			.filter(Usuario::isModerador)
			.collect(Collectors.toList());
		
		System.out.println("Lista dos moderadores:");
		moderadores.forEach(u -> System.out.println(u.getNome()));
		
		System.out.println("\nLista das pontuações:");
		usuarios.stream().map(Usuario::getPontos).collect(Collectors.toList()).forEach(System.out::println);
		
		OptionalDouble media = usuarios.stream().mapToInt(Usuario::getPontos).average();
		
		System.out.println("\nMédia: " + media.getAsDouble());
		
	}
	
}
