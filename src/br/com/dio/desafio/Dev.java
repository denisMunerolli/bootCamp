package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevInscrito().add(this);
		
	}
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluido.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		}else {
			System.err.println("Voçe não esta matriculado em nem um conteudo ainda!");
		}
		
	}
	public double calcularTotalXp() {
		return this.conteudosConcluido
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
				
	}
	
	
	
	public Set<Conteudo> getConteudosConcluido() {
		return conteudosConcluido;
	}
	public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
		this.conteudosConcluido = conteudosConcluido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}
	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}
	public Set<Conteudo> getConcluidoConteudos() {
		return conteudosConcluido;
	}
	public void setConcluidoConteudos(Set<Conteudo> concluidoConteudos) {
		conteudosConcluido = concluidoConteudos;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass() )
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluido, other.conteudosConcluido)
				&& Objects.equals(conteudoInscrito, other.conteudoInscrito) && Objects.equals(nome, other.nome);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluido, conteudoInscrito, nome);
	}
	

}
