package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private Curso curso;
	
	
	
	
	
	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public TopicoDto(Topico topico) {
		
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		this.curso = topico.getCurso();
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Long getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	
	public static  List<TopicoDto> converter(List<Topico> topicos) {
		
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
		
	}
	
	
	

}
