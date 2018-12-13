package br.com.joelamalio.livro.capitulo4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import br.com.joelamalio.livro.capitulo2.Usuario;

public class Capitulo4 {
	
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("Pedro", 140);
		Usuario usuario2 = new Usuario("Roberta", 120);
		Usuario usuario3 = new Usuario("Gabriel", 180);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		Consumer<Usuario> exibirMensagem = u -> System.out.print("Processamento 1 ... ");
		
		Consumer<Usuario> exibirNome = u -> System.out.println("Processamento 2 com nome " + u.getNome());
		
		usuarios.forEach(exibirMensagem.andThen(exibirNome));
		
		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			public boolean test(Usuario u) {
				return u.getPontos() > 150;
			}
		};
		
		usuarios.removeIf(predicado);

		System.out.println("\nUsuários com pontuação menor do que 150:");
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
	}

}
