package br.com.proway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import br.com.proway.model.Anuncio;
import br.com.proway.service.CadastroAnuncio;

public class MainCadastroAnuncio {

	public static void main(String[] args) throws ParseException {
		CadastroAnuncio cadastroAnuncio = new CadastroAnuncio();
		Anuncio anuncio = new Anuncio();
		
		cadastroAnuncio.adicionaAnuncio(anuncio);
		
		System.out.println("*******************************************");
		System.out.println("* O resultado do seu anúncio é:           *");
		System.out.println("*******************************************");
		
		System.out.println();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dateT = formato.parse(anuncio.getDtFinal());
		Date dateI = formato.parse(anuncio.getDtInicio());
		
		long diff = dateT.getTime() - dateI.getTime(); 
		TimeUnit time = TimeUnit.DAYS;
		long diffResult = time.convert(diff, TimeUnit.MILLISECONDS);
		int valorTI = (int) (diffResult * anuncio.getInvestimentoDiario());
		
		
		
		System.out.println("Prezado " + anuncio.getNomeCliente() + ", seu anúncio " + anuncio.getNomeAnuncio() + " irá veicular por " + diffResult + " dias");
		System.out.println("O valor total investido no anúncio será de : " + valorTI);
		
		 
	}
}
