package br.com.proway.model;

import java.util.Date;

public class Anuncio {
	
	public int qtdVisualizacao;
	public int qtdClick;
	public int qtdCompart;
	public int qtdVisuCompartilhamento;
	public int qtdMax;
	public String nomeAnuncio;
	public String nomeCliente;
	public String dtInicio;
	public String dtFinal;
	public int investimentoDiario;
	
	public String getNomeAnuncio() {
		return nomeAnuncio;
	}
	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int getInvestimentoDiario() {
		return investimentoDiario;
	}
	public void setInvestimentoDiario(int investimentoDiario) {
		this.investimentoDiario = investimentoDiario;
	}
	public int getQtdVisualizacao() {
		return qtdVisualizacao;
	}
	public void setQtdVisualizacao(int qtdVisualizacao) {
		this.qtdVisualizacao = qtdVisualizacao;
	}
	public int getQtdClick() {
		return qtdClick;
	}
	public void setQtdClick(int qtdClick) {
		this.qtdClick = qtdClick;
	}
	public int getQtdCompart() {
		return qtdCompart;
	}
	public void setQtdCompart(int qtdCompart) {
		this.qtdCompart = qtdCompart;
	}
	public int getQtdVisuCompartilhamento() {
		return qtdVisuCompartilhamento;
	}
	public void setQtdVisuCompartilhamento(int qtdVisuCompartilhamento) {
		this.qtdVisuCompartilhamento = qtdVisuCompartilhamento;
	}
	public int getQtdMax() {
		return qtdMax;
	}
	public void setQtdMax(int qtdMax) {
		this.qtdMax = qtdMax;
	}
	public String getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}
	public String getDtFinal() {
		return dtFinal;
	}
	public void setDtFinal(String dtFinal) {
		this.dtFinal = dtFinal;
	}
	
	
	
	
	

}
