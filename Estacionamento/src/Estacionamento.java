

import java.util.ArrayList;

public class Estacionamento {
	
	ArrayList<Veiculo> lista_carros = new ArrayList<>();
	
	public int num_Carros () {
		return lista_carros.size();
	}
	
	public void adiciona_Veiculo (Veiculo veiculo) {
		if (lista_carros.size() > 9) { 
			System.out.println("Estacionamento Lotado!!!");
			return;
		}
		lista_carros.add(veiculo);
	}
}