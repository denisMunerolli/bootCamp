package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descriçao do curso");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descriçao do curso de Js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Descriçao do curso de java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
		
		
	}

}
