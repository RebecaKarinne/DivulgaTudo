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
		System.out.println("*Ol�, seja bem vindo � calculadora de alcance de an�ncios da ag�ncia Divulga Tudo!*");
		System.out.println("***********************************************************************************");
		System.out.println();
		System.out.println("Qual o valor a ser investido?");
		Double valorInv = scanner.nextDouble();
		calculadoraAnuncio.calcularAnuncio(anuncio,valorInv);
		
		System.out.println("Visualiza��es no an�ncio original: " + anuncio.getQtdVisualizacao());
		System.out.println("Quantidades de cliques: " + anuncio.getQtdClick());
		System.out.println("Quantidade de compartilhamentos: " + anuncio.getQtdCompart());
		System.out.println("Quantidade de visualiza��es por compartilhamento: " + anuncio.getQtdVisuCompartilhamento());
		
		System.out.println("********************************************************************************************************************");
		
		System.out.println("A quantidade M�XIMA de pessoas que visualizar�o o seu an�ncio (tanto original, como os compartilhamentos) ser� de: " + anuncio.getQtdMax());

	}

}
