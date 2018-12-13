package br.com.joelamalio.livro.capitulo3;

public class Capitulo3 {

	public static void main(String[] args) {
		
		Validador<String> validadorCep = cep -> cep.matches("[0-9]{5}-[0-9]{3}");
		
		System.out.println(validadorCep.valida("41876-123"));
		System.out.println(validadorCep.valida("418761230"));
		
	}
	
}
