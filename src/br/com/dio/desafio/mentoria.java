package br.com.dio.desafio;

import java.time.LocalDate;

public class mentoria {
	
	
	private String titulo;
	private String 	descricao;
	private int cargaHoraria;
	private LocalDate data;
	
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "mentoria [titulo=" + titulo + 
			   ", descricao=" + descricao + 
			   ", cargaHoraria=" + cargaHoraria + 
			   ", data="
				+ data + "]";
	}
	
	
	
	
	
}
