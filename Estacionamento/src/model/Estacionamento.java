package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Estacionamento {
	
	ArrayList<Veiculo> lista_carros = new ArrayList<>();
	//int Vagas [] = new int [9];
	
	public int num_Carros () {
		return lista_carros.size();
	}
	
	public void adiciona_Veiculo (Veiculo veiculo) {
		if (lista_carros.size() > 9) { 
			System.out.println("Estacionamento Lotado!!!");
			return;
		}
		lista_carros.add(veiculo);
		hora_Entrada(veiculo);
	}
	
	
	public static Date hora_Entrada (Veiculo veiculo) {
		Date entrada = new Date();
		Calendar calendar = Calendar.getInstance();
		/*Calendar cal = new GregorianCalendar();				
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	    System.out.println(sdf.format(cal.getTime()));
		return sdf; */
		return entrada;
	}
	
	public static Date hora_Saida (Veiculo veiculo) {
		Date saida = new Date();
		Calendar calendar = Calendar.getInstance();
		return saida;
	}
	
	// 1 hora = 3600000 ms 
	 
	public float valor_Final (Veiculo veiculo) {
		Date Entrada = hora_Entrada(veiculo);
	    Date Saida = hora_Saida(veiculo);
	    Calendar calendar = Calendar.getInstance();
	   // float horas = calendar.setTimeInMillis(Entrada.getTime() - Saida.getTime());
	//	return (float)(calendar.getTimeInMillis()());
	    return 0;
		
	}
	
}