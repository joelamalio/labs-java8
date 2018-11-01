package br.com.joelamalio.lab05.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
	public static void main(String[] args) {
		List<Profissao> profissoes = new ArrayList<Profissao>();

		profissoes.add(new Profissao("Programador", 2000));
		profissoes.add(new Profissao("Analista de Sistema", 3850));

		profissoes.sort(Comparator.comparingInt(Profissao::getSalario));

		// imprime o nome
		profissoes.stream().filter(p -> p.getSalario() > 3000).findAny().ifPresent(p -> System.out.println(p.getNome()));
		
		// Não gera erro mesmo sem existir valor
		profissoes.stream().filter(p -> p.getSalario() > 4000).findAny().ifPresent(p -> System.out.println(p.getNome()));
		
		// imprime a lista
		profissoes.stream().filter(p -> p.getSalario() > 1000).collect(Collectors.toList()).forEach(p -> System.out.println(p.getNome()));
	}
}

class Profissao {

	public Profissao(String nome, int salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	private String nome;
	private int salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}