package br.com.joelamalio.lab04.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploStream {
	public static void main(String[] args) {
		List<Profissao> profissoes = new ArrayList<Profissao>();

		profissoes.add(new Profissao("Programador", 2000));
		profissoes.add(new Profissao("Analista de Sistema", 3850));
		profissoes.add(new Profissao("Psicólogo", 2500));
		profissoes.add(new Profissao("Professor", 1200));
		profissoes.add(new Profissao("Diretor", 10000));

		profissoes.sort(Comparator.comparingInt(Profissao::getSalario));

		int soma = profissoes.stream().filter(p -> p.getSalario() > 3000).mapToInt(Profissao::getSalario).sum();
		
		System.out.println(soma);
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