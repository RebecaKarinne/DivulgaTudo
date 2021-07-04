package br.com.proway.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import br.com.proway.model.Anuncio;

public class CadastroAnuncio {
	
	public void adicionaAnuncio(Anuncio anuncio) throws ParseException{
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Qual o nome que o an�ncio ter�?");
	anuncio.setNomeAnuncio(scanner.nextLine());
	
	System.out.println("Qual o seu nome completo?");
	anuncio.setNomeCliente(scanner.nextLine());
	
	System.out.println("Qual a data de in�cio do an�ncio?");
	anuncio.setDtInicio(scanner.nextLine()) ;
	DateFormat dfI = new SimpleDateFormat("dd/MM/yyyy");
	Date dateI = dfI.parse(anuncio.getDtInicio());
	
	System.out.println("Qual a data de t�rmino do an�ncio?");
	anuncio.setDtFinal(scanner.nextLine());
	DateFormat dfT = new SimpleDateFormat("dd/MM/yyyy");
	Date dateT = dfT.parse(anuncio.getDtFinal());
	
	System.out.println("Qual ser� o investimento di�rio?");
	anuncio.setInvestimentoDiario(scanner.nextInt());
	
	calculaValor(dateI, dateT, anuncio.getInvestimentoDiario());
	}
	
	public int calculaValor(Date dateI, Date dateT, int investDiario){
		long diff = dateT.getTime() - dateI.getTime(); 
		TimeUnit time = TimeUnit.DAYS;
		long diffResult = time.convert(diff, TimeUnit.MILLISECONDS);
		int valorTI = (int) (diffResult * investDiario);
		return valorTI;
	}
	
	public long calculaTempo(Date dateI, Date dateT){
		long diff = dateT.getTime() - dateI.getTime(); 
		TimeUnit time = TimeUnit.DAYS;
		long diffResult = time.convert(diff, TimeUnit.MILLISECONDS);
		return diffResult;
	}
}
