package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Resposta;
import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;


public class RespostaDto {
	
	
	private Long id;
	private String mensagem;
	private LocalDateTime dataCricao;
	private String nomeAutor; 
	
	public RespostaDto(Resposta reposta) {
		
		this.id = reposta.getId();
		this.mensagem = reposta.getMensagem();
		this.dataCricao =  reposta.getDataCriacao();
		this.nomeAutor = reposta.getAutor().getNome();
		
		
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setDataCricao(LocalDateTime dataCricao) {
		this.dataCricao = dataCricao;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCricao() {
		return dataCricao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

}
