

import java.util.ArrayList;

public class Estacionamento {
	
	ArrayList<Veiculo> lista_carros = new ArrayList<>();
	
	public int num_Carros () {
		return lista_carros.size();
	}
	
	public void adiciona_Veiculo (Veiculo veiculo) {
		if (num_Carros() > 10) { 
			System.out.println("Estacionamento Lotado!!!");
			return;
		}
		lista_carros.add(veiculo);
		System.out.println("Carro adicionado com sucesso");
	}
}
