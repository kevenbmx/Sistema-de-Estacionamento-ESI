

public class Cliente extends Pessoa {
	public Cliente(String nome, int num_vaga){
		super(nome, num_vaga);
	}
	
	private int mensalista;
	//public String carro;
	
	public String getNome(){
		return nome;
	}
	
	
}
