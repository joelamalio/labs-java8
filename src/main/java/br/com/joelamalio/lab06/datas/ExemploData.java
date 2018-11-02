package br.com.joelamalio.lab06.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExemploData {

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Hoje é dia " + agora.format(formatador));
		
		LocalDate aniversario = LocalDate.of(1986, Month.DECEMBER, 8);
		System.out.println("Aniversário: " + aniversario.format(formatador));
		
		Period periodo = Period.between(aniversario, agora);
		System.out.println("Idade: " + periodo.getYears());
	}
	
}
