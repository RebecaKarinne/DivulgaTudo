package br.com.proway.service;

import br.com.proway.model.Anuncio;

public class CalculadoraAnuncio {

	public void calcularAnuncio(Anuncio anuncio, Double valorInv) {
		anuncio.setQtdVisualizacao((int) (valorInv * 30));
		anuncio.setQtdClick((anuncio.getQtdVisualizacao() / 100) * 12);
		anuncio.setQtdCompart((anuncio.getQtdClick() / 20) * 3);
		anuncio.setQtdVisuCompartilhamento(anuncio.getQtdCompart() * 40);
		anuncio.setQtdMax(anuncio.getQtdVisualizacao() + anuncio.getQtdVisuCompartilhamento());
	}

}
