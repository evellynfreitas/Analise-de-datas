package Exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio1 {
	
  public static void main(String[] args){
	  
	  Scanner teclado = new Scanner(System.in);
    
	  
	  String entrada;
	  
	  boolean entradaValida;
	  
	  
	  DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	  LocalDate data = null;
	  
	  do
	  {
		  entradaValida = true;
		  System.out.println("Insira uma data no formato dd/MM/aaaa:");
		  entrada = teclado.nextLine();
		  
		  try {data = LocalDate.parse(entrada, formato);}
		  catch(Exception ex){
			  System.out.println("Data inválida!");
			  entradaValida = false;
		  }
		  
	  } while(entradaValida == false);
	  
	  
    
	  TratamentoDeDatas obj = new TratamentoDeDatas(data);
	  
	  
	  if(obj.verificaBissexto() == true)
		  System.out.println("Ano Bissexto? Sim");
	  else
		  System.out.println("Ano Bissexto? Não");
	  
	  if(obj.verificaParidade() == true)
		  System.out.println("Ano Par? Sim");
	  else
		  System.out.println("Ano Par? Não");
	  
	  
	  System.out.println("Dias corridos: " + obj.diasCorridos());
	  System.out.println("Dia da semana: " + obj.diaDaSemana());
	  System.out.println("Dias para acabar o ano: " + obj.diferencaFinalDoAno());
    
	  
	  System.out.println(obj.comparacaoDataAtual());

	  teclado.close();
  	}
}
