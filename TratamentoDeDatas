package Exercicio1;
import java.time.LocalDate;

public class TratamentoDeDatas {
	
	private LocalDate data;
	private int dia;
	private int mes;
	private int ano;
	
	public TratamentoDeDatas(LocalDate dataDigitada){
		data = dataDigitada;
		dia = dataDigitada.getDayOfMonth();
		mes = dataDigitada.getMonthValue();
		ano = dataDigitada.getYear();
	}
	
	public boolean verificaBissexto()
	{
		if(ano % 400 == 0)
			return true;
		
        else if((ano % 4 == 0) && (ano % 100 != 0))
        	return true;
            
        else
        	return false;
	}
	
	public boolean verificaParidade()
	{
		if (ano % 2 == 0)
			return true;
		 else
			return false;
	}
	
	public String comparacaoDataAtual(){
		if(data.isAfter(LocalDate.now())) return "A data é após a data atual";
		else if(data.isBefore(LocalDate.now())) return "A data é anterior a data atual";
		else return "A data digitada é a atual";
	}
	
	public int diasCorridos() {
		return data.getDayOfYear();
	}
	
	public String diaDaSemana() {
		
		switch(data.getDayOfWeek().getValue()) {
		case 1: return "Segunda-Feira";
		case 2: return "Terça-Feira";
		case 3: return "Quarta-Feira";
		case 4: return "Quinta-Feira";
		case 5: return "Sexta-Feira";
		case 6: return "Sábado";
		case 7: return "Domingo";
		}
		
		return null;
	}
	
	public int diferencaFinalDoAno()
	{
		if(verificaBissexto() == true)
			return 366 - diasCorridos();
		else
			return 365 - diasCorridos();
	}
	
	public int getDia(){
		return dia;
	}	
	public int getMes(){
		return mes;
	}
	public int getAno(){
		return ano;
	}
}
