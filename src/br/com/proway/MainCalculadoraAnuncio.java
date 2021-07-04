package br.com.proway;

import java.util.Scanner;

import br.com.proway.model.Anuncio;
import br.com.proway.service.CalculadoraAnuncio;

public class MainCalculadoraAnuncio {

	public static void main(String[] args) {
		CalculadoraAnuncio calculadoraAnuncio = new CalculadoraAnuncio();
		Anuncio anuncio = new Anuncio();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************************************************************************");
		System.out.println("*Olá, seja bem vindo à calculadora de alcance de anúncios da agência Divulga Tudo!*");
		System.out.println("***********************************************************************************");
		System.out.println();
		System.out.println("Qual o valor a ser investido?");
		Double valorInv = scanner.nextDouble();
		calculadoraAnuncio.calcularAnuncio(anuncio,valorInv);
		
		System.out.println("Visualizações no anúncio original: " + anuncio.getQtdVisualizacao());
		System.out.println("Quantidades de cliques: " + anuncio.getQtdClick());
		System.out.println("Quantidade de compartilhamentos: " + anuncio.getQtdCompart());
		System.out.println("Quantidade de visualizações por compartilhamento: " + anuncio.getQtdVisuCompartilhamento());
		
		System.out.println("********************************************************************************************************************");
		
		System.out.println("A quantidade MÁXIMA de pessoas que visualizarão o seu anúncio (tanto original, como os compartilhamentos) será de: " + anuncio.getQtdMax());

	}

}
