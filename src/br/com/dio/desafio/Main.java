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
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devDenis = new Dev();
		devDenis.setNome("Denis");
		devDenis.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo inscrito Denis: " + devDenis.getConteudoInscrito());
		devDenis.progredir(); 
		devDenis.progredir();
		System.out.println("..");
		System.out.println("Conteudo inscrito Denis: " + devDenis.getConteudoInscrito());
		System.out.println("Conteudo concluido de Denis: " + devDenis.getConteudosConcluido());
		System.out.println("XP: " + devDenis.calcularTotalXp());
		
		System.out.println("..........");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo inscrito Joao: " + devJoao.getConteudoInscrito());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("..");
		System.out.println("Conteudo inscrito Joao: " + devJoao.getConteudoInscrito());
		System.out.println("Conteudo concluido de Joao: " + devJoao.getConteudosConcluido());		
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
	}

}
