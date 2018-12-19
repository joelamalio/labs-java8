package br.com.joelamalio.livro.capitulo8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.joelamalio.livro.capitulo2.Usuario;

public class Capitulo8 {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("Pedro", 140);
		Usuario usuario2 = new Usuario("Roberta", 120);
		Usuario usuario3 = new Usuario("Gabriel", 110);
		Usuario usuario4 = new Usuario("Zoraide", 20);
		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3, usuario4);
		
		List<Usuario> filtrados = usuarios.stream()
			.filter(u -> u.getPontos() > 100)
			.sorted(Comparator.comparing(Usuario::getNome))
			.collect(Collectors.toList());
		
		System.out.println("Lista dos filtrados:");
		filtrados.forEach(u -> System.out.println(u.getNome()));
		
		Optional<Usuario> usuarioOptional = usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				.findAny();
		System.out.println("\nUsuário aleatório: " + usuarioOptional.get().getNome());
		
		System.out.print("Usando peek: ");
		usuarios.stream()
		.filter(u -> u.getPontos() > 100)
		.peek(u -> System.out.println(u.getNome()))
		.findAny();
	}
	
}
